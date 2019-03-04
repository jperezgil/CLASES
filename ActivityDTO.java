
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActivityDTO {

    @SerializedName("id_Actividad")
    @Expose
    private Integer idActividad;
    @SerializedName("NombreActividad")
    @Expose
    private String nombreActividad;
    @SerializedName("DetalleActividad")
    @Expose
    private String detalleActividad;
    @SerializedName("CabeceraFecha")
    @Expose
    private String cabeceraFecha;
    @SerializedName("DuracionActividad")
    @Expose
    private String duracionActividad;

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

}
