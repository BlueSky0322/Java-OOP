/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.GenerateID;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import Interface.VaxDetails;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sareindra
 */
public class Appointment implements VaxDetails, GenerateID {

    private String ic_passport_no;
    private int appointment_id;
    private String centre_name;
    private String centre_address;
    private String vaccine_name;
    private String first_dose_date;
    private String second_dose_date;
    private String booster_dose_date;
    private String vax_status;

    public String getVax_status() {
        return vax_status;
    }

    public void setVax_status(String vax_status) {
        this.vax_status = vax_status;
    }

    public String getCentre_address() {
        return centre_address;
    }

    public void setCentre_address(String centre_address) {
        this.centre_address = centre_address;
    }

    public String getIc_passport_no() {
        return ic_passport_no;
    }

    public void setIc_passport_no(String ic_passport_no) {
        this.ic_passport_no = ic_passport_no;
    }

    public String getVaccine_name() {
        return vaccine_name;
    }

    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }

    public String getBooster_dose_date() {
        return booster_dose_date;
    }

    public void setBooster_dose_date(String booster_dose_date) {
        this.booster_dose_date = booster_dose_date;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getFirst_dose_date() {
        return this.first_dose_date;
    }

    public void setFirst_dose_date(String first_dose_date) {
        this.first_dose_date = first_dose_date;
    }

    public String getSecond_dose_date() {
        return second_dose_date;
    }

    public void setSecond_dose_date(String second_dose_date) {
        this.second_dose_date = second_dose_date;
    }

    public String getCentre_name() {
        return centre_name;
    }

    public void setCentre_name(String centre_name) {
        this.centre_name = centre_name;
    }

    @Override
    public String setfdd() {
        return LocalDate.now().plusDays(SET_FFD_AFTER).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    @Override
    public String setsdd(int vax_time_delta) {
        return LocalDate.now().plusDays(SET_FFD_AFTER).plusWeeks(vax_time_delta).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    @Override
    public String setbdd(int booster_time_delta) {
        return LocalDate.now().plusDays(SET_FFD_AFTER).plusWeeks(booster_time_delta).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    @Override
    public int generateID() {
        return ThreadLocalRandom.current().nextInt(100, 999 + 1);
    }

    public boolean validate_ic_passport_no(String filename, String ic_passport_no, int column) {
        ArrayList<String[]> arrayList = DataAccess.get_data(filename);
        for (String[] element : arrayList) {
            if (ic_passport_no.equals(element[column])) {
                return true;
            }
        }
        return false;
    }

    public String get_sufficient_vac_centre_id(int column, ArrayList<String[]> arrayList) {
        if (Integer.parseInt(arrayList.get(0)[column]) >= MIN_QUANTITY) {
            return arrayList.get(0)[0];
        } else if (Integer.parseInt(arrayList.get(1)[column]) >= MIN_QUANTITY) {
            return arrayList.get(1)[0];
        } else if (Integer.parseInt(arrayList.get(2)[column]) >= MIN_QUANTITY) {
            return arrayList.get(2)[0];
        }
        return "Vaccine not available!";
    }

    public String validate_vax_quantity(String vax_name) {
        ArrayList<String[]> arrayList = DataAccess.get_data("VaccineStorageCentre.txt");
        String centre_id = "";
        switch (vax_name) {
            case "Pfizer":
                centre_id = get_sufficient_vac_centre_id(1, arrayList);
                break;
            case "Aztrazeneca":
                centre_id = get_sufficient_vac_centre_id(2, arrayList);
                break;
            case "Sinovac":
                centre_id = get_sufficient_vac_centre_id(3, arrayList);
                break;
        }
        return centre_id;
    }

    public int retrieve_time_delta(String vax_name, String dose_type) {
        ArrayList<String[]> arrayList = DataAccess.get_data("Vaccine.txt");
        for (String[] element : arrayList) {
            if (vax_name.equals(element[1])) {
                if (dose_type.equals("Second dose")) {
                    return Integer.parseInt(element[2]);
                } else {
                    return Integer.parseInt(element[3]);
                }
            }
        }
        return 0;
    }

    public String retrieve_centre_details(String centre_id, int column) {
        ArrayList<String[]> arrayList = DataAccess.get_data("Centre.txt");
        for (String[] element : arrayList) {
            if (centre_id.equals(element[0])) {
                return element[column];
            }
        }
        return null;
    }

    public void register_vax_apt() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Appointment.txt", true));
            bw.write(this.getIc_passport_no() + ":" + this.getVaccine_name() + ":" + this.getAppointment_id() + ":" + this.getCentre_name() + ":"
                    + this.getCentre_address() + ":" + this.getFirst_dose_date() + ":" + this.getSecond_dose_date() + ":" + this.getBooster_dose_date() + ":"
                    + this.getVax_status());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> modify_apt_details(String search, String mode) {
        ArrayList<String[]> arrayList = DataAccess.get_data("Appointment.txt");

        if (mode.equals("modify")) {
            for (String[] element : arrayList) {
                if (search.equals(element[0])) {
                    element[0] = this.ic_passport_no;
                    element[1] = this.vaccine_name;
                    element[2] = Integer.toString(this.appointment_id);
                    element[3] = this.centre_name;
                    element[4] = this.centre_address;
                    element[5] = this.first_dose_date;
                    element[6] = this.second_dose_date;
                    element[7] = this.booster_dose_date;
                    element[8] = this.vax_status;
                }
            }
        } else {
            for (Iterator<String[]> iterator = arrayList.iterator(); iterator.hasNext();) {
                String[] value = iterator.next();
                if (search.equals(value[0])) {
                    iterator.remove();
                    arrayList.remove(value);
                }
            }
        }

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Appointment.txt"));
            try (PrintWriter pw = new PrintWriter(bw)) {
                for (String[] element : arrayList) {
                    pw.println(element[0] + ":" + element[1] + ":" + element[2] + ":" + element[3] + ":"
                            + element[4] + ":" + element[5] + ":" + element[6] + ":"
                            + element[7] + ":" + element[8]);
                }
                pw.flush();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
