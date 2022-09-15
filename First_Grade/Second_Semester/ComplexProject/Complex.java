/*
 * 복소수 연산 프로그램
 * 작성일자 : 2022-09-15
 * 작성자 : 조한별
 */

public class Complex {

	double realPart; // 실수부
	double imaginaryPart; // 허수부

	public Complex() { // 생성자(객체 초기화)

		this.realPart = 0;

		this.imaginaryPart = 0;

	}

	
	public Complex(double realPart, double imaginaryPart) { // 생성자(new 연산자를 이용해 객체 생성)

		this.realPart = realPart;

		this.imaginaryPart = imaginaryPart;

	}

	
	public Complex add(Complex otherNumber) { // 복소수 덧셈 - 매개 변수를 통해 객체 otherNumber를 생성 후 기존 객체 n을 생성, 이 두 객체를 연산 후 리턴
		
		Complex n = new Complex(this.realPart, this.imaginaryPart);

		n.realPart += otherNumber.realPart;
		n.imaginaryPart += otherNumber.imaginaryPart;
		
		return n;
		
	}

	

	public void setRealPart(double realPart) { // 실수부 설정 메소드

		this.realPart = realPart;

	}

	@Override
	public String toString() { // 객체 출력을 위한 메소드
		return "Complex [" + realPart + " + " + imaginaryPart + "i]";
	}


	public void setImaginaryPart(double imaginaryPart) { // 허수부 setter 메소드

		this.imaginaryPart = imaginaryPart;

	}

	public double getRealPart() { // 실수부의 값 getter

		return this.realPart;

	}

	public double getImaginaryPart() { // 허수부의 값 getter

		return this.imaginaryPart;

	}
	
	public Complex sub(Complex otherNumber) { // 복소수 뺄셈 - 매개 변수를 통해 객체 otherNumber를 생성 후 기존 객체 n을 생성, 이 두 객체를 연산 후 리턴
		
		Complex n = new Complex(this.realPart, this.imaginaryPart);
		
		n.realPart -= otherNumber.realPart;
		n.imaginaryPart -= otherNumber.imaginaryPart;
		
		return n;
		
	}
  
}
