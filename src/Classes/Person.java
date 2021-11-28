/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ryan Ng
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
        if (this.name.isEmpty()) {
            return "Invalid Name, ";
        }
        return "";
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String validate_age(String age) {
        if (age.isEmpty() || !isNumeric(age)) {
            return "Invalid Age, ";
        }
        return "";
    }

    public String validate_gender(String gender) {
        if (gender.equals("F") || gender.equals("M")) {
            return "";
        }
        return "Invalid gender, " + gender;
    }

    public boolean check_duplicate() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("People.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                if (this.tel_no.equals(ary[3])) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String validate_tel_no() {
        if (this.tel_no.isEmpty() || !isNumeric(this.tel_no)) {
            return "Invalid Telephone No., ";
        }
        
        if (this.check_duplicate()){
            return "Duplicate record detected. Please try again.";
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

}
