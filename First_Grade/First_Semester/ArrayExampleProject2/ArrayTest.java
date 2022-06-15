/*
 * 배열 값과 배열의 총 합을 출력하기 위한 print메소드를 만들고 이를 활용하는 프로그램
 * 작성일자 : 2022-05-24
 * 작성자 : 소융대 22학번 조한별
 */
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int onDimArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int oneDimArray[] = new int[10];
		int otherArray[] = oneDimArray;
		// otherArray == onDimArray
		int sum = 0;
		
		for(int i = 0; i < oneDimArray.length; i++) {
			oneDimArray[i] = (i+1);
		}
		
		print(oneDimArray);
		sum = sumArray(oneDimArray);
		System.out.println("배열 합: " + sum);
	}
	
	public static void print(int otherArray[]) {
		
		for(int i = 0; i < otherArray.length; i++) {
			System.out.println("배열[" + i + "] = " + otherArray[i]);
		}
	}
	
	public static int sumArray(int otherArray[]) {
		int sum = 0;
		for(int i = 0; i < otherArray.length; i++) {
			sum += otherArray[i];
		}
		return sum;
	}
}
