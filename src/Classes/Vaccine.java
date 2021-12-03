/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Sareindra
 */
public class Vaccine {
    private String vax_code;
    private String vax_name;
    private String vax_time_delta;
    private String booster_time_delta;

    public String getVax_code() {
        return vax_code;
    }

    public void setVax_code(String vax_code) {
        this.vax_code = vax_code;
    }

    public String getVax_name() {
        return vax_name;
    }

    public void setVax_name(String vax_name) {
        this.vax_name = vax_name;
    }

    public String getVax_time_delta() {
        return vax_time_delta;
    }

    public void setVax_time_delta(String vax_time_delta) {
        this.vax_time_delta = vax_time_delta;
    }

    public String getBooster_time_delta() {
        return booster_time_delta;
    }

    public void setBooster_time_delta(String booster_time_delta) {
        this.booster_time_delta = booster_time_delta;
    }
}
