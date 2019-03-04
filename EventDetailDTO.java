
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class EventDetailDTO implements Serializable{

    @SerializedName("NombreEvento")
    @Expose
    private String nombreEvento;
    @SerializedName("DescripcionEvento")
    @Expose
    private String descripcionEvento;
    @SerializedName("DireccionEvento")
    @Expose
    private String direccionEvento;
    @SerializedName("PuntoGeoXEvento")
    @Expose
    private String puntoGeoXEvento;
    @SerializedName("PuntoGeoYEvento")
    @Expose
    private String puntoGeoYEvento;

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public String getDireccionEvento() {
        return direccionEvento;
    }

    public void setDireccionEvento(String direccionEvento) {
        this.direccionEvento = direccionEvento;
    }

    public String getPuntoGeoXEvento() {
        return puntoGeoXEvento;
    }

    public void setPuntoGeoXEvento(String puntoGeoXEvento) {
        this.puntoGeoXEvento = puntoGeoXEvento;
    }

    public String getPuntoGeoYEvento() {
        return puntoGeoYEvento;
    }

    public void setPuntoGeoYEvento(String puntoGeoYEvento) {
        this.puntoGeoYEvento = puntoGeoYEvento;
    }

}
