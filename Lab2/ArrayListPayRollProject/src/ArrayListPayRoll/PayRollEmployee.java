package ArrayListPayRoll;

public class PayRollEmployee {
	
	private int emp_id;
	private String emp_name;
	private String emp_ssn;
	private int number_whr;
	private double h_rate;
	public static double Fed_Tax;
	public static double Prv_Tax;
	public static double QP_Ins;
	public static double E_ins;
	public static double Qpp;
	public static double Union_d;
	
	//Constructors
	
	//Default Constructor
	public PayRollEmployee() {
		emp_id = 0;
		emp_name = "";
		emp_ssn = "";
		number_whr = 0;
		h_rate = 0.0;
		Fed_Tax = 0.07;
		Prv_Tax = 0.09;
		QP_Ins = 0.0055;
		E_ins = 0.014;
		Qpp = 0.045;
		Union_d = 0.0165;
	}
	
	//Parameterized Constructor
	public PayRollEmployee(int id, String name, String ssn, int whr, double rate) {
		emp_id = id;
		emp_name = name;
		emp_ssn = ssn;
		number_whr = whr;
		h_rate = rate;
		Fed_Tax = 0.07;
		Prv_Tax = 0.09;
		QP_Ins = 0.0055;
		E_ins = 0.014;
		Qpp = 0.045;
		Union_d = 0.0165;
	}
	
	//Getters and Setters
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
	public String getEmp_ssn() {
		return emp_ssn;
	}
	public void setEmp_ssn(String emp_ssn) {
		this.emp_ssn = emp_ssn;
	}
	public int getNumber_whr() {
		return number_whr;
	}
	public void setNumber_whr(int number_whr) {
		this.number_whr = number_whr;
	}
	public double getH_rate() {
		return h_rate;
	}
	public void setH_rate(double h_rate) {
		this.h_rate = h_rate;
	}
	
	//toString
	@Override
	public String toString() {
		return "PayRollEmployee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_ssn=" + emp_ssn
				+ ", number_whr=" + number_whr + ", h_rate=" + h_rate + "]";
	}
	
	//Methods
	
	// Calculate Total Income
	public  double calculate_TotalIncome() {
		
		return number_whr * h_rate;
	}

	//Calculate Deductions
	public  double calculate_TotalDeduction(String deductionType) {
		
		switch (deductionType) {
		case String d when (d == "Fed_Tax"):
			return calculate_TotalIncome() * Fed_Tax;
		case String d when (d == "Prv_Tax"):
			return calculate_TotalIncome() * Prv_Tax;
		case String d when (d == "QP_Ins"):
			return calculate_TotalIncome() * QP_Ins;
		case String d when (d == "E_ins"):
			return calculate_TotalIncome() * E_ins;
		case String d when (d == "Qpp"):
			return calculate_TotalIncome() * Qpp;
		case String d when (d == "Union_d"):
			return calculate_TotalIncome() * Union_d;
		default:
			return calculate_TotalIncome() * (Fed_Tax + Prv_Tax + QP_Ins + E_ins + Qpp + Union_d);
		
		}
		
	}
	
	// Calculate Net Amount
	public  double calculate_NetAmount() {
		
		return calculate_TotalIncome() - calculate_TotalDeduction("total");
	}

}
