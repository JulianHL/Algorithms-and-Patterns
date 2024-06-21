package carHash;

public class Car {
	private String vin;
	private String desc;
	private double price;
	
	//Constructor
	public Car(String vin, String desc, double price) {
		super();
		this.vin = vin;
		this.desc = desc;
		this.price = price;
	}

	
	//Getters and Setters
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [Vin=" + vin + ", Desc=" + desc + ", Price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	

}
