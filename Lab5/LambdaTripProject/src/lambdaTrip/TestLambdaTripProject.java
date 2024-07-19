package lambdaTrip;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestLambdaTripProject {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Trip.in"));
		
		Set <Trip> tripSet = new HashSet<>();

		
		while(inFile.hasNextLine()) {
			String[] tripTempArray = inFile.nextLine().split("\t");
			Trip trip = new Trip(Integer.parseInt(tripTempArray[0]), tripTempArray[1], tripTempArray[2], Double.parseDouble(tripTempArray[3]), Integer.parseInt(tripTempArray[4]), Double.parseDouble(tripTempArray[5]), Double.parseDouble(tripTempArray[6]));
			tripSet.add(trip);	
		}
		inFile.close();
		
		System.out.println("The Employee Trip information you entered are: "+tripSet.size()+" \n\n");
		tripSet.forEach(trip -> System.out.println(trip));
		System.out.println("\n\nInvoking printCostTrip() method using lambda expression: ");
		tripSet.forEach(trip -> lambda_printCostTrip(trip));
		System.out.println("\n\nInvoking printCostTrip() method using :: operator within forEach: ");
		tripSet.forEach(TestLambdaTripProject::lambda_printCostTrip);
		System.out.println("\n\nApplying discount Function to Trip set using Lambda expression: ");
		Function<Double, Double> tripDiscount = amount -> Math.round((amount - amount * 0.10)*100)/100.00;
		tripSet.forEach(trip -> System.out.println("Cost Trip after Discount for: "+trip.getEmp_id()+", "+trip.getEmp_name()+" is: "+tripDiscount.apply(trip.getEmp_totalcost())+"$"));
		System.out.println("\n\nApplying tripAdvanceFee Function to Trip set using\n\"andThen\" method with Lambda expression after tripDiscount : ");
		Function<Double, Double> tripAdvanceFee = tripDiscount.andThen(amount -> Math.round((amount * 0.30)*100)/100.00);
		tripSet.forEach(trip -> System.out.println("Cost Trip after Discount for: "+trip.getEmp_id()+", "+trip.getEmp_name()+" is: "+tripAdvanceFee.apply(trip.getEmp_totalcost())+"$"));
		System.out.println("\n\nUsing Consumer Functional Interface: ");
		Consumer<Trip> totalTripCostMethod = trip -> lambda_printCostTrip(trip);
		totalTripCostMethod.accept(tripSet.stream().filter(trip -> trip.getEmp_id() == 2).findAny().get());
		System.out.println("\n\nUsing Stream Processing filter Method\nNumber of Employees in the HashSet whose Total Trip Cost > 400$ is: "+tripSet.stream().filter(trip -> trip.getEmp_totalcost() > 400).count());
		System.out.println("\n\nUsing Stream Processing sorted Method\nDisplay Employees in the HashSet sorted by Emp_id: ");
		tripSet.stream().sorted(Comparator.comparing(Trip::getEmp_id)).forEach(System.out::println);
		System.out.println("\n\nUsing Stream Processing sorted Method\nDisplay Employees in the HashSet sorted by CalculateCostTrip: ");
		tripSet.stream().sorted(Comparator.comparing(Trip::CalculateCostTrip)).forEach(System.out::println);
		System.out.println("\n\nUsing Stream Processing max Method\nDisplay Max Cost Trip of Employee in the HashSet: ");
		tripSet.stream().max(Comparator.comparing(Trip::CalculateCostTrip)).ifPresent(System.out::println);
		System.out.println("\n\nUsing Stream Processing min Method\nDisplay Min Cost Trip of Employee in the HashSet: ");
		tripSet.stream().min(Comparator.comparing(Trip::CalculateCostTrip)).ifPresent(System.out::println);
		System.out.println("\n\nUsing Stream Processing anyMatch Method\nDisplay if Employee Trip info matching emp_name Eduard is in the HashSet: "+tripSet.stream().anyMatch(Trip -> Trip.getEmp_name().toLowerCase().contains("Eduard".toLowerCase())));
		System.out.println("\n\nDisplay all Employee Trip info matching emp_name Paul is in the HashSet: ");
		tripSet.stream().filter(trip -> trip.getEmp_name().toLowerCase().contains("Paul".toLowerCase())).forEach(System.out::println);
		
		
		
	}
	
	private static void lambda_printCostTrip(Trip trip) {
		System.out.println(trip.printCostTrip());
	}

}
