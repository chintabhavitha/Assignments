package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4_Arrays_Collections {

	public static void main(String[] args) {

		// 1.Create Lists with area of top 5 largest cities. Print the total area of the
		// 3rd and 4th cities combined.

		List<String> CityArrayList = new ArrayList<String>();
		CityArrayList.add("Hulunbuir, China - 253,000Km²");
		CityArrayList.add("Yakutat, Alaska, USA - 24,000Km²");
		CityArrayList.add("Altamira, Brazil - 159,534Km²");
		CityArrayList.add("Kalgoorlie-Boulder, Australia - 100,000Km²");
		CityArrayList.add("New York City, USA - 789Km²");

		List<Double> AreasArrayList = new ArrayList<Double>();
		AreasArrayList.add(253000.0);
		AreasArrayList.add(24000.0);
		AreasArrayList.add(159534.0);
		AreasArrayList.add(100000.0);  
		AreasArrayList.add(789.0);

		Double totalarea = AreasArrayList.get(2) + AreasArrayList.get(3);

		System.out.println("Total area of the 3rd and 4th cities combinedly is " + totalarea + "Km²");

		// 2.Create a set of the top 10 most visited tourist attractions in the world
		// and print out all of them and its size.

		Set<String> CityLinkedHashSet = new HashSet<String>();

		CityLinkedHashSet.add("Grand Bazaar – Istanbul - Turkey");
		CityLinkedHashSet.add("Zócalo (Plaza de la Constitución) in Mexico City");
		CityLinkedHashSet.add("Times Square in New York City - USA");
		CityLinkedHashSet.add("Central Park in New York City - USA");
		CityLinkedHashSet.add("Union Station in Washington D.C - USA");
		CityLinkedHashSet.add("Las Vegas Strip in Las Vegas - USA");
		CityLinkedHashSet.add("Meiji Shrine in Tokyo - Japan");
		CityLinkedHashSet.add("Sensoji Temple in Tokyo - Japan");
		CityLinkedHashSet.add("Niagara Falls in USA/Canada Border");
		CityLinkedHashSet.add("Grand Central Terminal in New York City - USA");

		System.out.println("Top 10 most visited tourist attractions in the world \n" + CityLinkedHashSet);
		System.out.println("The size of top 10 most visited tourist attractions in the world is \n"+ CityLinkedHashSet.size());

		// 3. Create an array of 10 numbers (any 10 numbers) and print out the Average
		// of 5th and 6th Value.

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19 };
		//System.out.println(number.length);
		int number5 = number[4];
		int number6 = number[5];

		int Average = (number5 + number6) / 2; // without decimals
		double Average1 = (number5 + number6) / 2; // with decimals

		System.out.println(Average);
		//System.out.println(Average1);

		// 4. Create a list of the top 5 highest-grossing movies of all time and print
		// out the third movie on the list.

		List<String> Movies = new ArrayList();

		Movies.add(0, "Avatar (2009)");
		Movies.add(1, "Avengers: Endgame (2019)");
		Movies.add(2, "Avatar: The Way of Water (2022)");
		Movies.add(3, "Titanic (1997)");
		Movies.add(4, "Star Wars: The Force Awakens (2015)");

		System.out.println("The Third movie on the list is " + Movies.get(2));

	}

}
