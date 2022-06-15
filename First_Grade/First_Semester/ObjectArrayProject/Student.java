import java.util.Objects;

/*
 * 학생의 이름과 나이를 필드로 배열을 생성 하는 클래스
 * 작성일자 : 2022-05-24
 * 작성자 : 소융대 22학번 조한별
 */
public class Student {
	private String studenName; // 학생의 이름을 저장하는 멤버변수
	private int age; // 학생의 정수형태의 나이를 저장할 멤버변수
	
	public Student() { // 기본 생성자는 학생정보가 입력되지 않은 상태에서 생성이 필요한 경우
		this.studenName = null;
		this.age = 20;
	}
	public Student(String name, int age) {
		this.studenName = name; // 멤버변수는 studentName에 생성시 매개변수로 전달받은 name을 초기화
		this.age = age;
	}
	//get 접근자 / set 수정자 // getVolume setDimention 
	public String getStudenName() {
		return studenName;
	}
	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studenName=" + studenName + ", age=" + age + "]";
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(studenName, other.studenName);
	}
	
	//toString
	
	//equals
	
	//기타 메소드들.... move, incGrade, incAge
	
	
	
}
 
