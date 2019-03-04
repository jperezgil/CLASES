
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SponsorDTO implements Serializable{

    @SerializedName("id_Auspiciadores")
    @Expose
    private Integer idAuspiciadores;
    @SerializedName("FotoAuspiciadores")
    @Expose
    private String fotoAuspiciadores;
    @SerializedName("NombreAuspiciadores")
    @Expose
    private String nombreAuspiciadores;

    public Integer getIdAuspiciadores() {
        return idAuspiciadores;
    }

    public void setIdAuspiciadores(Integer idAuspiciadores) {
        this.idAuspiciadores = idAuspiciadores;
    }

    public String getFotoAuspiciadores() {
        return fotoAuspiciadores;
    }

    public void setFotoAuspiciadores(String fotoAuspiciadores) {
        this.fotoAuspiciadores = fotoAuspiciadores;
    }

    public String getNombreAuspiciadores() {
        return nombreAuspiciadores;
    }

    public void setNombreAuspiciadores(String nombreAuspiciadores) {
        this.nombreAuspiciadores = nombreAuspiciadores;
    }

}
