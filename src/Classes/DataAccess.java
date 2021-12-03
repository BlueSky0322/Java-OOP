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
 * @author Ryan Ng, Sareindra
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
    
    public static boolean validate_duplicate(String filename, String data, String initial, int column) {
        ArrayList<String[]> arrayList = DataAccess.get_data(filename);
        for (String[] element : arrayList) {
            if (!data.equals(initial) && data.equals(element[column])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean validate_data(String filename, String data, int column) {
        ArrayList<String[]> arrayList = DataAccess.get_data(filename);
        for (String[] element : arrayList) {
            if (data.equals(element[column])) {
                return true;
            }
        }
        return false;
    }
    
    public static String[] get_data_by_var(String filename, String var, int ary_size, int column) {
        String[] arrayList = new String[ary_size];
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tempAry = line.split(":");
                if (tempAry.length < 1) {
                    break;
                } 
                if (var.equals(tempAry[column])){
                    arrayList = tempAry; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
    
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
