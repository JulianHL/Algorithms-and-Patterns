package GradeProject;

import java.io.*;
import java.util.*;

public class TestGradeProject {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Grade.in"));
		
		Grade[] all_sgrades = new Grade[6];
		int[] all_sId = new int[6];
		String [] all_sNames = new String[12];
		double [][] all_sScores = new double [6][5];
		
		int index = 0;
		while(inFile.hasNext()) {
			all_sgrades[index] = new Grade();
			all_sgrades[index].setStudent_id(inFile.nextInt());
			all_sgrades[index].setStudent_lname(inFile.next());
			all_sgrades[index].setStudent_fname(inFile.next());
			all_sgrades[index].setS_grade_Assignment1(inFile.nextInt());
			all_sgrades[index].setS_grade_Assignment2(inFile.nextInt());
			all_sgrades[index].setS_grade_Assignment3(inFile.nextInt());
			all_sgrades[index].setS_grade_Mid_Term(inFile.nextInt());
			all_sgrades[index].setS_grade_Final_Term(inFile.nextInt());
			
			all_sId[index] = all_sgrades[index].getStudent_id();
			all_sNames[index*2] = all_sgrades[index].getStudent_fname();
			all_sNames[(index*2)+1] = all_sgrades[index].getStudent_lname();
			all_sScores[index] = new double [] {all_sgrades[index].getS_grade_Assignment1(),all_sgrades[index].getS_grade_Assignment2(),all_sgrades[index].getS_grade_Assignment3(),all_sgrades[index].getS_grade_Mid_Term(), all_sgrades[index].getS_grade_Final_Term()};
			
			System.out.println("\n"+(index+1)+") s_id: "+all_sgrades[index].getStudent_id()+", Student Last Name: "+all_sgrades[index].getStudent_lname()+", Student FirstName: "+all_sgrades[index].getStudent_fname()
					+"\n\nAssignment 1 : "+all_sgrades[index].getS_grade_Assignment1()
					+"\nAssignment 2 : "+all_sgrades[index].getS_grade_Assignment2()
					+"\nAssignment 3 : "+all_sgrades[index].getS_grade_Assignment3()
					+"\nMid Term Exam : "+all_sgrades[index].getS_grade_Mid_Term()
					+"\nFinal Exam : "+all_sgrades[index].getS_grade_Final_Term()
					+"\n\nThe Average score for this Student is "+String.format("%.2f", all_sgrades[index].Calculate_GradeAverage())+"\n\n");
					
			index++;
		}
		inFile.close();
		
		System.out.println("\nAll the students' id:");
		for(int element:all_sId) {
			System.out.println("* "+element);
			
		}
		
		System.out.println("\nAll the students' names:");
		for(int i = 0; i < (all_sNames.length/2); i++) {
			System.out.println("* "+all_sNames[i*2]+" "+all_sNames[(i*2)+1]);
			
		}
		
		index = 0;
		System.out.println("\nAll the students' grades:");
		for(double[] element:all_sScores) {
			
			System.out.println("* "+all_sNames[index*2]+" "+all_sNames[(index*2)+1]+":");
			for(double score:element) {
				System.out.println("- "+score);
			}
			System.out.println("\n");
			
			index++;
			
		}
		
		

	}
	
	

}
