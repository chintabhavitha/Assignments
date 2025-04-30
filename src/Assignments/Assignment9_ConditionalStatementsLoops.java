package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionalStatementsLoops {

	public static void main(String[] args) {
		 String[] empNames = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		 
		 Double[] emp1Details = {75000.0, 5.1, 4.2};
		 Double [] emp2Details = {68000.0, 3.2, 3.8};
		 Double [] emp3Details = {82000.0, 7.1, 4.5};
		 Double [] emp4Details = {90000.0, 10.2, 2.5};
		 Double [] emp5Details = {60000.0, 2.4, 3.5};
		 
		 Map<String, Double[]> empData = new HashMap <>();
		
		 empData.put(empNames[0],emp1Details);
		 empData.put(empNames[1],emp2Details);
		 empData.put(empNames[2],emp3Details);
		 empData.put(empNames[3],emp4Details);
		 empData.put(empNames[4],emp5Details);
		 
		 for (String emp: empNames) {
			 Double[] data = empData.get(emp);
			 
			 double baseSalary = data[0];
			 double experience = data[1];
			 double rating = data[2];
			 
			 double reward = 0;
			 double variablePay;
			 double bonus;
			 
			 if(rating>=4.0) {
				 variablePay = 15.0;
				 bonus = 1500;
			 }else if (rating>=3 && rating <4) {
				 variablePay = 10.0;
				 bonus = 1200;
			 }else {
				 variablePay = 3.0;
				 bonus = 300; 
			 }
			 
			 if(experience >=5) {
				 reward = 5000;
			 }
			 
			 double hike = ( baseSalary * variablePay/100) + bonus + reward;
			 double hikePercentage = (hike/baseSalary) *100;
			 
			 Map<String, Double> hikeMap = new HashMap <String, Double>();
			 
			 hikeMap.put(emp, hikePercentage);
			 
			 System.out.println(hikeMap);
			 
		 }	 
		 
	}

}
