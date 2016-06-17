package sol;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FastFileSplitter {
    static long BYTE_TO_MB  = 1024 * 1024;
    static long BUFER_SIZE = 1024;

    public static void main(String[] args) throws Exception {
//        if (args.length < 3) {
//            System.out.println("splitter [fileName] [split size in MB] [out dir]");
//            System.exit(1);
//        }

        //create the local variables to be used in the rest of the application
        File inFile = new File("res/big.file");
        long partitionSize = 1440 * 1024;
        File outDir = new File(inFile.getParent());

        //create inital counters
        final long totalFileSize = inFile.length();

        FileChannel inChannel =  new FileInputStream(inFile).getChannel();

        long currentPosition = 0;
        int counter = 0;
        ByteBuffer buffer = ByteBuffer.allocateDirect((int)BUFER_SIZE);
        long start = System.currentTimeMillis();

        while(currentPosition < totalFileSize) {
            //get the out channel for the file - roughly is the "originalFileName.ext.n" where 'n' is the partition number
            FileChannel outChannel = getChannel(inFile, outDir, counter++); //init the out channel
            
            //the size of the nth partition
            long size = partitionSize;
            if ((currentPosition + partitionSize) >= totalFileSize) {
            	size = totalFileSize - currentPosition;
            }
            	
            //the end position of the nth partition
            long endPosition = currentPosition + size;

            //write partition in BUFFER_SIZE chunks
            while(currentPosition < endPosition) {
                //read the chunk into the buffer
                //long subSize = (currentPosition + BUFER_SIZE) < endPosition ? BUFER_SIZE : endPosition - currentPosition;
                long subSize = inChannel.read(buffer, currentPosition);
                
                //prepare for writing
                buffer.flip();
                
                //write
                outChannel.write(buffer);
                currentPosition += subSize;
                
                //clear the buffer - so we can write again
                buffer.clear();
            }

            outChannel.close();
        }

        System.out.println(System.currentTimeMillis() - start);

        inChannel.close();
    }


    private static FileChannel getChannel(File inFile, File outDir, int ctr) throws FileNotFoundException {
        return new FileOutputStream(new File(outDir, (inFile.getName() + "." + ctr))).getChannel();
    }
}