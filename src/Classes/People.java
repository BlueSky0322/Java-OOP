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
public class People extends User{
    public void register_vax_prg(){
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("People.txt", true));
            bw.write(super.getName() + ":" + super.getAge() + ":" + super.getGender() + ":" + super.getTel_no() + ":"
                    + super.getEmail() + ":" + super.getAddress() + ":" + super.getIs_citizen());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
