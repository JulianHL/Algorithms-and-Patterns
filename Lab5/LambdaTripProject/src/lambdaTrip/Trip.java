package lambdaTrip;

public class Trip implements Comparable<Trip> {



	private int emp_id;
	private String emp_name;
	private String emp_address;
	private double emp_gasprice;
	private int emp_distance;
	private double emp_costhotel;
	private double emp_costfood;
	private double emp_totalcost;
	private String orderType = "";

	
	//default constructor
	public Trip() {
		emp_id = 0;
		emp_name = "";
		emp_address = "";
		emp_gasprice = 0.0;
		emp_distance = 0;
		emp_costhotel = 0.0;
		emp_costfood = 0.0;
		emp_totalcost = 0.0;
	}
	
	//constructor
	public Trip(int emp_id, String emp_name, String emp_address, double emp_gasprice, int emp_distance, double emp_costhotel, double emp_costfood) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.emp_gasprice = emp_gasprice;
		this.emp_distance = emp_distance;
		this.emp_costhotel = emp_costhotel;
		this.emp_costfood = emp_costfood;
		this.emp_totalcost = CalculateCostTrip();
	}
	
	//getters and setters
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public double getEmp_gasprice() {
		return emp_gasprice;
	}
	public void setEmp_gasprice(double emp_gasprice) {
		this.emp_gasprice = emp_gasprice;
	}
	public int getEmp_distance() {
		return emp_distance;
	}
	public void setEmp_distance(int emp_distance) {
		this.emp_distance = emp_distance;
	}
	public double getEmp_costhotel() {
		return emp_costhotel;
	}
	public void setEmp_costhotel(double emp_costhotel) {
		this.emp_costhotel = emp_costhotel;
	}
	public double getEmp_costfood() {
		return emp_costfood;
	}
	public void setEmp_costfood(double emp_costfood) {
		this.emp_costfood = emp_costfood;
	}
	
	public double getEmp_totalcost() {
		return emp_totalcost;
	}

	public void setEmp_totalcost(double epm_totalcost) {
		this.emp_totalcost = epm_totalcost;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String OrderType) {
		this.orderType = OrderType;
	}
	
	
	
	//Methods
	
	//toString
	@Override
	public String toString() {
		return "Emp Id = " + emp_id + ", Emp Name = " + emp_name + ", Emp Add = " + emp_address + ", Gas Price = " + emp_gasprice + ", Distance = " + emp_distance + ", Hotel Cost = " + emp_costhotel + ", Food Cost = " + emp_costfood;
	}
	
	@Override
	public int compareTo(Trip otherTrip) {
		switch(orderType) {
		case "totalcost":
			return Double.compare(otherTrip.emp_totalcost, this.emp_totalcost);
		default:
			return Integer.compare(otherTrip.emp_id, this.emp_id);
		}
	}
	
	public double CalculateCostTrip() {
		return Math.round(((emp_distance * emp_gasprice) + emp_costhotel + emp_costfood)*100.00)/100.00;
	}
	
	public String printCostTrip() {
		return toString() + ", Total Cost = " + emp_totalcost+"$";
	}
}
