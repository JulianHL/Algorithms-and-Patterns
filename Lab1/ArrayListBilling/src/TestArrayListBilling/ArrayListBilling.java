/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestArrayListBilling;

import java.io.*;
import java.util.*;

/**
 *
 * @author juldh
 */
public class ArrayListBilling {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Scanner inFile = new Scanner(new FileReader("Billing.in"));
        
        List<Billing> billingArrList = new ArrayList<>();
        
        
        
        System.out.println("""
                           
                           Reading from Billing.in Input file:
                           Printing ArrayList billingArrList and perform processing""");
        
        int index = 0;
        while(inFile.hasNext()){
            billingArrList.add(new Billing(inFile.nextDouble(),inFile.nextInt()));
           
            Billing.Prv_Tax=inFile.nextDouble();
            Billing.Fed_Tax=inFile.nextDouble();
            
            System.out.println("\n\nbillingArrList["+index+"] Object: "+billingArrList.get(index).toString()
            +"\n\tThe Total of Billing of billingArrList["+index+"] object is "+String.format("%.2f",billingArrList.get(index).CalculateBilling())+"$");
            
            index++;
        }
            
    }
    
}
