/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestArrayListBilling;

/**
 *
 * @author juldh
 */
public class Billing {
    private double prd_Price;
    private int prd_Qty;
    public static double Fed_Tax=0;
    public static double Prv_Tax=0;

    public Billing() {
        prd_Price = 0;
        prd_Qty = 0;
    }

    public Billing(double prd_Price, int prd_Qty) {
        this.prd_Price = prd_Price;
        this.prd_Qty = prd_Qty;
 
    }

    public double getPrd_Price() {
        return prd_Price;
    }

    public void setPrd_Price(double prd_Price) {
        this.prd_Price = prd_Price;
    }

    public int getPrd_Qty() {
        return prd_Qty;
    }

    public void setPrd_Qty(int prd_Qty) {
        this.prd_Qty = prd_Qty;
    }
    
    public double CalculateBillingWithOutTaxes(){
        double WOT_Billing = (prd_Price* prd_Qty);
        return WOT_Billing;
    }
    public double CalculateBilling(){
        double T_Billing = (prd_Price* prd_Qty) + ((prd_Price*prd_Qty)* Fed_Tax) + ((prd_Price*prd_Qty)* Prv_Tax);
        return T_Billing;
    }

    @Override
    public String toString() {
        return "Billing{" + "prd_Price=" + prd_Price + ", prd_Qty=" + prd_Qty + '}';
    }
    
    

    
    
}
