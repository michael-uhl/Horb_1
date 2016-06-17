package a10_bufferedFileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Set<Long> aSet = new HashSet<>();
		aSet.add(1L);
		aSet.add(1L);
		System.out.println(aSet.size());

		BufferedWriter writer = new BufferedWriter(
				new FileWriter("res/fwe.txt"));
	
		writer.write("Hallo Universum.");
		writer.newLine();
		writer.write("Es geht mir sehr gut.");
		writer.flush();
		writer.close();
	}
	
	public String a(final String abc) {
		return abc;
	}
	
}
