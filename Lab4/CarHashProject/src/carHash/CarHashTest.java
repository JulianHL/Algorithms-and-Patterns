package carHash;

import java.util.*;

public class CarHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating hashmap collection
		Map<String, Car> carHashMap = new HashMap<>();
		
		// Creating cars
		Car car1 = new Car("K1245", "Ford", 35000);
		Car car2 = new Car("M198745", "Honda", 40000);
		Car car3 = new Car("P198745", "Toyota", 45000);
		Car car4 = new Car("M98745", "Hyundai", 50000);

		// Adding cars to hashmap
		carHashMap.put(car1.getVin(), car1);
		carHashMap.put(car2.getVin(), car2);
		carHashMap.put(car3.getVin(), car3);
		carHashMap.put(car4.getVin(), car4);
		
		// Displaying hashmap
		System.out.println("Search by VIN of car:");
		Car foundCar = carHashMap.get(car1.getVin());
		
		if(foundCar != null)
		{
			System.out.println("Car found: \n" + foundCar.toString());
		}
		else
		{
			System.out.println("Car not found");
		}
		
		System.out.println("\nDisplay all Keys:");
		
		Set<String> keys = carHashMap.keySet();
		for(String element: keys) {
			System.out.println(element);
		}
		
		System.out.println("\nDisplay all values of Map collection:");
		
		Collection <Car> carValues = carHashMap.values();
		for(Car element: carValues) {
			System.out.println(element);
		}
		
		
		
		
	}

}
