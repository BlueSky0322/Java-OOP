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
 * @author Sareindra
 */
public class Personnel extends User {

    protected String ic_no;
    protected String emp_id;
    protected String job_position;
    
    public Personnel() {};
    
    public Personnel(Person person, String ic_no, String emp_id, String job_position) {
        this.ic_no = ic_no;
        this.emp_id = emp_id;
        this.job_position = job_position;
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
    }

    public String getIc_no() {
        return ic_no;
    }

    public void setIc_no(String ic_no) {
        this.ic_no = ic_no;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getJob_position() {
        return job_position;
    }

    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }
        
    public void register_personnel() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Personnel.txt", true));
            bw.write(this.getIc_no() + ":" + super.getName() + ":" + super.getAge() + ":"
                    + super.getGender() + ":" + this.getEmp_id() + ":" + this.getJob_position());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
