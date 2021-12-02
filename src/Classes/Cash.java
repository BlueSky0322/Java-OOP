/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class Cash extends Payment {
    protected double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double calc_balance(){
        this.balance = super.amount_paid - Payment.AMOUNT;
        return this.balance;
    }
    
    @Override
    public boolean make_payment() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Payment.txt", true));
            bw.write(super.getPassport_no()+ ":"  + super.getPayment_type() + ":" + super.getAmount_paid() + ":" + this.balance);
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
