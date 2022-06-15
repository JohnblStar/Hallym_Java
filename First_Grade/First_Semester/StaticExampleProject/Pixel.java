/*
 * 설정된 RGB값을 보여주는 기능의 클래스
 */
public class Pixel {
	private Point p;
	private int r; // red	// private Color c; // class Color {private int r, private int g, private int b} 
	private int g; // green
	private int b; // blue
	
	private static int count;
	
	public Pixel(Point p, int r, int g, int b) {
		this.p = p;
		this.r = r;
		this.g = g;
		this.b = b;
		count++;
	}
	
	public Pixel() {
		this( new Point() , 0 , 0 , 0);
	}
	public void setRGB(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	public static int getCount() {
		return count;
	}
	public String toString() {
		return this.p.toString() + " 색상정보 : " + r + " , " + g + " , " + b;
	}
}
