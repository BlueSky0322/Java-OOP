/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class Person {

    protected String name;
    protected int age;
    protected char gender;
    protected String tel_no;
    protected String email;
    protected String address;
    protected boolean is_citizen;

    public Person() {
    }

    ;
    
    public boolean getIs_citizen() {
        return is_citizen;
    }

    public void setIs_citizen(boolean is_citizen) {
        this.is_citizen = is_citizen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String validate_name() {
        if (DataAccess.isNumeric(this.name)) {
            return "Invalid Name, ";
        }
        return "";
    }

    public String validate_age(String age) {
        if (age.isEmpty() || !DataAccess.isNumeric(age)) {
            return "Invalid Age, ";
        }
        return "";
    }

    public String validate_gender(String gender) {
        if (gender.equals("F") || gender.equals("M")) {
            return "";
        }
        return "Invalid gender, ";
    }

    public boolean search_id(String search) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("People.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                if (search.equals(ary[7])) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String validate_tel_no() {
        if (this.tel_no.isEmpty() || !DataAccess.isNumeric(this.tel_no)) {
            return "Invalid Telephone No., ";
        }
        return "";
    }

    public String validate_email() {
        if (this.email.isEmpty()) {
            return "Invalid Email, ";
        }
        return "";
    }

    public String validate_address() {
        if (this.address.isEmpty()) {
            return "Invalid Address, ";
        }
        return "";
    }

    public ArrayList<String[]> modify_details(String search, String mode) {
        ArrayList<String[]> arrayList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("People.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                } else {
                    arrayList.add(ary);
                }
            }

            if (mode.equals("modify")) {
                for (String[] element : arrayList) {
                    if (search.equals(element[7])) {
                        element[0] = this.name;
                        element[1] = Integer.toString(this.age);
                        element[2] = Character.toString(this.gender);
                        element[3] = this.tel_no;
                        element[4] = this.email;
                        element[5] = this.address;
                    }
                }
            } else {
                
                for (Iterator<String[]> iterator = arrayList.iterator(); iterator.hasNext();) {
                    String[] value = iterator.next();
                    if (search.equals(value[7])) {
                        iterator.remove();
                    }
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("People.txt"));
            PrintWriter pw = new PrintWriter(bw);
            for (String[] element : arrayList) {
                pw.println(element[0] + ":" + element[1] + ":" + element[2] + ":" + element[3] + ":"
                        + element[4] + ":" + element[5] + ":" + element[6] + ":"
                        + element[7]);
            }

            pw.flush();
            pw.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
