/*
 * point 클래스 테스트 클래스
 */
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(100,100);
		Pixel px = new Pixel(p1,100,200,150);
		Point p2 = new Point();
		Point p3 = new Point();
		
		System.out.println(Point.getCount());
		System.out.println(p1); // 자동으로 toString 호출
		if(p1.equals(p2)) {
			System.out.println("같은 좌표");
		}else
			System.out.println("다른 좌표");
		
		p2.moveBy(90, 90);
		
		if(p1.equals(p2)) {
			System.out.println("같은 좌표");
		}else
			System.out.println("다른 좌표");
		System.out.println("pixel 정보");
		System.out.println(px.toString());
	}

}
