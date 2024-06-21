package clientStack;

public class Client {
	private int client_id;
	private String client_name;
	private int client_Qty;
	private double client_price;
	
	//Constructor
	public Client(int client_id, String client_name, int client_Qty, double client_price) {
		super();
		this.client_id = client_id;
		this.client_name = client_name;
		this.client_Qty = client_Qty;
		this.client_price = client_price;
	}
	
	//Getters and Setters
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public int getClient_Qty() {
		return client_Qty;
	}
	public void setClient_Qty(int client_Qty) {
		this.client_Qty = client_Qty;
	}
	public double getClient_price() {
		return client_price;
	}
	public void setClient_price(double client_price) {
		this.client_price = client_price;
	}
	
	//Methods
	public double total() {
		return client_Qty*client_price;
	}
	
	//toString
	@Override
	public String toString() {
		return "The Client Information is : "+ client_id+"//"+client_name+"//"+client_Qty+"//"+client_price+"$ -> Client Total: "+total()+"$";
	}
}
