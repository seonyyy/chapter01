package chapter01;

import java.util.Scanner;

public class WhieTest03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int sum = 0;
		while( true ) {
			System.out.print( "숫자입력[0 to Quit] > " );
			int value = scanner.nextInt();

			if( value == 0 ) {
				break;
			}
			
			sum += value;
		}
		System.out.println( sum );
		scanner.close();

	}

}
