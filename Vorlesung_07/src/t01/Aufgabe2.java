package t01;

import java.io.IOException;
import java.io.Reader;

public class Aufgabe2 extends Reader {

	public static void main(String[] args){
		RandomWordsReader rwr = new RandomWordsReader();
		LineBreakAdder lba = new LineBreakAdder(rwr);
		
		Aufgabe2 a2 = new Aufgabe2(lba);
		try {
			int size = 500;
			char[] out = new char[size];			
			a2.read(out, 0, size);
			
			System.out.println(out);
			
			a2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}	
	
	private Reader in;
	private char[] tochange = {'f','u','c','k'};
	private char[] changeto = {'*','*','*','*'};
	
	public Aufgabe2(Reader in){
		super();
		this.in = in;
	}
	
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		in.read(cbuf, off, len);
		int z = 0;
		
		for(int i = 0; i<cbuf.length;i++){
			if ( (cbuf[i]==tochange[z]) && (z<tochange.length) ){
				if(z==3){
					cbuf[i-3]=changeto[z-3];
					cbuf[i-2]=changeto[z-2];
					cbuf[i-1]=changeto[z-1];
					cbuf[i] = changeto[z];
					
					z=0;
				}
				z++;				
			}
		}
		
		
		return 0;
	}

	@Override
	public void close() throws IOException {
		in.close();
	}
	
}
