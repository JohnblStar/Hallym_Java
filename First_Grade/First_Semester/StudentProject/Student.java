/*
 * 학생 정보를 저장하고 처리하기 위한 클래스
 * 작성날짜 2022-05-01
 * 작성자 조한별
 */
public class Student {
	private String studentNo;
	private String studentName;
	private int grade;
	private String dept;
	
	public void setStrudentNo(String no) {
		studentNo = no;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setGrade(int grede) {
		this.grade = grede;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getGrade() {
		return this.grade;
	}
	public String getDept() {
		return this.dept;
	}
	public String toString() {
		return "학생정보: 학번(" + studentNo + ") 이름(" + studentName + ") 학년(" + grade + ") 학과(" + dept + ")";
	}
}
