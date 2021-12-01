/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author SAREINDRA
 */
public class HealthcarePersonnel extends Personnel{
    
    public HealthcarePersonnel(Person person, Personnel personnel){
        this.job_position = personnel.job_position;
        this.emp_id = personnel.emp_id;
        this.name = person.name;
        this.age =  person.age;
        this.gender = person.gender;
        this.tel_no = person.tel_no;
        this.email = person.email;
        this.address = person.address;
    }    
    
    public void view_vax_apt(){
        //TO-DO
    }
    
    public void update_vax_status(){
        //TO-DO
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
    }
}
