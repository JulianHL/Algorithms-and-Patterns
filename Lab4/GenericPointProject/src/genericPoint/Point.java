package genericPoint;

//Generic class or Parametric class
public class Point <T> {
	private T x;
	private T y;

	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public <T> void printArray(T[] v_array) {
		
		for(T element : v_array) {
			
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public <T> void printArray2(T ... v_array ) {
		
		for( T element : v_array) {
				
				System.out.print(element+" ");
			}
			
		System.out.println();
	}
	
	

}
