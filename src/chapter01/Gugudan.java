package chapter01;

public class Gugudan {

	public static void main(String[] args) {
		for( int i = 1; i <= 9; i++ ) {
			for( int j = 1; j <= 9; j++ ) {
				int result = j * i;
				
				System.out.print( j + " * " + i + " = " + result );
				System.out.print( "\t" );
			}
			
			System.out.print( "\n" );
		}
	}
}