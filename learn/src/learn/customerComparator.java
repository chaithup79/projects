package learn;

import java.util.Comparator;

public class customerComparator implements Comparator<customer> {

	@Override
	public int compare(customer cust1, customer cust2) {
		// TODO Auto-generated method stub
		return cust1.getName().compareTo(cust2.getName());
	}

//	@Override
//	public int compareTo(customer o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
