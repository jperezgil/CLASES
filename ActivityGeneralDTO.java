
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ActivityGeneralDTO implements Serializable {

    @SerializedName("id_Actividad")
    @Expose
    private Integer idActividad;
    @SerializedName("NombreActividad")
    @Expose
    private String nombreActividad;
    @SerializedName("subtitulo_evento")
    @Expose
    private String subtitulo_evento;
    @SerializedName("DetalleActividad")
    @Expose
    private String detalleActividad;
    @SerializedName("CabeceraFecha")
    @Expose
    private String cabeceraFecha;
    @SerializedName("DuracionActividad")
    @Expose
    private String duracionActividad;
    @SerializedName("FechaInicioActividad")
    @Expose
    private String fechaInicioActividad;
    @SerializedName("FechaFinActividad")
    @Expose
    private String fechaFinActividad;
    @SerializedName("FotoActividad")
    @Expose
    private String FotoActividad;

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDetalleActividad() {
        return detalleActividad;
    }

    public void setDetalleActividad(String detalleActividad) {
        this.detalleActividad = detalleActividad;
    }

    public String getCabeceraFecha() {
        return cabeceraFecha;
    }

    public void setCabeceraFecha(String cabeceraFecha) {
        this.cabeceraFecha = cabeceraFecha;
    }

    public String getDuracionActividad() {
        return duracionActividad;
    }

    public void setDuracionActividad(String duracionActividad) {
        this.duracionActividad = duracionActividad;
    }

    public String getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public void setFechaInicioActividad(String fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public String getFechaFinActividad() {
        return fechaFinActividad;
    }

    public void setFechaFinActividad(String fechaFinActividad) {
        this.fechaFinActividad = fechaFinActividad;
    }

    public String getFotoActividad() {
        return FotoActividad;
    }

    public void setFotoActividad(String fotoActividad) {
        FotoActividad = fotoActividad;
    }

    public String getSubtitulo_evento() {
        return subtitulo_evento;
    }

    public void setSubtitulo_evento(String subtitulo_evento) {
        this.subtitulo_evento = subtitulo_evento;
    }
}
