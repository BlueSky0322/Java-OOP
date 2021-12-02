/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


/**
 *
 * @author SAREINDRA
 */
public class AdminStaff extends Personnel {
    VaccineStorageCentre vsc = new VaccineStorageCentre();

    public void add_vax_supply(int vax_quantity, int amount) {
        vsc.add_amount(vax_quantity, amount);
    }

    public void remove_vax_supply(int vax_quantity, int amount) {
        vsc.add_amount(vax_quantity, amount);
    }
    
    public void modify_vax_supply() {
        
    }
}
