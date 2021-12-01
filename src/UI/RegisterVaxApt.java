/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Appointment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Ng
 */
public class RegisterVaxApt extends javax.swing.JFrame {

    /**
     * Creates new form RegisterVaxApt
     */
    public RegisterVaxApt() {
        initComponents();
        fddTxt.setEditable(false);
        sddTxt.setEditable(false);
        bddTxt.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleCard = new javax.swing.JLabel();
        bddTxt = new javax.swing.JTextField();
        icPassportNoLabel = new javax.swing.JLabel();
        vaccineNameLabel = new javax.swing.JLabel();
        centreNameLabel = new javax.swing.JLabel();
        aptIDLabel = new javax.swing.JLabel();
        fddLabel = new javax.swing.JLabel();
        sddLabel = new javax.swing.JLabel();
        bddLabel = new javax.swing.JLabel();
        vaxNameComboBox = new javax.swing.JComboBox<>();
        icPassportNoTxt = new javax.swing.JTextField();
        aptIDTxt = new javax.swing.JTextField();
        centreNameTxt = new javax.swing.JTextField();
        fddTxt = new javax.swing.JTextField();
        sddTxt = new javax.swing.JTextField();
        registerAptBtn = new javax.swing.JButton();
        backToMenuBtn = new javax.swing.JButton();
        centreAddressLabel = new javax.swing.JLabel();
        centreAddressTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleCard.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titleCard.setText("REGISTER VACCINATION APPOINTMENT");

        icPassportNoLabel.setText("IC/Passport Number:");
        icPassportNoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        vaccineNameLabel.setText("Choose Vaccine:");

        centreNameLabel.setText("Centre Name:");

        aptIDLabel.setText("Appointment ID:");

        fddLabel.setText("First Dose Date:");

        sddLabel.setText("Second Dose Date:");

        bddLabel.setText("Booster Dose Date:");

        vaxNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "Aztrazeneca", "Sinovac" }));
        vaxNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaxNameComboBoxActionPerformed(evt);
            }
        });

        registerAptBtn.setText("Register Appointment");
        registerAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAptBtnActionPerformed(evt);
            }
        });

        backToMenuBtn.setText("Back to Menu");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });

        centreAddressLabel.setText("Centre Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(titleCard)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerAptBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bddLabel)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(sddLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fddLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bddTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(fddTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(sddTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                            .addComponent(backToMenuBtn)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(icPassportNoLabel)
                            .addGap(18, 18, 18)
                            .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vaccineNameLabel)
                                .addComponent(aptIDLabel)
                                .addComponent(centreNameLabel)
                                .addComponent(centreAddressLabel))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(aptIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(vaxNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(centreNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(centreAddressTxt)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icPassportNoLabel)
                    .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineNameLabel)
                    .addComponent(vaxNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aptIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aptIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreNameLabel)
                    .addComponent(centreNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreAddressLabel)
                    .addComponent(centreAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fddLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sddLabel))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bddLabel)
                    .addComponent(bddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerAptBtn)
                    .addComponent(backToMenuBtn))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vaxNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaxNameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaxNameComboBoxActionPerformed

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        this.setVisible(false);
        new PeopleMenu().setVisible(true);
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    private void registerAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAptBtnActionPerformed
        Appointment apt = new Appointment();
        String ic_passport_no = icPassportNoTxt.getText();
        
        //check if input exists in People.txt
        if (apt.validate_ic_passport_no(ic_passport_no)) {
            
            //setting vax first, second, booster dose date fields
            if (vaxNameComboBox.getSelectedItem().equals("Pfizer")) {
                assign_dates(apt, "Pfizer");
            }else if(vaxNameComboBox.getSelectedItem().equals("Aztrazeneca")){
                assign_dates(apt, "Aztrazeneca");
            }else if(vaxNameComboBox.getSelectedItem().equals("Sinovac")){
                assign_dates(apt, "Sinovac");
            }else{
                JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "IC/Passport Number not found!\nPlease register first.");
        }
    }//GEN-LAST:event_registerAptBtnActionPerformed

    public void assign_dates(Appointment apt, String vax_name) {
        apt.setFirst_dose_date(apt.setfdd());
        apt.setSecond_dose_date(apt.setsdd(apt.retrieve_time_delta(vax_name, "Second dose")));
        apt.setBooster_dose_date(apt.setbdd(apt.retrieve_time_delta(vax_name, "Booster dose")));
        fddTxt.setText(apt.getFirst_dose_date());
        sddTxt.setText(apt.getSecond_dose_date());
        bddTxt.setText(apt.getBooster_dose_date());
    }

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
            java.util.logging.Logger.getLogger(RegisterVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterVaxApt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aptIDLabel;
    private javax.swing.JTextField aptIDTxt;
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JLabel bddLabel;
    private javax.swing.JTextField bddTxt;
    private javax.swing.JLabel centreAddressLabel;
    private javax.swing.JTextField centreAddressTxt;
    private javax.swing.JLabel centreNameLabel;
    private javax.swing.JTextField centreNameTxt;
    private javax.swing.JLabel fddLabel;
    private javax.swing.JTextField fddTxt;
    private javax.swing.JLabel icPassportNoLabel;
    private javax.swing.JTextField icPassportNoTxt;
    private javax.swing.JButton registerAptBtn;
    private javax.swing.JLabel sddLabel;
    private javax.swing.JTextField sddTxt;
    private javax.swing.JLabel titleCard;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JComboBox<String> vaxNameComboBox;
    // End of variables declaration//GEN-END:variables
}
