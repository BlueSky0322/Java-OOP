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
import java.util.Iterator;

/**
 *
 * @author Sareindra
 */
public class AdminStaff extends Personnel {

    public ArrayList<String[]> modify_personnel_details(String search, String mode) {
        ArrayList<String[]> arrayList = DataAccess.get_data("Personnel.txt");

        if (mode.equals("modify")) {
            for (String[] element : arrayList) {
                if (search.equals(element[0])) {
                    element[0] = super.ic_no;
                    element[1] = super.name;
                    element[2] = Integer.toString(super.age);
                    element[3] = Character.toString(this.gender);
                    element[4] = super.emp_id;
                    element[5] = super.job_position;
                }
            }
        } else {
            for (Iterator<String[]> iterator = arrayList.iterator(); iterator.hasNext();) {
                String[] value = iterator.next();
                if (search.equals(value[0])) {
                    iterator.remove();
                    arrayList.remove(value);
                }
            }
        }

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Personnel.txt"));
            try (PrintWriter pw = new PrintWriter(bw)) {
                for (String[] element : arrayList) {
                    pw.println(element[0] + ":" + element[1] + ":" + element[2] + ":" + element[3] + ":"
                            + element[4] + ":" + element[5]);
                }
                pw.flush();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public void add_vax_supply(VaccineStorageCentre vsc, int vax_quantity, int amount) {
        vsc.add_amount(vax_quantity, amount);
    }

    public void remove_vax_supply(VaccineStorageCentre vsc, int vax_quantity, int amount) {
        vsc.add_amount(vax_quantity, amount);
    }

    public void modify_vax_supply() {

    }
}
