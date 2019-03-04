
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ActivityGeneralDetailDTO implements Serializable {


    @SerializedName("id_Actividad")
    @Expose
    private Integer idActividad;
    @SerializedName("FotoActividad")
    @Expose
    private String fotoActividad;
    @SerializedName("NombreActividad")
    @Expose
    private String nombreActividad;
    @SerializedName("subtitulo_evento")
    @Expose
    private String subtitulo_evento;
    @SerializedName("DuracionActividad")
    @Expose
    private String duracionActividad;
    @SerializedName("FechaActividad")
    @Expose
    private String fechaActividad;
    @SerializedName("DetalleActividad")
    @Expose
    private String detalleActividad;
    @SerializedName("CroquisActividad")
    @Expose
    private String croquisActividad;
    @SerializedName("btnEnabledPregunta")
    @Expose
    private Boolean btnEnabledPregunta;

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getFotoActividad() {
        return fotoActividad;
    }

    public void setFotoActividad(String fotoActividad) {
        this.fotoActividad = fotoActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDuracionActividad() {
        return duracionActividad;
    }

    public void setDuracionActividad(String duracionActividad) {
        this.duracionActividad = duracionActividad;
    }

    public String getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(String fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getDetalleActividad() {
        return detalleActividad;
    }

    public void setDetalleActividad(String detalleActividad) {
        this.detalleActividad = detalleActividad;
    }

    public String getCroquisActividad() {
        return croquisActividad;
    }

    public void setCroquisActividad(String croquisActividad) {
        this.croquisActividad = croquisActividad;
    }

    public Boolean getBtnEnabledPregunta() {
        return btnEnabledPregunta;
    }

    public void setBtnEnabledPregunta(Boolean btnEnabledPregunta) {
        this.btnEnabledPregunta = btnEnabledPregunta;
    }

    public String getSubtitulo_evento() {
        return subtitulo_evento;
    }

    public void setSubtitulo_evento(String subtitulo_evento) {
        this.subtitulo_evento = subtitulo_evento;
    }
}
