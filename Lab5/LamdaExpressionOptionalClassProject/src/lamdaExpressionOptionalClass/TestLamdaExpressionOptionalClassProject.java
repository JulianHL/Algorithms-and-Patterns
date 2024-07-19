package lamdaExpressionOptionalClass;

import java.util.*;

public class TestLamdaExpressionOptionalClassProject {
	
	public static void main(String[] args) {
		
		List<Car> listCars = new ArrayList<>();
		
		listCars.add(new Car("K1245", "Ford", 35000));
		listCars.add(new Car("M198745", "Honda", 40000));
		listCars.add(null);
		
		
		System.out.println("Using Optional Class\n");
		listCars.forEach(car -> Car.getOptionalCar(Optional.ofNullable(car)));
		
		

		

	}

}
