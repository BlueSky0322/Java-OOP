/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ryan Ng, Sareindra
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

    public String verify_admin_login() {
        String[] user_data = DataAccess.get_data_by_var("Personnel.txt", this.username, 6, 0);
        if (user_data[0] == null) {
            return "";
        } else {
            if (user_data[0].equals(this.username) && user_data[4].equals(this.password)) {
                return user_data[5];
            }
        }
        return "";
    }

    public boolean verify_people_login() {
        return DataAccess.validate_data("People.txt", this.username, 3) && DataAccess.validate_data("People.txt", this.password, 7);
    }
}
