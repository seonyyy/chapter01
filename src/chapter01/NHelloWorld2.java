package chapter01;

import java.util.Scanner;

public class NHelloWorld2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "count:");
		int count = scanner.nextInt();

		for(int i = 0; i < count; i++ ) {
			System.out.println( 
				"[" + (i+1) + "] Hello World"    );
		}
		
		scanner.close();
	}
}
