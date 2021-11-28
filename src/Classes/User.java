/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ryan Ng
 */
public class User extends Person {

    protected String username;
    protected String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean verify_admin_login(){
        return this.username.equals("admin") && this.password.equals("admin123");
    }
    
    public boolean verify_people_login(){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("People.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if(ary.length<1){
                    break;
                }
                if(this.username.equals(ary[3]) && this.password.equals(ary[7])){
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
