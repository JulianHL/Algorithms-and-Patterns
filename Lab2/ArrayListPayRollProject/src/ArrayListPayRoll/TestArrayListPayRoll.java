package ArrayListPayRoll;

import java.io.*;
import java.util.*;

public class TestArrayListPayRoll {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("payroll.in"));
		
		//payRollArrList is created
		List<PayRollEmployee> payRollArrList = new ArrayList<>();
		
		//payRollArrList is filled
		while(inFile.hasNext()) {
			PayRollEmployee employee = new PayRollEmployee();
			payRollArrList.add(employee);
			employee.setEmp_id(inFile.nextInt());
			employee.setEmp_name(inFile.next());
			employee.setEmp_ssn(inFile.next());
			employee.setNumber_whr(inFile.nextInt());
			employee.setH_rate(inFile.nextDouble());	
		}
		
		//payRollArrList is printed
		int idex = 0;
		double allEmpT = 0;
		double allEmpNT = 0;
		double allEmpD = 0;
		for(PayRollEmployee employee : payRollArrList) {
			
			System.out.println("payRollArrList ["+idex+"] Object: %.2f"+employee+"\n"+
					String.format("\t The Total Earning is %.2f$",employee.calculate_TotalIncome())+ "\n\n" +
		            String.format("\t The Fed_Tax Deduction is %.2f$", employee.calculate_TotalDeduction("Fed_Tax"))+ "\n" +
		            String.format("\t The Prv_Tax Deduction is %.2f$", employee.calculate_TotalDeduction("Prv_Tax"))+ "\n" +
		            String.format("\t The QP_Ins Deduction is %.2f$", employee.calculate_TotalDeduction("QP_Ins"))+ "\n" +
		            String.format("\t The E_ins Deduction is %.2f$", employee.calculate_TotalDeduction("E_ins"))+ "\n" +
		            String.format("\t The Qpp Deduction is %.2f$", employee.calculate_TotalDeduction("Qpp"))+ "\n" +
		            String.format("\t The Union_d Deduction is %.2f$", employee.calculate_TotalDeduction("Union_d"))+ "\n" +
		            String.format("\t The total Deduction is %.2f$", employee.calculate_TotalDeduction("total"))+ "\n\n" +
		            String.format("\t The Total Net Amount is %.2f$", employee.calculate_NetAmount())+ "\n");
			
			//total values are calculated
			allEmpT += employee.calculate_TotalIncome();
			allEmpNT += employee.calculate_NetAmount();
			allEmpD += employee.calculate_TotalDeduction("total");
			idex++;
		}
		
		//total values are printed
		System.out.println(String.format("All Employee Total Income Amount is: %.2f",allEmpT)+"$"+"\n"+
				String.format("All Employee Net Amount is: %.2f",allEmpNT)+"$"+"\n"+
				String.format("All Employee Total Deduction Amount is: %.2f",allEmpD)+"$");
		
		inFile.close();

	}

}
