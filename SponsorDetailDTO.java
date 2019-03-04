
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SponsorDetailDTO {

    @SerializedName("id_Auspiciadores")
    @Expose
    private Integer idAuspiciadores;
    @SerializedName("FotoAuspiciadores")
    @Expose
    private String fotoAuspiciadores;
    @SerializedName("NombreAuspiciadores")
    @Expose
    private String nombreAuspiciadores;
    @SerializedName("DescripcionAuspiciadores")
    @Expose
    private String descripcionAuspiciadores;
    @SerializedName("WebAuspiciadores")
    @Expose
    private String webAuspiciadores;

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

    public String getDescripcionAuspiciadores() {
        return descripcionAuspiciadores;
    }

    public void setDescripcionAuspiciadores(String descripcionAuspiciadores) {
        this.descripcionAuspiciadores = descripcionAuspiciadores;
    }

    public String getWebAuspiciadores() {
        return webAuspiciadores;
    }

    public void setWebAuspiciadores(String webAuspiciadores) {
        this.webAuspiciadores = webAuspiciadores;
    }

}
