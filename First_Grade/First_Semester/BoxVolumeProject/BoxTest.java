/*
 * 2개의 박스 객체를 생성 테스트하는 클래스
 * 작성일자: 2022-05-06
 * 작성자: 조한별
 */
public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(5,5,5);
		
		System.out.println(b1.toString() + "의 부피 = " + b1.getVolume());
		System.out.println(b2.toString() + "의 부피 = " + b2.getVolume());
		b1.setHeight(10);
		b1.setLength(10);
		b1.setWidth(10);
		System.out.println(b1.toString() + "의 부피 = " + b1.getVolume());
		System.out.println("멤버 변수에 대한 getter 호출");
		System.out.println(b1.getHeight() + " , " + b1.getLength() + " , " + b1.getWidth());
	}
}
