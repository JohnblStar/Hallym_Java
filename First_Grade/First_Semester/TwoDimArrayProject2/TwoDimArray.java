/*
 * 비정형 배열을 만들고 출력하는 프로그램
 * 작성일자 : 2022-05-24
 * 작성자 : 소융대 22학번 조한별
 */
public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int twoDim[][] = new int[3][];
		int cnt = 1;
		/*
		twoDim[0] = new int[]{1,2,3};
		twoDim[1] = new int[]{4,5,6,7,8,9,10,11,12,13};
		twoDim[2] = new int[]{14, 15};
		*/
		
		twoDim[0] = new int[3];
		twoDim[1] = new int[10];
		twoDim[2] = new int[2];
		
		for(int i = 0; i < twoDim.length; i++) {
			for(int j = 0; j < twoDim[i].length; j++) {
				twoDim[i][j] = cnt++;
			}
		}
		
		for(int i = 0; i < twoDim.length; i++) {
			for(int j = 0; j < twoDim[i].length; j++) {
				System.out.print(twoDim[i][j] + " ");
			}
			System.out.println();
		}
		
 	}

}
