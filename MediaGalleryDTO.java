
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class MediaGalleryDTO implements Serializable {


    @SerializedName("id_ImagenEvento")
    @Expose
    private Integer idImagenEvento;
    @SerializedName("NombreImagenEvento")
    @Expose
    private String nombreImagenEvento;
    @SerializedName("DescripcionImagenEvento")
    @Expose
    private String descripcionImagenEvento;
    @SerializedName("LinkVideoImagenEvento")
    @Expose
    private String linkVideoImagenEvento;
    @SerializedName("FotoImagenEvento")
    @Expose
    private String fotoImagenEvento;
    @SerializedName("FechaImagenEvento")
    @Expose
    private String fechaImagenEvento;

    public Integer getIdImagenEvento() {
        return idImagenEvento;
    }

    public void setIdImagenEvento(Integer idImagenEvento) {
        this.idImagenEvento = idImagenEvento;
    }

    public String getNombreImagenEvento() {
        return nombreImagenEvento;
    }

    public void setNombreImagenEvento(String nombreImagenEvento) {
        this.nombreImagenEvento = nombreImagenEvento;
    }

    public String getDescripcionImagenEvento() {
        return descripcionImagenEvento;
    }

    public void setDescripcionImagenEvento(String descripcionImagenEvento) {
        this.descripcionImagenEvento = descripcionImagenEvento;
    }

    public String getLinkVideoImagenEvento() {
        return linkVideoImagenEvento;
    }

    public void setLinkVideoImagenEvento(String linkVideoImagenEvento) {
        this.linkVideoImagenEvento = linkVideoImagenEvento;
    }

    public String getFotoImagenEvento() {
        return fotoImagenEvento;
    }

    public void setFotoImagenEvento(String fotoImagenEvento) {
        this.fotoImagenEvento = fotoImagenEvento;
    }

    public String getFechaImagenEvento() {
        return fechaImagenEvento;
    }

    public void setFechaImagenEvento(String fechaImagenEvento) {
        this.fechaImagenEvento = fechaImagenEvento;
    }

}
