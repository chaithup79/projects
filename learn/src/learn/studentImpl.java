package learn;

import java.util.LinkedList;
import java.util.List;

public class studentImpl {

	public static void main(String[] args) throws StudentEvenNumberException {
		// TODO Auto-generated method stub

		
	List<student> listOfStudent = new LinkedList<>();
//	listOfStudent.add(new student("abc",1));
////	listOfStudent.add(new student("def",2));
////	listOfStudent.add(new student("lmn",3));
////	listOfStudent.add(new student("pqr",4));
////	listOfStudent.add(new student("stu",5));
////	listOfStudent.add(new student("jkl",6));
		
	
	long count=listOfStudent.stream().count();
	if(count%2!=0)
	{
		throw new StudentEvenNumberException("even number only needed!");
	}
	else
	{
		System.out.println(listOfStudent);
	}
		
	}

}
