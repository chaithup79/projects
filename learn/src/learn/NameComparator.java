package learn;

import java.util.Comparator;

public class NameComparator implements Comparator<dept> {

	@Override
	public int compare(dept d1, dept d2) {
		// TODO Auto-generated method stub
		return d1.getName().compareTo(d2.getName());
	}



}
