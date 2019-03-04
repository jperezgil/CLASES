
package pe.gob.bcrp.www.entity;

import android.graphics.Bitmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventDTO implements Serializable {

    @SerializedName("id_Evento")
    @Expose
    private Integer idEvento;
    @SerializedName("id_Participante")
    @Expose
    private Integer idParticipante;
    @SerializedName("NombreEvento")
    @Expose
    private String nombreEvento;
    @SerializedName("LugarEvento")
    @Expose
    private String lugarEvento;
    @SerializedName("UbigeoEvento")
    @Expose
    private String ubigeoEvento;
    @SerializedName("FechaInicioEvento")
    @Expose
    private String fechaInicioEvento;
    @SerializedName("FechaFinEvento")
    @Expose
    private String fechaFinEvento;
    @SerializedName("FotoEvento")
    @Expose
    private String fotoEvento;
    @SerializedName("estado_img_evento")
    @Expose
    private boolean estado_img_evento;

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Integer getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Integer idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String getUbigeoEvento() {
        return ubigeoEvento;
    }

    public void setUbigeoEvento(String ubigeoEvento) {
        this.ubigeoEvento = ubigeoEvento;
    }

    public String getFechaInicioEvento() {
        return fechaInicioEvento;
    }

    public void setFechaInicioEvento(String fechaInicioEvento) {
        this.fechaInicioEvento = fechaInicioEvento;
    }

    public String getFechaFinEvento() {
        return fechaFinEvento;
    }

    public void setFechaFinEvento(String fechaFinEvento) {
        this.fechaFinEvento = fechaFinEvento;
    }

    public String getFotoEvento() {
        return fotoEvento;
    }

    public void setFotoEvento(String fotoEvento) {
        this.fotoEvento = fotoEvento;
    }

    public boolean isEstado_img_evento() {
        return estado_img_evento;
    }

    public void setEstado_img_evento(boolean estado_img_evento) {
        this.estado_img_evento = estado_img_evento;
    }
}


