/*
 * bmi 검사 프로그램 실행 클래스
 * 작성날짜 2022-05-01
 * 작성자 조한별
 */
public class ObesityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obesity o = new Obesity();
		o.setHeight(182.3);
		o.setWeight(65.7);
		System.out.println(o.toString() + " " + o.calcBmi() + " " + o.printBmi());
		o.setHeight(170);
		System.out.println(o.toString() + " " + o.printBmi());
		o.setWeight(94);
		System.out.println(o.toString() + " " + o.printBmi());

	}

}
