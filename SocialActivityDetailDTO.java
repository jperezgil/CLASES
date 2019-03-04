
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SocialActivityDetailDTO {
    @SerializedName("id_Actividad")
    @Expose
    private Integer idActividad;
    @SerializedName("FotoActividad")
    @Expose
    private String fotoActividad;
    @SerializedName("NombreActividad")
    @Expose
    private String nombreActividad;
    @SerializedName("DuracionActividad")
    @Expose
    private String duracionActividad;
    @SerializedName("FechaActividad")
    @Expose
    private String fechaActividad;
    @SerializedName("DetalleActividad")
    @Expose
    private String detalleActividad;
    @SerializedName("PuntoGeoXActividad")
    @Expose
    private String puntoGeoXActividad;
    @SerializedName("PuntoGeoYActividad")
    @Expose
    private String puntoGeoYActividad;
    @SerializedName("DireccionActividad")
    @Expose
    private String direccionActividad;
    @SerializedName("MenuActividad")
    @Expose
    private String menuActividad;

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

    public String getPuntoGeoXActividad() {
        return puntoGeoXActividad;
    }

    public void setPuntoGeoXActividad(String puntoGeoXActividad) {
        this.puntoGeoXActividad = puntoGeoXActividad;
    }

    public String getPuntoGeoYActividad() {
        return puntoGeoYActividad;
    }

    public void setPuntoGeoYActividad(String puntoGeoYActividad) {
        this.puntoGeoYActividad = puntoGeoYActividad;
    }

    public String getDireccionActividad() {
        return direccionActividad;
    }

    public void setDireccionActividad(String direccionActividad) {
        this.direccionActividad = direccionActividad;
    }

    public String getMenuActividad() {
        return menuActividad;
    }

    public void setMenuActividad(String menuActividad) {
        this.menuActividad = menuActividad;
    }
}
