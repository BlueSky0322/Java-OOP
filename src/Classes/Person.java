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

    public Person() {}

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
            return "Invalid Name\n";
        }
        return "";
    }

    public String validate_age(String age) {
        if (!DataAccess.isNumeric(age)) {
            return "Invalid Age\n";
        }
        return "";
    }

    public String validate_gender(String gender) {
        if (gender.equals("F") || gender.equals("M")) {
            return "";
        }
        return "Invalid gender\n";
    }

    public String validate_tel_no() {
        if (!DataAccess.isNumeric(this.tel_no)) {
            return "Invalid Telephone No.\n";
        }
        return "";
    }

    public String validate_email() {
        if (this.email.isEmpty()) {
            return "Invalid Email\n";
        }
        return "";
    }

    public String validate_address() {
        if (this.address.isEmpty()) {
            return "Invalid Address\n";
        }
        return "";
    }

    public ArrayList<String[]> modify_person_details(String search, String mode) {
        ArrayList<String[]> arrayList = DataAccess.get_data("People.txt");

        if (mode.equals("modify")) {
            for (String[] element : arrayList) {
                if (search.equals(element[7])) {
                    element[0] = this.name;
                    element[1] = Integer.toString(this.age);
                    element[2] = Character.toString(this.gender);
                    element[3] = this.tel_no;
                    element[4] = this.email;
                    element[5] = this.address;
                    element[6] = this.is_citizen ? "true" : "false";
                }
            }
        } else {

            for (Iterator<String[]> iterator = arrayList.iterator(); iterator.hasNext();) {
                String[] value = iterator.next();
                if (search.equals(value[7])) {
                    iterator.remove();
                    arrayList.remove(value);
                }
            }
        }

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("People.txt"));
            try (PrintWriter pw = new PrintWriter(bw)) {
                for (String[] element : arrayList) {
                    pw.println(element[0] + ":" + element[1] + ":" + element[2] + ":" + element[3] + ":"
                            + element[4] + ":" + element[5] + ":" + element[6] + ":" + element[7]);
                }
                pw.flush();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
