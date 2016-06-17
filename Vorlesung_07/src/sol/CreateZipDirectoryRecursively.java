package sol;

/*
Create Zip File From Directory recursively using ZipOutputStream Example
This Java example shows how create zip file from directory recursively
using Java ZipOutputStream class. This program also shows how to add
directory and sub-directories to zip file.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class CreateZipDirectoryRecursively {

public static void main(String args[])
{
        String sourceDir = "res";
        String zipFile = "zipdemo.zip";
       
        try
        {
                //create object of FileOutputStream
                FileOutputStream fout = new FileOutputStream(zipFile);
                         
                //create object of ZipOutputStream from FileOutputStream
                ZipOutputStream zout = new ZipOutputStream(fout);
               
                //create File object from source directory
                File fileSource = new File(sourceDir);
               
                addDirectory(zout, fileSource);
               
                //close the ZipOutputStream
                zout.close();
               
                System.out.println("Zip file has been created!");
               
        }
        catch(IOException ioe)
        {
                System.out.println("IOException :" + ioe);     
        }

}

private static void addDirectory(ZipOutputStream zout, File fileSource) {
       
        //get sub-folder/files list
        File[] files = fileSource.listFiles();
       
        System.out.println("Adding directory " + fileSource.getName());
       
        for(int i=0; i < files.length; i++)
        {
                //if the file is directory, call the function recursively
                if(files[i].isDirectory())
                {
                        addDirectory(zout, files[i]);
                        continue;
                }
               
                /*
                 * we are here means, its file and not directory, so
                 * add it to the zip file
                 */
               
                try
                {
                        System.out.println("Adding file " + files[i].getName());
                       
                        //create byte buffer
                        byte[] buffer = new byte[1024];
                       
                        //create object of FileInputStream
                        FileInputStream fin = new FileInputStream(files[i]);
                       
                        zout.putNextEntry(new ZipEntry(files[i].getPath()));
                 
                        /*
                         * After creating entry in the zip file, actually
                         * write the file.
                         */
                        int length;
                 
                        while((length = fin.read(buffer)) > 0)
                        {
                           zout.write(buffer, 0, length);
                        }
                 
                        /*
                         * After writing the file to ZipOutputStream, use
                         *
                         * void closeEntry() method of ZipOutputStream class to
                         * close the current entry and position the stream to
                         * write the next entry.
                         */
                 
                         zout.closeEntry();
                 
                         //close the InputStream
                         fin.close();
               
                }
                catch(IOException ioe)
                {
                        System.out.println("IOException :" + ioe);                             
                }
        }
       
}

}

/*
Output of this program would be
Adding directory examples
Adding directory FileIO
Adding directory WebFiles
Adding directory css
Adding file datagrid.css
Adding file graph.css
Adding directory jsps
Adding file Main.jtpl
Adding file Masthead.jspf
Adding file Welcome.jsp
Adding file WebFiles.zip
Adding file zipdemo.zip
Adding file nonav.log
Adding file ospreg.exe
Adding file servers.ini
Adding file setupisam.log
Adding file sourceFile1.doc
Adding file sourceFile2.doc
Zip file has been created!
*/