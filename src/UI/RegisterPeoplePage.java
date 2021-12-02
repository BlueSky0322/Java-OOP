/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Citizen;
import Classes.Noncitizen;
import Classes.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Ng
 */
public class RegisterPeoplePage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPeoplePage() {
        initComponents();
        citizenRBtn.setSelected(true);
        icPassportNoLabel.setText("IC Number:");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        telNoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        telNoTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        TITLE = new javax.swing.JLabel();
        citizenshipLabel = new javax.swing.JLabel();
        icPassportNoLabel = new javax.swing.JLabel();
        citizenRBtn = new javax.swing.JRadioButton();
        nonCitizenRBtn = new javax.swing.JRadioButton();
        icPassportNoTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        errorMessageLabel = new javax.swing.JLabel();
        backToLoginBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name:");

        ageLabel.setText("Age:");

        genderLabel.setText("Gender (M/F):");

        telNoLabel.setText("Telephone No.:");

        emailLabel.setText("Email:");

        addressLabel.setText("Address:");

        TITLE.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        TITLE.setText("REGISTER PAGE");

        citizenshipLabel.setText("Citizenship:");

        icPassportNoLabel.setText("IC Number:");

        citizenRBtn.setText("Citizen");
        citizenRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citizenRBtnActionPerformed(evt);
            }
        });

        nonCitizenRBtn.setText("Non-Citizen");
        nonCitizenRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonCitizenRBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        errorMessageLabel.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        errorMessageLabel.setForeground(new java.awt.Color(255, 51, 51));

        backToLoginBtn.setText("Back to Login");
        backToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errorMessageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(registerBtn)
                                .addGap(65, 65, 65)
                                .addComponent(backToLoginBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telNoLabel)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(icPassportNoLabel)
                                        .addComponent(citizenshipLabel)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ageTxt)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(emailTxt)
                                        .addComponent(genderTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(telNoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(citizenRBtn)
                                            .addGap(34, 34, 34)
                                            .addComponent(nonCitizenRBtn)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(TITLE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(TITLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoLabel)
                    .addComponent(telNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citizenshipLabel)
                    .addComponent(citizenRBtn)
                    .addComponent(nonCitizenRBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icPassportNoLabel)
                    .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(backToLoginBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nonCitizenRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonCitizenRBtnActionPerformed
        if (nonCitizenRBtn.isSelected()) {
            citizenRBtn.setSelected(false);
            icPassportNoLabel.setText("Passport Number:");
        }
    }//GEN-LAST:event_nonCitizenRBtnActionPerformed

    private void citizenRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citizenRBtnActionPerformed
        if (citizenRBtn.isSelected()) {
            nonCitizenRBtn.setSelected(false);
            icPassportNoLabel.setText("IC Number:");
        }
    }//GEN-LAST:event_citizenRBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        Person person = new Person();

        String errorMessages = "";

        String name = nameTxt.getText();
        errorMessages += person.validate_age(ageTxt.getText());
        errorMessages += person.validate_gender(genderTxt.getText());
        int age = 0;
        char gender = 0;
        if (errorMessages.isEmpty()) {
            age = Integer.parseInt(ageTxt.getText());
            gender = genderTxt.getText().charAt(0);
        }

        String tel_no = telNoTxt.getText();
        String email = emailTxt.getText();
        String address = addressTxt.getText();

        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setTel_no(tel_no);
        person.setEmail(email);
        person.setAddress(address);

        errorMessages += person.validate_name();
        errorMessages += person.validate_tel_no();
        errorMessages += person.validate_email();
        errorMessages += person.validate_address();

        if (citizenRBtn.isSelected()) {
            nonCitizenRBtn.setSelected(false);
            String ic_no = icPassportNoTxt.getText();
            Citizen ctz = new Citizen(person, ic_no);
            ctz.setIc_no(ic_no);
            ctz.setIs_citizen(true);

            errorMessages += ctz.validate_icno();

            if (errorMessages.isEmpty()) {
                ctz.register_vax_prg();
                JOptionPane.showMessageDialog(null, "Registration successful");
            } else {
                errorMessageLabel.setText(errorMessages);
            }
        } else {
            citizenRBtn.setSelected(false);
            String passport_no = icPassportNoTxt.getText();
            Noncitizen nctz = new Noncitizen(person, passport_no);
            nctz.setPassport_no(passport_no);
            nctz.setIs_citizen(false);

            errorMessages += nctz.validate_passportno();

            if (errorMessages.isEmpty()) {
                nctz.register_vax_prg();
                JOptionPane.showMessageDialog(null, "Registration successful.\nPlease proceed to payment.");
                this.setVisible(false);
                new PaymentPage(nctz.getPassport_no()).setVisible(true);
            } else {
                errorMessageLabel.setText(errorMessages);
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginBtnActionPerformed
        this.setVisible(false);
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_backToLoginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPeoplePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPeoplePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPeoplePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPeoplePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPeoplePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backToLoginBtn;
    private javax.swing.JRadioButton citizenRBtn;
    private javax.swing.JLabel citizenshipLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel icPassportNoLabel;
    private javax.swing.JTextField icPassportNoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JRadioButton nonCitizenRBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoTxt;
    // End of variables declaration//GEN-END:variables
}
