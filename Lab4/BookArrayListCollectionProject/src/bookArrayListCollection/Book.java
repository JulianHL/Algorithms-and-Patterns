package bookArrayListCollection;

public class Book {
private int b_id;
private String b_author;
private String b_title;
private String b_isbn;
private String b_type;
private double b_price;

//default constructor
public Book() {
	b_id = 0;
	b_author = "";
	b_title = "";
	b_isbn = "";
	b_type = "";
	b_price = 0.0;
}

//parameterized constructor
public Book(int b_id, String b_author, String b_title, String b_isbn, String b_type, double b_price) {
	this.b_id = b_id;
	this.b_author = b_author;
	this.b_title = b_title;
	this.b_isbn = b_isbn;
	this.b_type = b_type;
	this.b_price = b_price;
}

//getters and setters
public int getB_id() {
	return b_id;
}
public String getB_author() {
	return b_author;
}
public String getB_title() {
	return b_title;
}
public String getB_isbn() {
	return b_isbn;
}
public String getB_type() {
	return b_type;
}
public double getB_price() {
	return b_price;
}

public void setB_id(int b_id) {
	this.b_id = b_id;
}
public void setB_author(String b_author) {
	this.b_author = b_author;
}
public void setB_title(String b_title) {
	this.b_title = b_title;
}
public void setB_isbn(String b_isbn) {
	this.b_isbn = b_isbn;
}
public void setB_type(String b_type) {
	this.b_type = b_type;
}
public void setB_price(double b_price) {
	this.b_price = b_price;
}

//toString
@Override
public String toString() {
	return "The book information is : " + b_id + "//" + b_author + "//" + b_title + "//" + b_isbn + "//" + b_type + "//" + b_price;
}

// methods

//calculate price in euro
public void calculate_Price_Euro() {
	System.out.println(" -> Book CAN Price: " + b_price + "$ -> Book EUR Price: " + (Math.round((b_price * 0.7)*100.00))/100.00 + "$");
}

}
