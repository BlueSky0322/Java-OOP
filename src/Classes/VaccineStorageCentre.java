/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ryan Ng
 */
public class VaccineStorageCentre{
    private int pf_quantity;
    private int az_quantity;
    private int sv_quantity;
    private int amount;

    public int getPf_quantity() {
        return pf_quantity;
    }

    public void setPf_quantity(int pf_quantity) {
        this.pf_quantity = pf_quantity;
    }

    public int getAz_quantity() {
        return az_quantity;
    }

    public void setAz_quantity(int az_quantity) {
        this.az_quantity = az_quantity;
    }

    public int getSv_quantity() {
        return sv_quantity;
    }

    public void setSv_quantity(int sv_quantity) {
        this.sv_quantity = sv_quantity;
    }
    
    public int add_amount(int vax_quantity, int amount){
        return vax_quantity += amount;
    }
    
    public int remove_amount(int vax_quantity, int amount){
        return vax_quantity -= amount;
    }
}
