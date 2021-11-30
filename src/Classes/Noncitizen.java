/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan Ng
 */
public class Noncitizen extends People {

    private String passport_no;

    public Noncitizen(Person person, String passport_no) {
        this.passport_no = passport_no;
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
        this.tel_no = person.tel_no;
        this.email = person.email;
        this.address = person.address;
    }

    /**
     * Get the value of passport_no
     *
     * @return the value of passport_no
     */
    public String getPassport_no() {
        return passport_no;
    }

    /**
     * Set the value of passport_no
     *
     * @param passport_no new value of passport_no
     */
    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public String validate_passportno() {
        if (this.passport_no.isEmpty()) {
            return "Invalid Passport No.";
        }
        return "";
    }

    @Override
    public void register_vax_prg() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("People.txt", true));
            bw.write(super.getName() + ":" + super.getAge() + ":" + super.getGender() + ":" + super.getTel_no() + ":"
                    + super.getEmail() + ":" + super.getAddress() + ":" + super.getIs_citizen() + ":"
                    + this.getPassport_no());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

}
