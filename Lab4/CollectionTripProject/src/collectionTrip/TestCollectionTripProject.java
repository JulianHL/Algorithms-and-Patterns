package collectionTrip;

import java.io.*;
import java.util.*;

public class TestCollectionTripProject {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Trip.in"));
		
		Set <Trip> tripSet = new HashSet<>();
		Set <Trip> tripLinkedHashSet = new LinkedHashSet<>();
		SortedSet <Trip> tripTreeSet = new TreeSet<>();
		SortedSet <Trip> tripTreeSetTotalCost = new TreeSet<>();
		
		while(inFile.hasNextLine()) {
			String[] tripTempArray = inFile.nextLine().split("\t");
			Trip trip = new Trip(Integer.parseInt(tripTempArray[0]), tripTempArray[1], tripTempArray[2], Double.parseDouble(tripTempArray[3]), Integer.parseInt(tripTempArray[4]), Double.parseDouble(tripTempArray[5]), Double.parseDouble(tripTempArray[6]));
			tripSet.add(trip);
			tripLinkedHashSet.add(trip);
			tripTreeSet.add(trip);
			trip.setOrderType("totalcost");
			tripTreeSetTotalCost.add(trip);
			
			
		}
		inFile.close();
		
		System.out.println("The Employee Trip information you entered are: "+tripSet.size()+" \n\n");
		tripSet.forEach(System.out::println);
		
		System.out.println("\n\n\nUsing Iterator interface, The Employee Trip information are:\n\n");
		Iterator<Trip> it = tripSet.stream().sorted(Comparator.comparing(Trip::getEmp_id)).iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n\n\nAfter adding new Client, the list is:\n\n");
		Trip newtrip = new Trip(2, "Amine Khan", "Paris France", 1.11, 50, 75.0, 50.0);
		tripSet.add(newtrip);
		tripSet.forEach(System.out::println);
		tripSet.remove(newtrip);
		
		System.out.println("\n\n\nAfter adding new Client, the list is:\n\n");
		if(!tripSet.stream().anyMatch(trip -> (trip.getEmp_id() == newtrip.getEmp_id())||(trip.getEmp_name().equals(newtrip.getEmp_name())||trip.getEmp_address().equals(newtrip.getEmp_address())))) {
			tripSet.add(newtrip);
		}
		tripSet.stream().forEach(System.out::println);
		
		System.out.println("\n\n\nThe Trip Employee information added to the TreeSet with respect to emp_id is:\n\n");
		tripTreeSet.forEach(System.out::println);
		
		System.out.println("\n\n\nThe Trip Employee information added to the TreeSet with respect to emp_totalcost is:\n\n");
		tripTreeSetTotalCost.forEach(System.out::println);
		
		
		

	}

}
