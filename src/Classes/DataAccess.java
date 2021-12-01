/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ryan Ng
 */
public class DataAccess {
    public static ArrayList<String[]> get_data(String filename) {
        ArrayList<String[]> arrayList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                } else {
                    arrayList.add(ary);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
    
    public static String[] get_vac_apt_by_id(String id) {
        String[] arrayList = new String[9];
        try {
            BufferedReader br = new BufferedReader(new FileReader("Appointment.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tempAry = line.split(":");
                if (tempAry.length < 1) {
                    break;
                } 
                if (id.equals(tempAry[0])){
                    arrayList = tempAry; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
