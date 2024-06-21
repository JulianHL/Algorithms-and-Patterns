package hashSetDivideCollection;

import java.util.*;

public class Divide {
	private double x;
	private double y;
	
	public Divide() {
		x = 0;
		y = 0;
	}
	
	//constructor
	public Divide(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//setters and getters
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return y;
	}
	
	//methods
	
	//method for division, it divides the x value by the y value
	public double division() {
		return x/y;
	}
	
	//methods for finding an element x in the array
	public static void findX(Set<Divide> hashSetDivide) {
		
		// the user is asked to type the number he wants to find, if it is i the array the value of numExist is set to true
		
		Integer hashCode = null;
		char response;
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease type the double you want to find in X: ");
		double num = input.nextDouble();
		boolean numExist= false;
		
		for(Divide element : hashSetDivide) {
			if(element.getX()==num) {
				numExist = true;
				hashCode = element.hashCode();
			}
		}
		
		
		// if the number exists the position is printed and the user is asked if he wants to find another number
		System.out.println(numExist?"The number for X= "+num+" exists into the hashSet and its hashCode is: #"+(hashCode):"The number you are looking for does not exist");
		System.out.println("Do you want to find another number? type Y/y to continue or any other key to stop");
		response = input.next().charAt(0);
		
		// if the user wants to find another number the method is called again
		if (Character.toLowerCase(response)=='y') {
			findX(hashSetDivide);
		}

		}
	
	//method for finding an element y in the array
	public static void findY(Set<Divide> hashSetDivide) {
		
		// the user is asked to type the number he wants to find, if it is i the array the value of numExist is set to true
		
				Integer hashCode = null;
				char response;
				Scanner input = new Scanner(System.in);
				System.out.println("\nPlease type the double you want to find in Y: ");
				double num = input.nextDouble();
				boolean numExist= false;
				
				for(Divide element : hashSetDivide) {
					if(element.getY()==num) {
						numExist = true;
						hashCode = element.hashCode();
					}
				}
				
				
				// if the number exists the position is printed and the user is asked if he wants to find another number
				System.out.println(numExist?"The number for Y= "+num+" exists into the hashSet and its hashCode is: #"+(hashCode):"The number you are looking for does not exist");
				System.out.println("Do you want to find another number? type Y/y to continue or any other key to stop");
				response = input.next().charAt(0);
				
				// if the user wants to find another number the method is called again
				if (Character.toLowerCase(response)=='y') {
					findX(hashSetDivide);
				}
		
		}
	}


