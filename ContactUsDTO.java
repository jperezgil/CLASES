
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactUsDTO {

    @SerializedName("NombreContactoActividad")
    @Expose
    private String nombreContactoActividad;
    @SerializedName("CorreoContactoActividad")
    @Expose
    private String correoContactoActividad;

    public String getNombreContactoActividad() {
        return nombreContactoActividad;
    }

    public void setNombreContactoActividad(String nombreContactoActividad) {
        this.nombreContactoActividad = nombreContactoActividad;
    }

    public String getCorreoContactoActividad() {
        return correoContactoActividad;
    }

    public void setCorreoContactoActividad(String correoContactoActividad) {
        this.correoContactoActividad = correoContactoActividad;
    }

}
