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
 * @author SAREINDRA
 */
public class Admin_Staff extends Personnel{
    
    public Admin_Staff(Person person, Personnel personnel){
        this.job_position = personnel.job_position;
        this.emp_id = personnel.emp_id;
        this.name = person.name;
        this.age =  person.age;
        this.gender = person.gender;
        this.tel_no = person.tel_no;
        this.email = person.email;
        this.address = person.address;
    }   
    
    public void add_vax_supply(Vaccine vac){
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Vaccine.txt", true));
            //To be added in GUI part
            //Vaccine vac = new Vaccine(vax_code,vax_name,vax_quantity,vax_time_delta,booster_time_delta);
            
            bw.write(vac.getVax_code() + ":" + vac.getVax_name() + ":" + vac.getVax_quantity() + ":" + vac.getVax_time_delta() + ":"
                    + vac.getBooster_time_delta());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
