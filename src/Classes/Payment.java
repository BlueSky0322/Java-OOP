/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public abstract class Payment {
    public static final double AMOUNT = 50.00;
    protected String passport_no;
    protected String payment_type;
    protected double amount_paid;

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }
    
    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }
    
    public double getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(double amount_paid) {
        this.amount_paid = amount_paid;
    }
    
    public boolean validate_amount_paid(){
        return Payment.AMOUNT <= this.amount_paid;
    }
    
    public abstract boolean make_payment();
}
