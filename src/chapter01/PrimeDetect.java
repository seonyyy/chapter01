package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "소수인지 판단할 숫자:" );
		
		int number = scanner.nextInt();
		
		// 판단 알고리즘
		int i = 2;
		boolean isPrime = true;
		while( i < number ) {
			if( number % i == 0 ) {
				isPrime = false;
				break;
			}
			i++;
		}
		
		//출력
		if( isPrime ) {
			System.out.println( "소수입니다." );
		} else {
			System.out.println( "소수가 아닙니다." );
		}
	}
}
