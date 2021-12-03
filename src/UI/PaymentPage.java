/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.BankTransfer;
import Classes.Cash;
import Classes.DataAccess;
import Classes.Noncitizen;
import Classes.Payment;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class PaymentPage extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    private String selected_payment_type;
    private final Noncitizen nctz;

    public PaymentPage(Noncitizen nctz) {
        initComponents();
        this.nctz = nctz;
        selected_payment_type = "Cash";
        registeredPeopleTxt.setText(nctz.getPassport_no());
        registeredPeopleTxt.setEditable(false);
        bankNameLabel.setVisible(false);
        bankNameTxt.setVisible(false);
        accNoLabel.setVisible(false);
        accNoTxt.setVisible(false);
        amountDueTxt.setText(Double.toString(Payment.AMOUNT));
        amountDueTxt.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountDueLabel = new javax.swing.JLabel();
        amountPaidLabel = new javax.swing.JLabel();
        bankNameLabel = new javax.swing.JLabel();
        accNoLabel = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        amountDueTxt = new javax.swing.JTextField();
        amountPaidTxt = new javax.swing.JTextField();
        bankNameTxt = new javax.swing.JTextField();
        accNoTxt = new javax.swing.JTextField();
        titleCardPaymentLabel = new javax.swing.JLabel();
        cashBtn = new javax.swing.JButton();
        bankTransferBtn = new javax.swing.JButton();
        registeredPeopleLabel = new javax.swing.JLabel();
        registeredPeopleTxt = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        amountDueLabel.setText("Amount Due:");

        amountPaidLabel.setText("Amount Paid:");

        bankNameLabel.setText("Bank Name:");

        accNoLabel.setText("Account Number:");

        payBtn.setText("Make Payment");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        titleCardPaymentLabel.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titleCardPaymentLabel.setText("MAKE PAYMENT");

        cashBtn.setText("Pay by Cash");
        cashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashBtnActionPerformed(evt);
            }
        });

        bankTransferBtn.setText("Pay by Bank Transfer");
        bankTransferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankTransferBtnActionPerformed(evt);
            }
        });

        registeredPeopleLabel.setText("Passport No.:");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(cashBtn)
                        .addGap(41, 41, 41)
                        .addComponent(bankTransferBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountPaidLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registeredPeopleLabel)
                                        .addComponent(amountDueLabel)))
                                .addGap(18, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountPaidTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registeredPeopleTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountDueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accNoLabel)
                                    .addComponent(bankNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bankNameTxt)
                                    .addComponent(accNoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(titleCardPaymentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(payBtn)
                        .addGap(56, 56, 56)
                        .addComponent(cancelBtn)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleCardPaymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashBtn)
                    .addComponent(bankTransferBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registeredPeopleLabel)
                    .addComponent(registeredPeopleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountDueLabel)
                    .addComponent(amountDueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountPaidLabel)
                    .addComponent(amountPaidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankNameLabel)
                    .addComponent(bankNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accNoLabel)
                    .addComponent(accNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payBtn)
                    .addComponent(cancelBtn))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashBtnActionPerformed
        bankNameLabel.setVisible(false);
        bankNameTxt.setVisible(false);
        accNoLabel.setVisible(false);
        accNoTxt.setVisible(false);
        selected_payment_type = "Cash";

    }//GEN-LAST:event_cashBtnActionPerformed

    private void bankTransferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankTransferBtnActionPerformed
        bankNameLabel.setVisible(true);
        bankNameTxt.setVisible(true);
        accNoLabel.setVisible(true);
        accNoTxt.setVisible(true);
        selected_payment_type = "Bank Transfer";
    }//GEN-LAST:event_bankTransferBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        if (amountPaidTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
        } else {
            if (selected_payment_type.equals("Cash")) {
                Cash cash = new Cash();

                cash.setPassport_no(registeredPeopleTxt.getText());
                cash.setPayment_type("Cash");

                if (DataAccess.isNumeric(amountPaidTxt.getText())) {
                    cash.setAmount_paid(Double.parseDouble(amountPaidTxt.getText()));
                    if (cash.validate_amount_paid()) {
                        cash.calc_balance();
                        if (cash.make_payment()) {
                            JOptionPane.showMessageDialog(null, "Payment Successful!");
                            nctz.register_vax_prg();
                            this.setVisible(false);
                            new LoginPage().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Payment Unsuccessful!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Funds!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Amount Paid Invalid!");
                }

            } else {
                if (bankNameTxt.getText().equals("") || accNoTxt.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
                } else {
                    BankTransfer bt = new BankTransfer();

                    bt.setPassport_no(registeredPeopleTxt.getText());
                    bt.setBankName(bankNameTxt.getText());
                    if (DataAccess.isNumeric(accNoTxt.getText())) {
                        bt.setBankAccNo(accNoTxt.getText());
                        bt.setPayment_type("Bank Transfer");

                        if (DataAccess.isNumeric(amountPaidTxt.getText())) {
                            bt.setAmount_paid(Double.parseDouble(amountPaidTxt.getText()));
                            if (bt.validate_amount_paid()) {
                                if (bt.make_payment()) {
                                    JOptionPane.showMessageDialog(null, "Payment Successful!");
                                    nctz.register_vax_prg();
                                    this.setVisible(false);
                                    new LoginPage().setVisible(true);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Payment Unsuccessful!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Incorrect Funds!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Amount Paid Invalid!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Bank Account Number!");
                    }

                }
            }
        }
    }//GEN-LAST:event_payBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Proceed with payment cancellation?\nYou will have to register again.", "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        switch (result) {
            case JOptionPane.YES_OPTION:
                this.setVisible(false);
                new RegisterPeoplePage().setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPage(new Noncitizen()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accNoLabel;
    private javax.swing.JTextField accNoTxt;
    private javax.swing.JLabel amountDueLabel;
    private javax.swing.JTextField amountDueTxt;
    private javax.swing.JLabel amountPaidLabel;
    private javax.swing.JTextField amountPaidTxt;
    private javax.swing.JLabel bankNameLabel;
    private javax.swing.JTextField bankNameTxt;
    private javax.swing.JButton bankTransferBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cashBtn;
    private javax.swing.JButton payBtn;
    private javax.swing.JLabel registeredPeopleLabel;
    private javax.swing.JTextField registeredPeopleTxt;
    private javax.swing.JLabel titleCardPaymentLabel;
    // End of variables declaration//GEN-END:variables
}
