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
public class BankTransfer extends Payment {
    private String bank_acc_no;
    private String bank_name;
    
    public String getBankAccNo() {
        return bank_acc_no;
    }

    public void setBankAccNo(String bank_acc_no) {
        this.bank_acc_no = bank_acc_no;
    }

    public String getBankName() {
        return bank_name;
    }

    public void setBankName(String bank_name) {
        this.bank_name = bank_name;
    }
    
    @Override
    public boolean make_payment() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Payment.txt", true));
            bw.write(super.getPassport_no()+ ":"  + super.getPayment_type() + ":" + this.bank_acc_no + ":" + this.bank_name + ":" 
                    + super.getAmount_paid());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    @Override
    public boolean validate_amount_paid(){
        return Payment.AMOUNT == this.amount_paid;
    }   
}
