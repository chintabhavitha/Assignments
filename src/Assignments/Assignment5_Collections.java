package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_Collections {

	public static void main(String[] args) {
		
		Map <String, String> Student1details = new HashMap <String, String> ();
		Student1details.put("Name","John Dae");
		Student1details.put("Age","20");
		Student1details.put("Gender","Male");
		Student1details.put("RollNumber","512345");
		Student1details.put("Grade","A");
		Student1details.put("Major","Computer Science");
		Student1details.put("GPA","3.8");
		Student1details.put("Email","john@example.com");
		Student1details.put("Contact Number","9876543210");
		Student1details.put("Address","123 Elm St");
		
		Map <String, String> Student2details = new HashMap <String, String> ();
		Student2details.put("Name","Jane Smith");
		Student2details.put("Age","21");
		Student2details.put("Gender","Female");
		Student2details.put("RollNumber","512346");
		Student2details.put("Grade","B");
		Student2details.put("Major","Mathematics");
		Student2details.put("GPA","3.5");
		Student2details.put("Email","jane@example.com");
		Student2details.put("Contact Number","9876543211");
		Student2details.put("Address","456 Oak St");
		
		Map <String, String> Student3details = new HashMap <String, String> ();
		Student3details.put("Name","Mike Brown");
		Student3details.put("Age","22");
		Student3details.put("Gender","Male");
		Student3details.put("RollNumber","512347");
		Student3details.put("Grade","A");
		Student3details.put("Major","Physics");
		Student3details.put("GPA","3.9");
		Student3details.put("Email","mike@example.com");
		Student3details.put("Contact Number","9876543212");
		Student3details.put("Address","789 Pine St");
		
		
		Map <String, String> Employee1Details = new HashMap <String, String>();
		Employee1Details.put("Employee ID", "E001");
		Employee1Details.put("Name", "Alice Green");
		Employee1Details.put("Age", "30");
		Employee1Details.put("Gender", "Female");
		Employee1Details.put("Department", "Engineering");
		Employee1Details.put("Position", "Software Engineer");
		Employee1Details.put("Salary", "75,000");
		Employee1Details.put("Email", "alice@example.com");
		Employee1Details.put("Contact Number", "9876543213");
		
		Map <String, String> Employee2Details = new HashMap <String, String>();
		Employee2Details.put("Employee ID", "E002");
		Employee2Details.put("Name", "Bob Johnson");
		Employee2Details.put("Age", "35");
		Employee2Details.put("Gender", "Male");
		Employee2Details.put("Department", "Marketing");
		Employee2Details.put("Position", "Marketing Manager");
		Employee2Details.put("Salary", "85,000");
		Employee2Details.put("Email", "bob@example.com");
		Employee2Details.put("Contact Number", "9876543214");
		
		Map <String, String> Employee3Details = new HashMap <String, String>();
		Employee3Details.put("Employee ID", "E003");
		Employee3Details.put("Name", "Carol Whiten");
		Employee3Details.put("Age", "28");
		Employee3Details.put("Gender", "Female");
		Employee3Details.put("Department", "Sales");
		Employee3Details.put("Position", "Sales Executive");
		Employee3Details.put("Salary", "65,000");
		Employee3Details.put("Email", "carol@example.com");
		Employee3Details.put("Contact Number", "9876543215");
		
		Map <String, String> Product1Details = new HashMap <String, String>();
		Product1Details.put("Product ID", "P001");
		Product1Details.put("Name", "Laptop");
		Product1Details.put("Category", "Electronics");
		Product1Details.put("Price", "$1,200");
		Product1Details.put("Stock Quantity", "50");
		Product1Details.put("Supplier", "Tech Supplies");
		Product1Details.put("Warranty", "2 years");
		Product1Details.put("Rating", "4.5");
		Product1Details.put("Manufacturing Date", "1/15/2023");
		Product1Details.put("Expiry Date", "1/15/2025");
		
		Map <String, String> Product2Details = new HashMap <String, String>();
		Product2Details.put("Product ID", "P002");
		Product2Details.put("Name", "Desk Chair");
		Product2Details.put("Category", "Furniture");
		Product2Details.put("Price", "$150");
		Product2Details.put("Stock Quantity", "100");
		Product2Details.put("Supplier", "Office Depot");
		Product2Details.put("Warranty", "1 years");
		Product2Details.put("Rating", "4");
		Product2Details.put("Manufacturing Date", "2/10/2023");
		Product2Details.put("Expiry Date", "N/A");
		
		Map <String, String> Product3Details = new HashMap <String, String>();
		Product3Details.put("Product ID", "P003");
		Product3Details.put("Name", "Coffee Maker");
		Product3Details.put("Category", "Kitchen");
		Product3Details.put("Price", "$75");
		Product3Details.put("Stock Quantity", "200");
		Product3Details.put("Supplier", "KitchenWorld");
		Product3Details.put("Warranty", "6 Months");
		Product3Details.put("Rating", "4.2");
		Product3Details.put("Manufacturing Date", "3/20/2023");
		Product3Details.put("Expiry Date", "3/20/2024");
		
		//System.out.println("The supplier name of 2nd product data is  " + Product2Details.get("Supplier"));
		
		
		List <Map <String, String>> ProductList = new ArrayList <Map <String, String>> (); //All products details are added in 1 productlist
		ProductList.add(Product1Details);
		ProductList.add(Product2Details);
		ProductList.add(Product3Details);
		System.out.println("Product 2 Details are  " +ProductList.get(2));
		
		//System.out.println("The supplier name of 2nd productdata is  " + ProductList.get(1).get("Supplier"));
		
		Map <String, Map<String, String>> Product2Data = new HashMap <String, Map<String, String>>();
		Product2Data.put("ProductData", Product2Details);
		
		System.out.println("The supplier name of 2nd productdata is  " + Product2Data.get("ProductData").get("Supplier"));
			
		

	}

}

