package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		Assignment3_Employees obj = new Assignment3_Employees();

		//System.out.println("Employee Name: " + obj.empname1 + ", " + "Employee ID: " + obj.empid1);
		/*
		String[] Employeename = { obj.empname1, obj.empname2, obj.empname3 };
		int[] Employeeid = { obj.empid1, obj.empid2, obj.empid3 };
		System.out.println("Employee Name: " + Employeename[0] + ", " + "Employee ID: " + Employeeid[0]);
		System.out.println("Employee Name: " + Employeename[1] + ", " + "Employee ID: " + Employeeid[1]);
		System.out.println("Employee Name: " + Employeename[2] + ", " + "Employee ID: " + Employeeid[2]);
		*/
		
		// employee names
		String[] Employeename = new String[3];
		Employeename[0] = obj.empname1;
		Employeename[1] = obj.empname2;
		Employeename[2] = obj.empname3;

		// employee ids
		int[] Employeeid = new int[3];
		Employeeid[0] = obj.empid1;
		Employeeid[1] = obj.empid2;
		Employeeid[2] = obj.empid3;

		System.out.println("Employee Name: " + Employeename[0] + ", " + "Employee ID: " + Employeeid[0]);
		System.out.println("Employee Name: " + Employeename[1] + ", " + "Employee ID: " + Employeeid[1]);
		System.out.println("Employee Name: " + Employeename[2] + ", " + "Employee ID: " + Employeeid[2]);

	}

}
