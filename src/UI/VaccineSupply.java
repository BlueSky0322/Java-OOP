/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.DataAccess;
import Classes.VaccineStorageCentre;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class VaccineSupply extends javax.swing.JFrame {

    /**
     * Creates new form VaccineSupply
     */
    private String user_type = "";
    private String centre_id = "1";

    public VaccineSupply(String user_type) {
        initComponents();
        this.user_type = user_type;
        centreNameTxt.setEditable(false);
        centreAddressTxt.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleCardLabel2 = new javax.swing.JLabel();
        centreIDComboBox = new javax.swing.JComboBox<>();
        centreIDLabel = new javax.swing.JLabel();
        centreNameLabel = new javax.swing.JLabel();
        centreAddressLabel = new javax.swing.JLabel();
        centreNameTxt = new javax.swing.JTextField();
        centreAddressTxt = new javax.swing.JTextField();
        pfLabel = new javax.swing.JLabel();
        azLabel = new javax.swing.JLabel();
        svLabel = new javax.swing.JLabel();
        pfTxt = new javax.swing.JTextField();
        azTxt = new javax.swing.JTextField();
        vaxNameLabel = new javax.swing.JLabel();
        vaxNameComboBox = new javax.swing.JComboBox<>();
        amountLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        amountSpinner = new javax.swing.JSpinner();
        removeBtn = new javax.swing.JButton();
        svTxt = new javax.swing.JTextField();
        backToMenuBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleCardLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titleCardLabel2.setText("MANAGE VACCINE SUPPLY");

        centreIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        centreIDLabel.setText("Choose Centre ID:");

        centreNameLabel.setText("Centre Name:");

        centreAddressLabel.setText("Centre Address:");

        pfLabel.setText("Pfizer Supply:");

        azLabel.setText("Astrazeneca Supply:");

        svLabel.setText("Sinovac Supply:");

        vaxNameLabel.setText("Choose Vaccine to Add/Remove:");

        vaxNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "Aztrazeneca", "Sinovac" }));

        amountLabel.setText("Amount:");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        amountSpinner.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        amountSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        backToMenuBtn.setText("Back to Menu");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search / View Vaccine Supply");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(centreIDLabel)
                            .addComponent(centreNameLabel)
                            .addComponent(centreAddressLabel)
                            .addComponent(azLabel)
                            .addComponent(svLabel)
                            .addComponent(pfLabel))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(centreIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(centreAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(azTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(svTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addComponent(modifyBtn))
                                .addComponent(centreNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(titleCardLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(18, 18, 18)
                                .addComponent(removeBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backToMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountLabel)
                                    .addComponent(vaxNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vaxNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleCardLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centreIDLabel)
                    .addComponent(searchBtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centreNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centreAddressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfLabel))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(azLabel)
                    .addComponent(modifyBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaxNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaxNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(removeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backToMenuBtn)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        this.setVisible(false);
        new PersonnelMenu(this.user_type).setVisible(true);
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    int check_mode(String mode, int existing_amount, int amount) {
        VaccineStorageCentre vsc = new VaccineStorageCentre();
        return mode.equals("Add")
                ? vsc.add_amount(existing_amount, amount) : vsc.remove_amount(existing_amount, amount);
    }

    boolean update(String mode) {
        VaccineStorageCentre vsc = new VaccineStorageCentre();
        String[] vscAry = DataAccess.get_data_by_var("VaccineStorageCentre.txt", this.centre_id, 4, 0);
        if (azTxt.getText().equals("") || pfTxt.getText().equals("") || svTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are empty!");
        } else {
            if (centre_id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select centre ID.");
            } else if (!DataAccess.isNumeric(amountSpinner.getValue().toString())) {
                JOptionPane.showMessageDialog(null, "Invalid amount!");
            } else {
                int amount = (int) amountSpinner.getValue();

                if (vaxNameComboBox.getSelectedItem().equals("Pfizer")) {
                    int new_pf_quantity = check_mode(mode, Integer.parseInt(vscAry[1]), amount);
                    if (new_pf_quantity >= 0) {
                        vsc.update_vax_quantity(centre_id, new_pf_quantity, Integer.parseInt(azTxt.getText()), Integer.parseInt(svTxt.getText()));
                        pfTxt.setText(Integer.toString(new_pf_quantity));
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid amount!");
                        return false;
                    }

                } else if (vaxNameComboBox.getSelectedItem().equals("Aztrazeneca")) {
                    int new_az_quantity = check_mode(mode, Integer.parseInt(vscAry[2]), amount);
                    if (new_az_quantity >= 0) {
                        vsc.update_vax_quantity(centre_id, Integer.parseInt(pfTxt.getText()), new_az_quantity, Integer.parseInt(svTxt.getText()));
                        azTxt.setText(Integer.toString(new_az_quantity));
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid amount!");
                        return false;
                    }

                } else if (vaxNameComboBox.getSelectedItem().equals("Sinovac")) {
                    int new_sv_quantity = check_mode(mode, Integer.parseInt(vscAry[3]), amount);
                    if (new_sv_quantity >= 0) {
                        vsc.update_vax_quantity(centre_id, Integer.parseInt(pfTxt.getText()), Integer.parseInt(azTxt.getText()), new_sv_quantity);
                        svTxt.setText(Integer.toString(new_sv_quantity));
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid amount!");
                        return false;
                    }

                }
            }
        }
        return false;
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (update("Add")) {
            JOptionPane.showMessageDialog(null, "Quantity updated!");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        if (update("Remove")) {
            JOptionPane.showMessageDialog(null, "Quantity updated!");
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        this.centre_id = centreIDComboBox.getSelectedItem().toString();
        String[] vscAry = DataAccess.get_data_by_var("VaccineStorageCentre.txt", this.centre_id, 4, 0);
        String[] centreAry = DataAccess.get_data_by_var("Centre.txt", this.centre_id, 3, 0);

        if (!centreIDComboBox.getSelectedItem().equals("")) {
            if (vscAry[0] == null) {
                JOptionPane.showMessageDialog(null, "Record not found.");
                centreIDComboBox.setSelectedIndex(0);
            } else {
                centreNameTxt.setText(centreAry[1]);
                centreAddressTxt.setText(centreAry[2]);
                pfTxt.setText(vscAry[1]);
                azTxt.setText(vscAry[2]);
                svTxt.setText(vscAry[3]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Some fields are empty");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        VaccineStorageCentre vsc = new VaccineStorageCentre();
        if (azTxt.getText().equals("") || pfTxt.getText().equals("") || svTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are empty!");
        } else {
            if (centre_id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select centre ID.");
            } else if (!DataAccess.isNumeric(azTxt.getText()) || !DataAccess.isNumeric(pfTxt.getText()) || !DataAccess.isNumeric(svTxt.getText())) {
                JOptionPane.showMessageDialog(null, "Invalid quantity!");
            } else {
                vsc.update_vax_quantity(centre_id, Integer.parseInt(pfTxt.getText()),
                        Integer.parseInt(azTxt.getText()), Integer.parseInt(svTxt.getText()));
                JOptionPane.showMessageDialog(null, "Supply updated.");
            }
        }
    }//GEN-LAST:event_modifyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VaccineSupply.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccineSupply.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccineSupply.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccineSupply.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccineSupply("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JLabel azLabel;
    private javax.swing.JTextField azTxt;
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JLabel centreAddressLabel;
    private javax.swing.JTextField centreAddressTxt;
    private javax.swing.JComboBox<String> centreIDComboBox;
    private javax.swing.JLabel centreIDLabel;
    private javax.swing.JLabel centreNameLabel;
    private javax.swing.JTextField centreNameTxt;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel pfLabel;
    private javax.swing.JTextField pfTxt;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel svLabel;
    private javax.swing.JTextField svTxt;
    private javax.swing.JLabel titleCardLabel2;
    private javax.swing.JComboBox<String> vaxNameComboBox;
    private javax.swing.JLabel vaxNameLabel;
    // End of variables declaration//GEN-END:variables
}
