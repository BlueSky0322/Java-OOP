/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author SAREINDRA
 */
public abstract class Personnel extends User{
    
    protected String emp_id;
    protected String job_position;
    
    //return employee id
    public String getEmp_id() {
        return emp_id;
    }
    
    //set employee id
    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }
    
    //return job position
    public String getJob_position() {
        return job_position;
    }
    
    //set job position
    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }
}
