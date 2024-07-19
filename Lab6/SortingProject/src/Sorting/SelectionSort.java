package Sorting;

public class SelectionSort {

	public static void sort(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			int minNumber = array[i];
			int minIndex = i;
			
			switch (i) {
			case 0:
				System.out.print("Initial Array: ["+array[0]);
				break;
				
			default:
				
				if(i == array.length-1) {
					System.out.print("Final Array: ["+array[0]);
					break;
				}
				System.out.print("Step "+(i)+": ["+array[0]);
				break;
			}
			
			for(int j = 0; j < array.length-1; j++) {
				
				if(Double.compare(minNumber, array[j+1]) > 0 && j+1 >= i) {
				minNumber = array[j+1];
				minIndex = j+1;
				}
				
				System.out.print(", "+array[j+1]);
			}
			
			System.out.println("]");
			int temp = array[i];
			array[i] = minNumber;
			array[minIndex] = temp;
			
	
		}
		
	}
}
