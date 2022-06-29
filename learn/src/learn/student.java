package learn;

import java.util.List;

public class student {

	private String studentName;
	private int id;
	private List<String> deptName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getDeptName() {
		return deptName;
	}

	public void setDeptName(List<String> deptName) {
		this.deptName = deptName;
	}

	public student(String studentName, int id, List<String> deptName) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.deptName = deptName;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", id=" + id + ", deptName=" + deptName + "]";
	}

}
