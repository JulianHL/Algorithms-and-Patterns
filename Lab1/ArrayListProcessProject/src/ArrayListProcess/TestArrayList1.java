package ArrayListProcess;
import java.util.*;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = new ArrayList<>();
		String [] names = {"Ann", "Bob", "Carol"};
		
		for (String element:names) {
			nameList.add(element);
			
		}
		
		nameList.forEach( element -> System.out.println(element));
			
	}

}
