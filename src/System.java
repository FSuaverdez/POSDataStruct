/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class System {

    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        new Login().setVisible(true);
        
    }
   
}
class Order{
    private double finalPrice;
    private int qty;
    private double ammountPaid;
    private double ammountChange;

    public Order(double finalPrice, int qty, double ammountPaid, double ammountChange) {
        this.finalPrice = finalPrice;
        this.qty = qty;
        this.ammountPaid = ammountPaid;
        this.ammountChange = ammountChange;
    }
    
    
    
    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmmountPaid() {
        return ammountPaid;
    }

    public void setAmmountPaid(double ammountPaid) {
        this.ammountPaid = ammountPaid;
    }

    public double getAmmountChange() {
        return ammountChange;
    }

    public void setAmmountChange(double ammountChange) {
        this.ammountChange = ammountChange;
    }

    
}