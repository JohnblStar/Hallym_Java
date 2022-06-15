/*
 * 2차원 배열을 프린트하는 메소드를 만들고 이를 활용하는 프로그램
 * 작성일자 : 2022-05-24
 * 작성자 : 소융대 22학번 조한별
 */
public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoDimArray[][] = {
				{4, 2, 1, 2, 3, 4, 5, 6, 7, 8},
				{1, 2, 4, 3, 5, 2, 6, 7, 8, 9},
				{3, 2, 4, 5, 2, 3, 4, 5, 3, 1}
		};
		
		printTwoDim(twoDimArray);
	}
	
	public static void printTwoDim(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("배열 [" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}

}
