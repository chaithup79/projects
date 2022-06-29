package learn;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class dept implements Comparable<dept> {

	int id;
	String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public dept(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public dept() {
		
		
	}
	
	
	@Override
	public String toString() {
		return "dept [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		List<dept> li=new LinkedList<>();
		
		li.add(new dept(1,"abc"));
		li.add(new dept(29,"def"));
		li.add(new dept(16,"pqr"));
		
		
		Collections.sort(li, new NameComparator());
		System.out.println(li);
		
	}

	@Override
	public int compareTo(dept o) {
		// TODO Auto-generated method stub
		
		
		if(id==o.getId())
		{
		return 0;
		}
		else if(id>o.getId())
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	
	
	
}
