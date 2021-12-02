/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Appointment;
import Classes.Centre;
import Classes.DataAccess;
import Enum.VaxStatus;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Ng, Sareindra
 */
public class PersonnelViewVaxApt extends javax.swing.JFrame {

    /**
     * Creates new form RegisterVaxApt
     */
    private String user_type = "";
    private ArrayList<String[]> arrayList;
    private ListIterator<String[]> listIterator;
    int size;

    public PersonnelViewVaxApt(String user_type) {
        initComponents();
        
        this.user_type = user_type;
        if(this.user_type.equals("Healthcare Personnel")){
            cancelAptBtn.setEnabled(false);
        }
        
        icPassportNoTxt.setEditable(false);
        centreAddressTxt.setEditable(false);
        arrayList = DataAccess.get_data("Appointment.txt");
        size = 0;
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
        icPassportNoTxt = new javax.swing.JTextField();
        aptIDTxt = new javax.swing.JTextField();
        fddTxt = new javax.swing.JTextField();
        sddTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        backToMenuBtn = new javax.swing.JButton();
        centreAddressLabel = new javax.swing.JLabel();
        centreAddressTxt = new javax.swing.JTextField();
        titleCardLabel2 = new javax.swing.JLabel();
        cancelAptBtn = new javax.swing.JButton();
        vaxStatusLabel = new javax.swing.JLabel();
        modifyAptBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        previousBtn = new javax.swing.JButton();
        firstBtn = new javax.swing.JButton();
        vaxNameComboBox = new javax.swing.JComboBox<>();
        vaxStatusComboBox = new javax.swing.JComboBox<>();
        centreNameComboBox = new javax.swing.JComboBox<>();
        titleCardLabel = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleCard.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titleCard.setText("VIEW ALL VACCINATION APPOINTMENTS");

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
        titleCardLabel2.setText("Vaccination Appointment");

        cancelAptBtn.setText("Cancel Appointment");
        cancelAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAptBtnActionPerformed(evt);
            }
        });

        vaxStatusLabel.setText("Vaccination Status:");

        modifyAptBtn.setText("Modify Appointment");
        modifyAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyAptBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        lastBtn.setText("Last");
        lastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnActionPerformed(evt);
            }
        });

        previousBtn.setText("Previous");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });

        firstBtn.setText("First");
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });

        vaxNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "Aztrazeneca", "Sinovac" }));
        vaxNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaxNameComboBoxActionPerformed(evt);
            }
        });

        vaxStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT_VACCINATED", "FIRST_DOSE_COMPLETE", "SECOND_DOSE_COMPLETE", "BOOSTER_DOSE_COMPLETE" }));
        vaxStatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaxStatusComboBoxActionPerformed(evt);
            }
        });

        centreNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tun Razak Medical Centre", "Hussein Onn Medical Centre", "Abdul Rahman Medical Centre" }));
        centreNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centreNameComboBoxActionPerformed(evt);
            }
        });

        titleCardLabel.setText("Enter IC/ Passport No.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(titleCardLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vaccineNameLabel)
                                .addComponent(centreNameLabel)
                                .addComponent(aptIDLabel)
                                .addComponent(icPassportNoLabel))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aptIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vaxNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(centreNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(112, 112, 112)
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
                                .addComponent(vaxStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleCard)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(previousBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cancelAptBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modifyAptBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backToMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleCardLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleCardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(titleCardLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icPassportNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icPassportNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aptIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aptIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineNameLabel)
                    .addComponent(vaxNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreNameLabel)
                    .addComponent(centreNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaxStatusLabel)
                    .addComponent(vaxStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelAptBtn)
                            .addComponent(firstBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifyAptBtn)
                            .addComponent(previousBtn)
                            .addComponent(nextBtn)))
                    .addComponent(lastBtn))
                .addGap(18, 18, 18)
                .addComponent(backToMenuBtn)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        this.setVisible(false);
        new PersonnelMenu(this.user_type).setVisible(true);
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String id = searchTxt.getText();
        String[] ary = DataAccess.get_data_by_var("Appointment.txt", id, 9, 0);

        if (!searchTxt.getText().equals("")) {
            if (ary[0] == null) {
                JOptionPane.showMessageDialog(null, "Record not found.");
                searchTxt.setText("");
            } else {
                icPassportNoTxt.setText(ary[0]);
                vaxNameComboBox.setSelectedItem(ary[1]);
                aptIDTxt.setText(ary[2]);
                centreNameComboBox.setSelectedItem(ary[3]);
                centreAddressTxt.setText(ary[4]);
                fddTxt.setText(ary[5]);
                sddTxt.setText(ary[6]);
                bddTxt.setText(ary[7]);
                vaxStatusComboBox.setSelectedItem(ary[8]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Some fields are empty");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cancelAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAptBtnActionPerformed
        Appointment apt = new Appointment();
        listIterator = apt.modify_apt_details(icPassportNoTxt.getText(), "remove").listIterator();
        clearFields();
        JOptionPane.showMessageDialog(null, "Appointment cancelled.");
    }//GEN-LAST:event_cancelAptBtnActionPerformed

    private void modifyAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyAptBtnActionPerformed
        if (icPassportNoTxt.getText().equals("") || aptIDTxt.getText().equals("")
                || fddTxt.getText().equals("") || sddTxt.getText().equals("") || bddTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are Empty!");
        } else {
            if (DataAccess.isNumeric(aptIDTxt.getText())) {
                String search = searchTxt.getText();

                Appointment apt = new Appointment();
                Centre ctr = new Centre();

                apt.setIc_passport_no(icPassportNoTxt.getText());
                apt.setVaccine_name(vaxNameComboBox.getSelectedItem().toString());
                apt.setAppointment_id(Integer.parseInt(aptIDTxt.getText()));
                apt.setFirst_dose_date(fddTxt.getText());
                apt.setSecond_dose_date(sddTxt.getText());
                apt.setBooster_dose_date(bddTxt.getText());

                if (centreNameComboBox.getSelectedItem().equals("Tun Razak Medical Centre")) {
                    assign_centre_id(apt, ctr, "1");
                } else if (centreNameComboBox.getSelectedItem().equals("Hussein Onn Medical Centre")) {
                    assign_centre_id(apt, ctr, "2");
                } else if (centreNameComboBox.getSelectedItem().equals("Abdul Rahman Medical Centre")) {
                    assign_centre_id(apt, ctr, "3");
                }

                if (vaxStatusComboBox.getSelectedItem().equals("NOT_VACCINATED")) {
                    apt.setVax_status(VaxStatus.NOT_VACCINATED.name());
                } else if (vaxStatusComboBox.getSelectedItem().equals("FIRST_DOSE_COMPLETE")) {
                    apt.setVax_status(VaxStatus.FIRST_DOSE_COMPLETE.name());
                } else if (vaxStatusComboBox.getSelectedItem().equals("SECOND_DOSE_COMPLETE")) {
                    apt.setVax_status(VaxStatus.SECOND_DOSE_COMPLETE.name());
                } else if (vaxStatusComboBox.getSelectedItem().equals("BOOSTER_DOSE_COMPLETE")) {
                    apt.setVax_status(VaxStatus.BOOSTER_DOSE_COMPLETE.name());
                }
                apt.modify_apt_details(search, "modify");
                JOptionPane.showMessageDialog(null, "Appointment updated.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Appointment ID!");
            }
        }
    }//GEN-LAST:event_modifyAptBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        if (icPassportNoTxt.getText().equals("") || aptIDTxt.getText().equals("")
                || fddTxt.getText().equals("") || sddTxt.getText().equals("") || bddTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are Empty!");
        } else {
            if (listIterator.hasNext()) {
                String[] ary = listIterator.next();
                icPassportNoTxt.setText(ary[0]);
                vaxNameComboBox.setSelectedItem(ary[1]);
                aptIDTxt.setText(ary[2]);
                centreNameComboBox.setSelectedItem(ary[3]);
                centreAddressTxt.setText(ary[4]);
                fddTxt.setText(ary[5]);
                sddTxt.setText(ary[6]);
                bddTxt.setText(ary[7]);
                vaxStatusComboBox.setSelectedItem(ary[8]);
            } else {
                JOptionPane.showMessageDialog(null, "You reached the end of the records.");
            }
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        size = arrayList.size();
        listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            String[] ary = listIterator.previous();
            icPassportNoTxt.setText(ary[0]);
            vaxNameComboBox.setSelectedItem(ary[1]);
            aptIDTxt.setText(ary[2]);
            centreNameComboBox.setSelectedItem(ary[3]);
            centreAddressTxt.setText(ary[4]);
            fddTxt.setText(ary[5]);
            sddTxt.setText(ary[6]);
            bddTxt.setText(ary[7]);
            vaxStatusComboBox.setSelectedItem(ary[8]);
        } else {
            JOptionPane.showMessageDialog(null, "You reached the start of the records.");
        }
    }//GEN-LAST:event_lastBtnActionPerformed

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        if (icPassportNoTxt.getText().equals("") || aptIDTxt.getText().equals("")
                || fddTxt.getText().equals("") || sddTxt.getText().equals("") || bddTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are Empty!");
        } else {
            if (listIterator.hasPrevious()) {
                String[] ary = listIterator.previous();
                icPassportNoTxt.setText(ary[0]);
                vaxNameComboBox.setSelectedItem(ary[1]);
                aptIDTxt.setText(ary[2]);
                centreNameComboBox.setSelectedItem(ary[3]);
                centreAddressTxt.setText(ary[4]);
                fddTxt.setText(ary[5]);
                sddTxt.setText(ary[6]);
                bddTxt.setText(ary[7]);
                vaxStatusComboBox.setSelectedItem(ary[8]);
            } else {
                JOptionPane.showMessageDialog(null, "You reached the start of the records.");
            }
        }
    }//GEN-LAST:event_previousBtnActionPerformed

    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        size = arrayList.size();
        listIterator = arrayList.listIterator();
        String[] ary = listIterator.next();
        icPassportNoTxt.setText(ary[0]);
        vaxNameComboBox.setSelectedItem(ary[1]);
        aptIDTxt.setText(ary[2]);
        centreNameComboBox.setSelectedItem(ary[3]);
        centreAddressTxt.setText(ary[4]);
        fddTxt.setText(ary[5]);
        sddTxt.setText(ary[6]);
        bddTxt.setText(ary[7]);
        vaxStatusComboBox.setSelectedItem(ary[8]);
    }//GEN-LAST:event_firstBtnActionPerformed

    private void vaxNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaxNameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaxNameComboBoxActionPerformed

    private void vaxStatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaxStatusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaxStatusComboBoxActionPerformed

    private void centreNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centreNameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centreNameComboBoxActionPerformed

    void clearFields() {
        icPassportNoTxt.setText("");
        vaxNameComboBox.setSelectedIndex(0);
        aptIDTxt.setText("");
        centreNameComboBox.setSelectedIndex(0);
        centreAddressTxt.setText("");
        fddTxt.setText("");
        sddTxt.setText("");
        bddTxt.setText("");
        vaxStatusComboBox.setSelectedIndex(0);
    }

    void assign_centre_id(Appointment apt, Centre ctr, String id) {
        ctr.setCentre_id(id);
        apt.setCentre_name(apt.retrieve_centre_details(ctr.getCentre_id(), 1));
        apt.setCentre_address(apt.retrieve_centre_details(ctr.getCentre_id(), 2));
        centreAddressTxt.setText(apt.retrieve_centre_details(ctr.getCentre_id(), 2));
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
            java.util.logging.Logger.getLogger(PersonnelViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelViewVaxApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelViewVaxApt("").setVisible(true);
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
    private javax.swing.JComboBox<String> centreNameComboBox;
    private javax.swing.JLabel centreNameLabel;
    private javax.swing.JLabel fddLabel;
    private javax.swing.JTextField fddTxt;
    private javax.swing.JButton firstBtn;
    private javax.swing.JLabel icPassportNoLabel;
    private javax.swing.JTextField icPassportNoTxt;
    private javax.swing.JButton lastBtn;
    private javax.swing.JButton modifyAptBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn;
    private javax.swing.JLabel sddLabel;
    private javax.swing.JTextField sddTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel titleCard;
    private javax.swing.JLabel titleCardLabel;
    private javax.swing.JLabel titleCardLabel2;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JComboBox<String> vaxNameComboBox;
    private javax.swing.JComboBox<String> vaxStatusComboBox;
    private javax.swing.JLabel vaxStatusLabel;
    // End of variables declaration//GEN-END:variables
}
