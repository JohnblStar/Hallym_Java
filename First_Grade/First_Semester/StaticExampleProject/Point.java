/*
 * 차원 공간에서 하나의 점을 (x, y)좌표로 나타내는 Point 클래스
 * 작성일자: 2022-05-15
 * 작성자: 조한별(소융대 22학번)
 */
public class Point {
	 private int x; // 2차원 좌표계를 구성하는 정수형태의 x좌표
	 private int y; // 인스턴스 멤버변수
	 
	 private static int count; // 클래스 멤버변수 , 인스턴스 객체끼리 공유하고자 하는 변수
	 
	 public static final double PI = 3.14; // 대표적인 상수형 변수 PI
	 public static final int MAX_POSX = 1280;
	 public static final int MAX_POSY = 1024;
	 
	// 생성자 -> 초기화	설정자(setter) -> 값의 변경
	 public Point() { // point p = new Point();
		 this(10,10);
	 }
	 public Point(int x, int y) { // Point p = new Point(100,200); 
		 this.x = x;				// Point p = new Point(100); (x)
		 this.y = y;
		 count++;
	 }
	 public static int getCount() {
		 return count;
	 }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moveBy(int off_x, int off_y) {
		if(this.x+off_x > MAX_POSX) {
			System.out.println("범위를 벗어날 수 없습니다.");
			return;
		}else if(this.y+off_y > MAX_POSY) {
			System.out.println("범위를 벗어날 수 없습니다.");
			return;
		}
		this.x += off_x;
		this.y += off_y;
	}
	public String toString() {
		return "좌표값 : " + this.x + " , " + this.y;
	}
	public boolean equals(Object o) {
		if( this == o)
			return true;
		if( o == null)
			return false;
		if(this.getClass() != o.getClass())
			return false;
		
		Point p = (Point)o;
		
		if( this.x != p.x)
			return false;
		if( this.y != p.y)
			return false;
		
		return true;
	}
	
	
}
