/*
 * 신품 차량 출고 및 시운전 프로그램
 * 작성일자 : 2022-09-06
 * 작성자 : 조한별
 */
import java.util.*;

public class CarDevelopProgram {

	public static void goingMent() {
		System.out.println("본 프로그램은 신품 차량 출고 및 시운행 시뮬레이션 프로그램입니다.");
		System.out.println("개발자 조한별");
		System.out.println("-------------------------------------------------");
	}

	public static void main(String[] args) {

		int price = 0;
		boolean programStart = true;
		goingMent();

		Scanner scan = new Scanner(System.in);
		while (programStart) {
			String YN = null;
			boolean TF = true;

			System.out.println("초기 세팅을 작성해주세요.");

			System.out.print("브랜드: ");
			String brand = scan.next();
			String carType = null;
			while (TF) {
				System.out.print("차량 종류(트럭|세단|SUV|경차|오토바이): ");
				carType = scan.next();
				if (carType.equals("트럭") == true || carType.equals("세단") == true || carType.equals("SUV") == true
						|| carType.equals("경차") == true || carType.equals("오토바이") == true) { // 차량 종류 선택 유효성 검사
					if (carType.equals("트럭") == true) {
						price = 5000;
					} else if (carType.equals("세단") == true) {
						price = 3000;
					} else if (carType.equals("SUV") == true) {
						price = 4000;
					} else if (carType.equals("경차") == true) {
						price = 1000;
					} else if (carType.equals("오토바이") == true) {
						price = 500;
					}
				} else {
					System.out.println("차량 종류를 정확히 입력하세요.");
					continue;
				}
				break;
			}
			System.out.print("색상: ");
			String color = scan.next();
			int option = 0;
			while (TF) {
				System.out.print("옵션(1번|2번|3번): ");
				option = scan.nextInt();
				if (option == 1 || option == 2 || option == 3) { // 옵션 선택 유효성 검사
					if (option == 1) {
					} else if (option == 2) {
						price += 200;
					} else if (option == 3) {
						price += 300;
					}
				} else {
					System.out.println("차량 옵션을 정확히 입력하세요.");
					continue;
				}
				break;
			}
			int maxSpeed = 0;
			while (TF) {
				System.out.print("최고 속력(최소 100 | 최대 400): ");
				maxSpeed = scan.nextInt();
				if (maxSpeed < 100 || maxSpeed > 400) { // 최대 속력 결정 유효성 검사
					System.out.println("최대 속력은 최소 100km에서 최대 400km까지만 설정 가능합니다");
					continue;
				} else {
					break;
				}
			}

			System.out.println("-------------------------------------------------");
			System.out.println("선택하신 옵션입니다.");
			System.out.println("브랜드: " + brand);
			System.out.println("차량 종류: " + carType);
			System.out.println("색상: " + color);
			System.out.println("옵션: " + option + "번");
			System.out.println("최고 속력: " + maxSpeed);
			System.out.println("총 가격: " + price);
			System.out.println("-------------------------------------------------");

			Car newCar = new Car(brand, carType, color, option, price, maxSpeed);

			int speed = 100;
			int rpm = 6;
			boolean startEngine = true;
			String engine = null;

			System.out.print("시운전을 진행하시나요?(Y/N): ");
			YN = scan.next();
			if (YN.equals("Y")) {
				Car stayCar = new Car(speed, rpm, startEngine);
				String anser1 = null;
				String anser2 = null;

				while (startEngine) {
					System.out.println("현재 속력: " + stayCar.speed);
					System.out.println("현재 RPM: " + stayCar.rpm);
					if (startEngine == true) {
						engine = "부릉부릉";
						System.out.println("엔진 상태: " + engine);
						while (startEngine == true) {
							System.out.print("속도를 변경하시겠습니까?(Up = U/Down = D/No = N): ");
							anser1 = scan.next();
							if (anser1.equals("U")) {
								if ((stayCar.speed + 10) > newCar.maxSpeed) {
									System.out.println("최대 속도를 넘었습니다!!");
									continue;
								} else {
									stayCar.speedUp(10);
									System.out.println("현재 속력은 " + stayCar.speed + "입니다.");
								}
							} else if (anser1.equals("D")) {
								if ((stayCar.speed - 10) < newCar.lowSpeed) {
									System.out.println("이미 최소 속도입니다!");
									continue;
								} else {
									stayCar.speedDown(10);
									System.out.println("현재 속력은 " + stayCar.speed + "입니다.");
								}
							} else {
								System.out.println("속도 변경을 종료합니다.");
								break;
							}
						}

						while (startEngine == true) {
							int i = 1;
							System.out.print("RPM을 변경하시겠습니까?(Up = U/Down = D/No = N): ");
							anser2 = scan.next();
							if (anser2.equals("U")) {
								if ((stayCar.rpm + 1) > 20) {
									System.out.println("최대 RPM을 넘었습니다!!");
									continue;
								} else {
									stayCar.rpmUp(1);
									System.out.println("현재 RPM은 " + stayCar.rpm + "입니다.");
								}
							} else if (anser2.equals("D")) {
								if ((stayCar.rpm - 1) < 1) {
									System.out.println("이미 최소 RPM입니다!");
									continue;
								} else {
									stayCar.rpmDown(1);
									System.out.println("현재 RPM은 " + stayCar.rpm + "입니다.");
								}
							} else {
								System.out.println("RPM 변경을 종료합니다.");
								break;
							}
						}
						break;
					}
				}
				System.out.println("시운전 결과");
				System.out.println("최대 속력: " + newCar.maxSpeed);
				System.out.println("현재 속력: " + stayCar.speed);
				System.out.println("현재 RPM: " + stayCar.rpm);
				
			} else {
				System.out.println("프로그램이 종료됩니다.");
			}
			
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
	}
}
