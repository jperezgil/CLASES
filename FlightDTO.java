
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightDTO {

    private String place;
    private String dir_corde;
    private String company;

    private String arrive_hour;
    private String return_hour;

    private String arrive_date;
    private String return_date;

    private String arrive_str;
    private String return_str;

    public FlightDTO() {
    }

    public FlightDTO(String place, String dir_corde, String company, String arrive_hour, String return_hour, String arrive_date, String return_date, String arrive_str, String return_str) {
        this.place = place;
        this.dir_corde = dir_corde;
        this.company = company;
        this.arrive_hour = arrive_hour;
        this.return_hour = return_hour;
        this.arrive_date = arrive_date;
        this.return_date = return_date;
        this.arrive_str = arrive_str;
        this.return_str = return_str;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDir_corde() {
        return dir_corde;
    }

    public void setDir_corde(String dir_corde) {
        this.dir_corde = dir_corde;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getArrive_hour() {
        return arrive_hour;
    }

    public void setArrive_hour(String arrive_hour) {
        this.arrive_hour = arrive_hour;
    }

    public String getReturn_hour() {
        return return_hour;
    }

    public void setReturn_hour(String return_hour) {
        this.return_hour = return_hour;
    }

    public String getArrive_date() {
        return arrive_date;
    }

    public void setArrive_date(String arrive_date) {
        this.arrive_date = arrive_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getArrive_str() {
        return arrive_str;
    }

    public void setArrive_str(String arrive_str) {
        this.arrive_str = arrive_str;
    }

    public String getReturn_str() {
        return return_str;
    }

    public void setReturn_str(String return_str) {
        this.return_str = return_str;
    }
}
