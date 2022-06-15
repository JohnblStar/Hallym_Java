/*
 * 비만도 측정을 위한 클래스
 * 작성날짜 2022-05-01
 * 작성자 조한별
 */
public class Obesity {
	private double height; // 키
	private double weight; // 비만도 계산을 위한 몸무게
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return "키 : " + height + " 몸무게 : " + weight;
	}
	public double calcStandardWeight() {
		return (height - 100) * 0.9;
	}
	public double calcBmi() {
		double stWeight = 0.0;
		stWeight = calcStandardWeight();
		return (weight - stWeight) / stWeight * 100;
//		return (weight - calcStandardWeight()) / calcStandardWeight() * 100;
	}
	
	
	
	public String printBmi() {
		double bmi = 0.0;
		bmi = calcBmi();
		if ( bmi < -20) 
			return "저체중";
		else if ( bmi < 20) 
			return "정상";
		else if ( bmi < 30) 
			return "경도 비만";
		else if ( bmi < 50) 
			return "중증 비만";
		else 
			return "고도비만";
	}
}
