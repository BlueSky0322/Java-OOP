/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class VaccineStorageCentre {

    private int pf_quantity;
    private int az_quantity;
    private int sv_quantity;

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

    public int add_amount(int vax_quantity, int amount) {
        return vax_quantity += amount;
    }

    public int remove_amount(int vax_quantity, int amount) {
        return vax_quantity -= amount;
    }

    public void update_vax_quantity(String centre_id, int pf_quantity, int az_quantity, int sv_quantity) {
        ArrayList<String[]> arrayList = DataAccess.get_data("VaccineStorageCentre.txt");
        for (String[] element : arrayList) {
            if (centre_id.equals(element[0])) {
                element[1] = Integer.toString(pf_quantity);
                element[2] = Integer.toString(az_quantity);
                element[3] = Integer.toString(sv_quantity);
            }
        }

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("VaccineStorageCentre.txt"));
            try (PrintWriter pw = new PrintWriter(bw)) {
                for (String[] element : arrayList) {
                    pw.println(element[0] + ":" + element[1] + ":" + element[2] + ":" + element[3]);
                }
                pw.flush();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
