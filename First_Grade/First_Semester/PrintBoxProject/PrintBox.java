/*
 * 정수를 입력받아 그에 맞는 박스를 형성하는 프로그램
 * 작성일자: 2022-05-15
 * 작성자: 조한별(소융대 22학번)
 */
import java.util.*;
public class Answer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char inputChar =  '\0'; // private 키워드는 매서드 내에서는 안붙는다.
		int size = 0;
		
		System.out.print("반복할 문자를 입력하세요: ");
		inputChar = scan.next().charAt(0);
		System.out.print("반복할 사이즈를 입력하세요: ");
		size = scan.nextInt();
		
		/*
		for( int i = 0; i < size; i++) {
			for( int j = 0; j < size; j++) {
				System.out.print(inputChar);
			}
			System.out.println();
		}
		*/

		//chOutPut(inputChar, size); // static 객체
		Answer13.chOutPut(inputChar, size);
		// (x) this.chOutPut(...)
}
	public static void chOutPut(char ch, int size) {
		for( int i = 0; i < size; i++) {
			for( int j = 0; j < size; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
