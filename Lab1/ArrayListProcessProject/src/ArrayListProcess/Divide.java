package ArrayListProcess;


import java.util.*;

public class Divide {
	private double x;
	private double y;
	
	public Divide() {
		x = 0;
		y = 0;
	}
	
	public Divide(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
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
	
	public double division(Divide divide) {
		return divide.getX()/divide.getY();
	}
	
	public static void findX(List<Divide> arrayListDivide) {
		
		boolean numExist=false;
		int index;
		char response;
		Scanner input = new Scanner(System.in);
		System.out.println("Please type the double you want to find in X");
		double num = input.nextDouble();
		for(index = 0; index < arrayListDivide.size(); index++) {
			if(arrayListDivide.get(index).getX()==num) {
				numExist = true;
				break;
			}
			numExist = false;
		}
		
		
		System.out.println(numExist?"The number for X= "+num+" exists into the list and it is in the position #"+(index+1):"The number you are looking for does not exist");
		System.out.println("Do you want to find another number? type Y/y to continue or any other key to stop");
		response = input.next().charAt(0);
		
		if (Character.toLowerCase(response)=='y') {
			findX(arrayListDivide);
		}

		}
	
	public static void findY(List<Divide> arrayListDivide) {
		
		boolean numExist=false;
		int index;
		char response;
		Scanner input = new Scanner(System.in);
		System.out.println("Please type the double you want to find in Y");
		double num = input.nextDouble();
		for(index = 0; index < arrayListDivide.size(); index++) {
			if(arrayListDivide.get(index).getY()==num) {
				numExist = true;
				break;
			}
			numExist = false;
		}
		
		
		System.out.println(numExist?"The number for Y= "+num+" exists into the list and it is in the position #"+(index+1):"The number you are looking for does not exist");
		System.out.println("Do you want to find another number? type Y/y to continue or any other key to stop");
		response = input.next().charAt(0);
		
		if (Character.toLowerCase(response)=='y') {
			findY(arrayListDivide);
		}
		
		}
	}


