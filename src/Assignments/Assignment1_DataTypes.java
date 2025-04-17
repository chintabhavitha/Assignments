package assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		
		// 1. Temperature of a city in degrees Celsius: 25.5 (DataType => float )

		float Celsius = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius: " + Celsius);

		// 2. Whether a customer has placed an order: true or false (DataType => boolean)

		boolean Customers_Order = true;
		System.out.println("Whether a customer has placed an order: " + Customers_Order);

		boolean Customer_Order = false;
		System.out.println("Whether a customer has placed an order: " + Customer_Order);
		
		boolean CustomersOrder = true;
		boolean CustomerOrder = false;
		System.out.println("Whether a customer has placed an order: " + CustomersOrder +" " + "or" + " "+CustomerOrder);
		
		//3. Person's phone number: "123-456-7890" (DataType => String)
		
		String Phone_Number = "123-456-7890";
		System.out.println("Person's phone number: "+Phone_Number);
		
		//4. Amount of money in a customer's bank account: 1000.50 (DataType => float or String)
		
		/*float Customers_Money = 1000.50f;
		System.out.println("Amount of money in a customer's bank account: "+Customers_Money); //   1000.5 
		*/
		
		String Customer_Money = "1000.50"; //using string
		System.out.println("Amount of money in a customer's bank account: "+Customer_Money); //  1000.50
		
		//5. Person's email address: "john.doe@example.com" (DataType => String)
		
		String email = "john.doe@example.com";
		System.out.println("Person's email address: "+ email);
		
		//6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194 (DataType => String or double)
		
		/*
		String [ ] coordinates = {"37.7749", "-122.4194"};
		System.out.println("Coordinates of a location (latitude): "+ coordinates [0]);
		System.out.println("Coordinates of a location (longitude): "+ coordinates [1]);
		
		double [ ] coordinate = {37.7749, -122.4194};
		System.out.println("Coordinates of a location (latitude): "+ coordinates [0]);
		System.out.println("Coordinates of a location (longitude): "+ coordinates [1]);
		*/
		
		double latitude = 37.7749;
		double longitude = -122.4194;
		System.out.println("Coordinates of a location (latitude, longitude): " + latitude + "," + longitude);
		/*
		 * System.out.append("Coordinates of a location (latitude, longitude): " + latitude + ",").append( longitude);
		 * System.out.println();
		 */
		
		//7. Person's marital status: true or false (DataType => boolean)
		
		/*
		boolean[] marital_status = {true, false};
		System.out.println("Person's marital status: " + marital_status[0]);
		System.out.println("Person's marital status: " + marital_status[1]);
		*/
		
		boolean Marital_Status = true;
		System.out.println("Person's marital status: " + Marital_Status);
		
		boolean Marital_status = false;
		System.out.println("Person's marital status: " + Marital_status);
		
		boolean Maritalstatus = false;
		boolean MaritalStatus = true;
		System.out.println("Person's marital status: " + Maritalstatus + " "+ "or" +" "+ MaritalStatus);
		
		
		
		//8. Person's occupation: "Software Engineer" (DataType => String)
		
		String occupation = "Software Engineer";
		System.out.println("Person's occupation: "+ occupation);
		
		//9. Person's favourite colour: "Blue" (DataType => String)
		
		String fav_colour = "Blue";
		System.out.println("Person's favourite colour: "+ fav_colour);
		
		//10.Current year: 2023 (DataType => int)
		
		int current_year = 2023;
		System.out.println("Current year: "+ current_year);
		
		//11.Number of followers on a social media platform: 1,000,000 (DataType => string)
		
		String followers = "1,000,000";
		System.out.println("Number of followers on a social media platform: "+ followers);
		
		//12.Rating of a movie: 7.5 (DataType => float)
		
		float Movie_Rating = 7.5f;
		System.out.println("Rating of a movie: "+ Movie_Rating);
		
		//13.Person's blood type: 'A' (DataType => char)
		
		char bloodtype = 'A'; 
 		System.out.println("Person's blood type: "+ bloodtype);
		
 		//14.Title of a book: "To Kill a Mockingbird" (DataType => String)
 		
 		String title = "To Kill a Mockingbird";
 		System.out.println("Title of a book: "+ title);
 		
 		//15.Number of employees in a company: 500 (DataType => int)
 		
 		int noofemployees = 500;
 		System.out.println("Number of employees in a company: "+ noofemployees);
 		
 		//16.Time of an event: 2:30 PM (DataType => String)
 		
 		String Event_time = "2:30 PM";
 		System.out.println("Time of an event: "+Event_time);
 		
 		//17.Name of a country: "United States" (DataType => String)
 		
 		String CountryName = "United States";
 		System.out.println("Name of a country: "+CountryName);
 		
 		//18.Person's eye color: "Brown" (DataType => String)
 		
 		String eyecolor = "Brown";
 		System.out.println("Person's eye color: "+ eyecolor);
 		
 		//19.Person's birthplace: "New York City" (DataType => String)
 		
 		String birthplace = "New York City";
 		System.out.println("Person's birthplace: "+ birthplace);
 		
 		//20.Distance between two cities: 200.5 (DataType => float)
 		
 		float distance = 200.5f;
 		System.out.println("Distance between two cities: "+ distance);
		

	}

}
