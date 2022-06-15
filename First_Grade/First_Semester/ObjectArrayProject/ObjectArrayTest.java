/*
 * 학생의 이름과 나이를 필드로 배열을 생성 하는 실행, 테스트 클래스
 * 작성일자 : 2022-05-24
 * 작성자 : 소융대 22학번 조한별
 */
import java.util.Scanner;
public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // 사용자로부터 학생 정보를 입력받기 위한 객체 생성
		int size = 0; // 생성될 학생의 수를 저장할 지역변수
		Student[] sarr = null; // 아직 크기가 결정되기 않은 배열 객체 변수 선언
		String name = null;
		int age = 0;
		
		System.out.println("생성할 학생의 수를 입력하세요.");
		size = scan.nextInt(); // 생성할 배열의 크기를 입력받음
		
		sarr = new Student[size]; // 실제 객체 배열을 생성 - Student 객체가 size만큼 생성된게 아니고 객체의 참조를 저장할 있는 배열객체가 생성
		//Student 객체는 아직 생성된게 없다.
		
		for(int i = 0; i < size; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력력하세요 : ");
			name = scan.next(); // 띄어쓰기가 필요하면면 nextLine
			System.out.print((i+1) + "번째 학생의 나이를 입력력하세요 : ");
			age = scan.nextInt();
			//Student temp = new Student(name, name));
			sarr[i] = new Student(name, age);
		}
		
		for(Student s : sarr) {
			System.out.println(s);
		}
	}

}
