/*
 * 좌표값 x, y를 가지는 객체의 구성 예
 * 작성날짜 2022-05-01
 * 작성자 조한별
 */
class Point { // package 접근
	private int pos_x; // x 좌표를 저장하기 위한 변수
	private int pos_y;
	
	public int getPos_x() { 
		return pos_x;
	} // getter, 접근자
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	} // 수정자, setter
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	public void moveBy(int x, int y) {
		this.pos_x += x;
		this.pos_y += y;
	} // 필요에 따라 만들어 지는 기타 메소드
	// 객체에 대한 정보를 문자열로 얻기 위한 메소드 toString
	public String toString() {
		return "Point x: " + pos_x + " y: " + pos_y;
	}
}

public class Example1 {
	public static void main(String[] args) {
		
		Point p = new Point();
		p.setPos_x(10);
		p.setPos_y(20);
		
		System.out.println(p.toString());
		p.moveBy(10, -5);
		System.out.println( p ); // 객체를 출력하면 toString이 호출
	}
}
