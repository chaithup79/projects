package learn;

public class customer {

	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", id=" + id + "]";
	}

}
