/*
 * 테스트 클래스
 * Car 클래스 테스트
 * 작성일자 : 2022-09-06
 * 작성자 : 조한별
 */
public class CarTest {

	public static void main(String[] args) {
		
		Car newCar = new Car("기아", "", "하늘색", 1, 1000, 200); // 객체 생성
		
		newCar.turnEngine(); // 시동 켜기
		// 객체 인스턴스 출력
		System.out.println(newCar.brand);
		System.out.println(newCar.carType);
		System.out.println(newCar.color);
		System.out.println(newCar.option);
		System.out.println(newCar.getPrice());
		System.out.println(newCar.maxSpeed);
		
		newCar.turnEngine(); // 시동끄기
		
		System.out.println("-----------------");
		
		newCar.changeBrand("현대");
		newCar.changeCarType("SUV");
		newCar.changeCarColor("빨간색");
		newCar.changeOption(2);
		newCar.changeMaxSpeed(150);
		System.out.println(newCar.maxSpeed);
		
		System.out.println("-----------------");
		
		Car stayCar = new Car(100, 6, false);
		
		stayCar.turnEngine();
		stayCar.speedUp(10);
		System.out.println(stayCar.speed);
		stayCar.speedDown(10);
		System.out.println(stayCar.speed);
		stayCar.rpmUp(1);
		System.out.println(stayCar.rpm);
		stayCar.rpmDown(2);
		System.out.println(stayCar.rpm);
		stayCar.turnEngine();

	}
	
}
