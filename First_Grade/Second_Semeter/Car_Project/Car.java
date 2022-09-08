 * 자동차 출고 및 시운전 프로그램
 * 작성일자 : 2022-09-06
 * 작성자 : 조한별
 */
import java.util.Scanner;
public class Car { // Car 클래스 생성
	
	Scanner scan = new Scanner(System.in);
	String brand; // 브랜드
	String carType; // 차량 종류
	String color; // 차량 색상
	int option;
	private int price; // 차량 가격
	int speed; // 현재 속도
	int maxSpeed; // 최대 속도
	int lowSpeed = 0; // 최소 속도
	int rpm; // 엔진 회전 수
	static boolean startEngine; // 엔진 시동 여부
	
	public Car(String brand, String carType, String color, int option, int price, int maxSpeed) { // 신품 차량 생산 정보 생성자
		this.brand = brand;
		this.carType = carType;
		this.color = color;
		this.option = option;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(int speed, int rpm, boolean startEngine) { // 운행 중 차량 정보 생성자
		this.speed = speed;
		this.rpm = rpm;
		this.startEngine = startEngine;
	}
	
	public int getPrice() { // 차량 금액 확인 메소드 (getter)
		return price;
	}
	
	public int setPrice(int i) { // 차량 금액 책정 변경 메소드
		return this.price + i;
	}

	public static boolean turnEngine() { // 시동 상태 변경 메소드
		if(startEngine == false) {
			System.out.println("시동을 켭니다.");
			return startEngine = true;
		} else {
			System.out.println("시동을 끕니다.");
			return startEngine  = false;
		}
	}
	
	public void changeBrand(String str) { // 브랜드 변경 메소드
		this.brand = str;
		System.out.println("변경된 차량 브랜드는 " + this.brand + "입니다.");
	}
	
	public void changeCarType(String str) { // 차량 종류 변경 메소드
		if (this.carType != "") {
			this.carType = str;
		} else {
			System.out.println("차량 종류가 정확히 입력되지 않았습니다.");
			System.out.println("현재 입력값을 차량 종류로 설정합니다");
			this.carType = str;
		}
		System.out.println("변경된 차량 종류는 " + this.carType + "입니다.");
	}
	
	public void changeCarColor(String str) { // 차량 색상 변경 메소드
		this.color = str;
		this.price = setPrice(10);
		System.out.println("변경된 색상은 " + this.color + "이고, 차량 가격은 " + getPrice() + "만원 입니다.");
	}
	
	public void changeOption(int i) { // 차량 옵션 변경 메소드
		if(i == this.option) {
			System.out.println("이미 적용된 옵션입니다.");
		} else {
			this.option = i;
			System.out.println("바뀐 옵션은 " + this.option + "입니다.");
			if(this.option == 1) {
				
			} else if(this.option == 2) {
				setPrice(30);
			} else if(this.option == 3) {
				setPrice(50);
			}
		}
	}
	
	public int changeMaxSpeed(int i) { // 최대 속도 변경 메소드
		return this.maxSpeed = i;
	}
	
	public void speedUp(int i) { // 현재 속도 증가 메소드
		this.speed += i;
	}
	
	public void speedDown(int i) { // 현재 속도 감소 메소드
		this.speed -= i;
	}
	
	public void rpmUp(int i) { // RPM 증가 메소드
		this.rpm += i;
	}
	
	public void rpmDown(int i) { // RPM 감소 메소드
		this.rpm -= i;
	}
}
