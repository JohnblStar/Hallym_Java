
public class BoxPrint {

	public static void chOutPut(char ch, int size) {
		for( int i = 0; i < size; i++) {
			for( int j = 0; j < size; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
