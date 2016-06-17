package exception.numberformat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	

		System.out.println("Please enter a number!");
		Scanner sc = new Scanner(System.in);
		

		
		int number = 0;
		while (number == 0) {
			/*
			try {
				number = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Type didn't match int. You have one more try.");
				sc.next();
				
			}
			*/
//			if (sc.hasNextInt()) {
//				number = sc.nextInt();
//			} else {
//				System.out.println("try again");
//				sc.next();
//			}
			
		}
		System.out.println(number * number);

		
		/*
		System.out.println("Please enter a string!");
		Scanner sc = new Scanner(System.in);		

		try {
			String input = sc.next();
			StringBuffer inputB = new StringBuffer(input);
			String inputReverse = inputB.reverse().toString();
			System.out.println(inputReverse);
		} catch (InputMismatchException e) {
			System.out.println("Type didn't match int. You have one more try.");
		}
		*/	

	}
}
