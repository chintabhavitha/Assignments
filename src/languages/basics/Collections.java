package languages.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		// Major Collection Categories ==> List , Set , Map

		// List ==> ArrayList , LinkedList

		/********** ArrayList **************/

		/*
		 * List<String> EmpNameArrayList = new ArrayList<String>();
		 * EmpNameArrayList.add("Bhavitha"); EmpNameArrayList.add("Bhavi");
		 * EmpNameArrayList.add("Bhavs"); EmpNameArrayList.add(3,"Bhavitha");
		 * EmpNameArrayList.add("Bhavi"); EmpNameArrayList.add(null);
		 * EmpNameArrayList.remove("Bhavi"); EmpNameArrayList.remove(3);
		 * 
		 * System.out.println(EmpNameArrayList.size());
		 * System.out.println(EmpNameArrayList.get(3));
		 * System.out.println(EmpNameArrayList);
		 */

		/********* LinkedList ***************/

		List<String> EmpNameLinkedList = new LinkedList<String>();
		EmpNameLinkedList.add("Bhavitha");
		EmpNameLinkedList.add("Bhavi");
		EmpNameLinkedList.add("Bhavs");
		EmpNameLinkedList.add(3, "sam");
		EmpNameLinkedList.add("Bhavi");
		EmpNameLinkedList.add(null);
		EmpNameLinkedList.remove("Bhavi");
		EmpNameLinkedList.remove(3);

		System.out.println(EmpNameLinkedList.size());
		System.out.println(EmpNameLinkedList.get(3));
		System.out.println(EmpNameLinkedList);

	}

}
