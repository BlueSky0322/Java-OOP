/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class Citizen extends People {

    private String ic_no;

    public Citizen() {};
    
    public Citizen(Person person, String ic_no) {
        this.ic_no = ic_no;
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
        this.tel_no = person.tel_no;
        this.email = person.email;
        this.address = person.address;
    }

    public String getIc_no() {
        return ic_no;
    }

    public void setIc_no(String ic_no) {
        this.ic_no = ic_no;
    }

    public String validate_icno() {
        if (!DataAccess.isNumeric(this.ic_no)) {
            return "Invalid IC No.\n";
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
                    + this.getIc_no());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
