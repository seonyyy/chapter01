package chapter01;

public class Gugudan02 {

	public static void main(String[] args) {
		
		for( int i = 1; i <= 9; i++ ) { // 곱해지는수 (단)
			//단 시작
			System.out.println( 
			"============ " + i + "단 ==========" );
			
			for( int j = 0; j <= 9; j++ ) { // 곱하는 수
				System.out.println( 
				i + " X " + j + " = " + (i*j) );
			}
		}
	}
}
