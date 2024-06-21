package genericPoint;

public class TestGenericProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point<String> strPoint = new Point<>("Anna", "Bannana");
		
		Integer[] x = {2,4,9,10};
		String[] strName= {"su", "Ken", "Robert", "Lee"};
		
		strPoint.printArray(x);
		strPoint.printArray(strName);
		
		strPoint.printArray2(x,strName);

	}

}
