package genericPoint;

public class TestGenericProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point<String> strPoint = new Point<>("Anna", "Bannana");
		Point<Number> Pie = new Point<>(3.14, 2.71);
		
		System.out.println(strPoint);
		System.out.println(Pie);
		
		Integer[] x = {2,4,9,10};
		String[] strName= {"su", "Ken", "Robertson", "Lee"};
		
		strPoint.printArray(x);
		strPoint.printArray(strName);
		
		strPoint.printArray2(x,strName);

	}

}
