/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import UI.LoginPage;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan Ng
 */
public class OODJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginPage login = new LoginPage();
        login.setVisible(true);
    }
}
