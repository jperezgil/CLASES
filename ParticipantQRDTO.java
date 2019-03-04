
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParticipantQRDTO {

    @SerializedName("NombreCompleto")
    @Expose
    private String nombreCompleto;
    @SerializedName("PuestoPersona")
    @Expose
    private String puestoPersona;
    @SerializedName("OrganizacionPersona")
    @Expose
    private String organizacionPersona;
    @SerializedName("FotoPersona")
    @Expose
    private String fotoPersona;
    @SerializedName("FechaQR")
    @Expose
    private String fechaQR;
    @SerializedName("HoraQR")
    @Expose
    private String horaQR;
    @SerializedName("CodigoQRParticipante")
    @Expose
    private String codigoQRParticipante;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPuestoPersona() {
        return puestoPersona;
    }

    public void setPuestoPersona(String puestoPersona) {
        this.puestoPersona = puestoPersona;
    }

    public String getOrganizacionPersona() {
        return organizacionPersona;
    }

    public void setOrganizacionPersona(String organizacionPersona) {
        this.organizacionPersona = organizacionPersona;
    }

    public String getFotoPersona() {
        return fotoPersona;
    }

    public void setFotoPersona(String fotoPersona) {
        this.fotoPersona = fotoPersona;
    }

    public String getFechaQR() {
        return fechaQR;
    }

    public void setFechaQR(String fechaQR) {
        this.fechaQR = fechaQR;
    }

    public String getHoraQR() {
        return horaQR;
    }

    public void setHoraQR(String horaQR) {
        this.horaQR = horaQR;
    }

    public String getCodigoQRParticipante() {
        return codigoQRParticipante;
    }

    public void setCodigoQRParticipante(String codigoQRParticipante) {
        this.codigoQRParticipante = codigoQRParticipante;
    }

}
