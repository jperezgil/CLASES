
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationDTO {

    @SerializedName("id_Notificaciones")
    @Expose
    private Integer idNotificaciones;
    @SerializedName("NombreEvento")
    @Expose
    private String nombreEvento;
    @SerializedName("AsuntoNotificaciones")
    @Expose
    private String asuntoNotificaciones;
    @SerializedName("ContenidoNotificaciones")
    @Expose
    private String contenidoNotificaciones;
    @SerializedName("FechaEnvioNotificaciones")
    @Expose
    private String fechaEnvioNotificaciones;
    @SerializedName("TipoOrigenNotificaciones")
    @Expose
    private Integer tipoOrigenNotificaciones;

    public Integer getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(Integer idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getAsuntoNotificaciones() {
        return asuntoNotificaciones;
    }

    public void setAsuntoNotificaciones(String asuntoNotificaciones) {
        this.asuntoNotificaciones = asuntoNotificaciones;
    }

    public String getContenidoNotificaciones() {
        return contenidoNotificaciones;
    }

    public void setContenidoNotificaciones(String contenidoNotificaciones) {
        this.contenidoNotificaciones = contenidoNotificaciones;
    }

    public String getFechaEnvioNotificaciones() {
        return fechaEnvioNotificaciones;
    }

    public void setFechaEnvioNotificaciones(String fechaEnvioNotificaciones) {
        this.fechaEnvioNotificaciones = fechaEnvioNotificaciones;
    }

    public Integer getTipoOrigenNotificaciones() {
        return tipoOrigenNotificaciones;
    }

    public void setTipoOrigenNotificaciones(Integer tipoOrigenNotificaciones) {
        this.tipoOrigenNotificaciones = tipoOrigenNotificaciones;
    }

}
