/*
 * 작성한 Student 클래스 테스트를 위한 클래스 입니다.
 * 작성날짜 2022-05-01
 * 작성자 조한별
 */
public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setStrudentNo("20225259");
		s1.setStudentName("조한별");
		s1.setGrade(1);
		s1.setDept("소융대");
//		System.out.println(s1);
		System.out.println(s1.toString());
		Student s2 = new Student();
		s2.setStrudentNo("20221111");
		s2.setStudentName("홍길동");
		s2.setGrade(2);
		s2.setDept("소융대");
		System.out.println(s2);
	}

}
