/*
 * 사각형의 높이 길이 넓이를 가지는 박스를 표현하기 위한 클래스 설계
 * 작성일자: 2022-05-06
 * 작성자: 조한별
 */
public class Box {
	// 클래스를 구성하는 변수 -> 멤버변수
	// (x,o) int height; // 접근 패키지접근 ( 같은 프로젝트에서는 public )
	private int height; // 초기 값이 명확하다면 저장가능, 아니면 초기값이 없어도 됨
	private int length; // box 길이
	private int width;
	
	public Box() { // Box b1 = new Box();
		
	}
	public Box(int height, int length, int width) { // Box b2 = new Box(10,10,10)
		this.height = height;
		this.length = length;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getVolume() { // 계산 결과를 리턴하는 get 메서드
		return height * length * width; 
	}
	public String toString() {
		return "Box 정보 : 높이 - " + height + " 길이 - " + length + " 넓이 - " + width;
	}
}
