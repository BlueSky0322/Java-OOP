/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author SAREINDRA
 */
public class Appointment {
    
    private int appointment_id;
    private String first_dose_date;
    private String second_dose_date;
    private String centre_id;    
    private int room_num;

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getFirst_dose_date() {
        return first_dose_date;
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

    public String getCentre_id() {
        return centre_id;
    }

    public void setCentre_id(String centre_id) {
        this.centre_id = centre_id;
    }

    public int getRoom_num() {
        return room_num;
    }

    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }
    
    
}
