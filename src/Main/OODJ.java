/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import UI.LoginPage;
import UI.RegisterVaxApt;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ryan Ng
 */
public class OODJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegisterVaxApt login = new RegisterVaxApt();
        login.setVisible(true);
//        System.out.println(getFirst_dose_date());
    }

    public static String getFirst_dose_date() {
        String first_dose_date = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        return first_dose_date;
    }
}
