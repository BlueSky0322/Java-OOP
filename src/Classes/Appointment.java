/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.GenerateID;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import Interface.VaxDetails;

/**
 *
 * @author SAREINDRA
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
        return LocalDate.now().plusDays(FFD_AFTER).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    @Override
    public String setsdd(int vax_time_delta) {
        return LocalDate.now().plusDays(FFD_AFTER).plusWeeks(vax_time_delta).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    @Override
    public String setbdd(int booster_time_delta) {
        return LocalDate.now().plusDays(FFD_AFTER).plusWeeks(booster_time_delta).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    @Override
    public int generateID() {
        return ThreadLocalRandom.current().nextInt(100, 999 + 1);
    }

    public boolean validate_ic_passport_no(String filename, String ic_passport_no, int column) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                if (ic_passport_no.equals(ary[column])) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String validate_vax_quantity(String vax_name) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("CentreVaccineStorage.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                switch (vax_name) {
                    case "Pfizer":
                        if (Integer.parseInt(ary[1]) >= MIN_QUANTITY) {
                            return ary[0];
                        }
                        ;
                    case "Aztrazeneca":
                        if (Integer.parseInt(ary[2]) >= MIN_QUANTITY) {
                            return ary[0];
                        }
                        ;
                    case "Sinovac":
                        if (Integer.parseInt(ary[3]) >= MIN_QUANTITY) {
                            return ary[0];
                        }
                        ;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int retrieve_time_delta(String vax_name, String dose_type) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Vaccine.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                if (vax_name.equals(ary[1])) {
                    if (dose_type.equals("Second dose")) {
                        return Integer.parseInt(ary[2]);
                    } else {
                        return Integer.parseInt(ary[3]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String retrieve_centre_name(String centre_id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Centre.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                if (centre_id.equals(ary[0])) {
                    return ary[1];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String retrieve_centre_address(String centre_id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Centre.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(":");
                if (ary.length < 1) {
                    break;
                }
                if (centre_id.equals(ary[0])) {
                    return ary[2];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void register_vax_apt() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("Appointment.txt", true));
            bw.write(this.getIc_passport_no() + ":" + this.getVaccine_name() + ":" + this.getAppointment_id() + ":" + this.getCentre_name() 
                    + ":" + this.getCentre_address() + ":" + this.getFirst_dose_date() + ":" + this.getSecond_dose_date() + ":" + this.getBooster_dose_date());
            bw.write(System.getProperty("line.separator"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
