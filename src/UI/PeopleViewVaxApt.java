/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Appointment;
import Classes.DataAccess;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class PeopleViewVaxApt extends javax.swing.JFrame {

    /**
     * Creates new form RegisterVaxApt
     */
    private ArrayList<String[]> arrayList;
    private ListIterator<String[]> listIterator;
    int size;

    public PeopleViewVaxApt() {
        initComponents();
        vaxNameTxt.setEditable(false);
        aptIDTxt.setEditable(false);
        centreNameTxt.setEditable(false);
        centreAddressTxt.setEditable(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        titleCard = new javax.swing.JLabel();
        bddTxt = new javax.swing.JTextField();
        icPassportNoLabel = new javax.swing.JLabel();
        vaccineNameLabel = new javax.swing.JLabel();
        centreNameLabel = new javax.swing.JLabel();
        aptIDLabel = new javax.swing.JLabel();
        fddLabel = new javax.swing.JLabel();
        sddLabel = new javax.swing.JLabel();
        bddLabel = new javax.swing.JLabel();
        icPassportNoTxt = new javax.swing.JTextField();
        aptIDTxt = new javax.swing.JTextField();
        centreNameTxt = new javax.swing.JTextField();
        fddTxt = new javax.swing.JTextField();
        sddTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        backToMenuBtn = new javax.swing.JButton();
        centreAddressLabel = new javax.swing.JLabel();
        centreAddressTxt = new javax.swing.JTextField();
        vaxNameTxt = new javax.swing.JTextField();
        titleCardLabel2 = new javax.swing.JLabel();
        cancelAptBtn = new javax.swing.JButton();
        vaxStatusLabel = new javax.swing.JLabel();
        vaxStatusTxtLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleCard.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titleCard.setText("VIEW VACCINATION APPOINTMENT");

        icPassportNoLabel.setText("IC/Passport Number:");
        icPassportNoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        vaccineNameLabel.setText("Vaccine Name:");

        centreNameLabel.setText("Centre Name:");

        aptIDLabel.setText("Appointment ID:");

        fddLabel.setText("First Dose Date:");

        sddLabel.setText("Second Dose Date:");

        bddLabel.setText("Booster Dose Date:");

        searchBtn.setText("Search/View");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backToMenuBtn.setText("Back to Menu");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });

        centreAddressLabel.setText("Centre Address:");

        titleCardLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        titleCardLabel2.setText("Your Vaccination Appointment");

        cancelAptBtn.setText("Cancel Appointment");
        cancelAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAptBtnActionPerformed(evt);
            }
        });

        vaxStatusLabel.setText("Vaccination Status:");

        vaxStatusTxtLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vaxStatusTxtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleCard)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(icPassportNoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(vaccineNameLabel)
                                        .addComponent(centreNameLabel)
                                        .addComponent(aptIDLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vaxNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(centreNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(aptIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelAptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backToMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(vaxStatusLabel)
                                        .addComponent(centreAddressLabel)
                                        .addComponent(fddLabel)
                                        .addComponent(sddLabel)
                                        .addComponent(bddLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(centreAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vaxStatusTxtLabel))
                                    .addGap(21, 21, 21)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(titleCardLabel2)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icPassportNoLabel)
                    .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(26, 26, 26)
                .addComponent(titleCardLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aptIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aptIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineNameLabel)
                    .addComponent(vaxNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreNameLabel)
                    .addComponent(centreNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vaxStatusLabel)
                    .addComponent(vaxStatusTxtLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelAptBtn)
                    .addComponent(backToMenuBtn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        this.setVisible(false);
        new PeopleMenu().setVisible(true);
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String id = icPassportNoTxt.getText();
        String[] ary = DataAccess.get_data_by_var("Appointment.txt", id, 9, 0);

        if (!icPassportNoTxt.getText().equals("")) {
            if (ary[0] == null) {
                JOptionPane.showMessageDialog(null, "Record not found.");
                icPassportNoTxt.setText("");
            } else {
                icPassportNoTxt.setText(ary[0]);
                vaxNameTxt.setText(ary[1]);
                aptIDTxt.setText(ary[2]);
                centreNameTxt.setText(ary[3]);
                centreAddressTxt.setText(ary[4]);
                fddTxt.setText(ary[5]);
                sddTxt.setText(ary[6]);
                bddTxt.setText(ary[7]);
                vaxStatusTxtLabel.setText(ary[8]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Some fields are empty");
        }


    }//GEN-LAST:event_searchBtnActionPerformed

    private void cancelAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAptBtnActionPerformed
        Appointment apt = new Appointment();
        listIterator = apt.modify_apt_details(icPassportNoTxt.getText(), "remove").listIterator();
        clearFields();
        JOptionPane.showMessageDialog(null, "Changes have been made.");
    }//GEN-LAST:event_cancelAptBtnActionPerformed

    void clearFields() {
        icPassportNoTxt.setText("");
        vaxNameTxt.setText("");
        aptIDTxt.setText("");
        centreNameTxt.setText("");
        centreAddressTxt.setText("");
        fddTxt.setText("");
        sddTxt.setText("");
        bddTxt.setText("");
        vaxStatusTxtLabel.setText("");
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
            java.util.logging.Logger.getLogger(PeopleViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleViewVaxApt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aptIDLabel;
    private javax.swing.JTextField aptIDTxt;
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JLabel bddLabel;
    private javax.swing.JTextField bddTxt;
    private javax.swing.JButton cancelAptBtn;
    private javax.swing.JLabel centreAddressLabel;
    private javax.swing.JTextField centreAddressTxt;
    private javax.swing.JLabel centreNameLabel;
    private javax.swing.JTextField centreNameTxt;
    private javax.swing.JLabel fddLabel;
    private javax.swing.JTextField fddTxt;
    private javax.swing.JLabel icPassportNoLabel;
    private javax.swing.JTextField icPassportNoTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel sddLabel;
    private javax.swing.JTextField sddTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel titleCard;
    private javax.swing.JLabel titleCardLabel2;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JTextField vaxNameTxt;
    private javax.swing.JLabel vaxStatusLabel;
    private javax.swing.JLabel vaxStatusTxtLabel;
    // End of variables declaration//GEN-END:variables
}
