package learn;

import java.util.Comparator;

public class IdComparator implements Comparator<dept>{

	@Override
	public int compare(dept o1, dept o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId())
		{
			return o1.getName().compareTo(o2.getName());
		}
		else if(o1.getId()>o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
		
		
		
	}

}
