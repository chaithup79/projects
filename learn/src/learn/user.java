package learn;

import java.util.List;

public class user {

	private int userId;
	private String userName;
	private List<String> dept;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getDept() {
		return dept;
	}
	public void setDept(List<String> dept) {
		this.dept = dept;
	}
	public user(int userId, String userName, List<String> dept) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dept = dept;
	}
	public user() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [userId=" + userId + ", userName=" + userName + ", dept=" + dept + "]";
	} 
	
	
	
	
}
