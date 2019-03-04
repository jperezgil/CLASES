
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileDTO {

    @SerializedName("id_Participante")
    @Expose
    private Integer idParticipante;
    @SerializedName("FotoPersona")
    @Expose
    private String fotoPersona;
    @SerializedName("NombreCompleto")
    @Expose
    private String nombreCompleto;
    @SerializedName("OrganizacionPersona")
    @Expose
    private String organizacionPersona;
    @SerializedName("PuestoPersona")
    @Expose
    private String puestoPersona;
    @SerializedName("PaisPersona")
    @Expose
    private String paisPersona;
    @SerializedName("AerolineaVuelo")
    @Expose
    private String aerolineaVuelo;
    @SerializedName("CodigoVuelo")
    @Expose
    private String codigoVuelo;
    @SerializedName("FechaLLegadaVuelo")
    @Expose
    private String fechaLLegadaVuelo;
    @SerializedName("FechaSalidaVuelo")
    @Expose
    private String fechaSalidaVuelo;
    @SerializedName("HoraLLegadaVuelo")
    @Expose
    private String horaLLegadaVuelo;
    @SerializedName("HoraSalidaVuelo")
    @Expose
    private String horaSalidaVuelo;
    @SerializedName("NombreHotel")
    @Expose
    private String nombreHotel;
    @SerializedName("DireccionHotel")
    @Expose
    private String direccionHotel;
    @SerializedName("FechaEntradaHotel")
    @Expose
    private String fechaEntradaHotel;
    @SerializedName("FechaSalidaHotel")
    @Expose
    private String fechaSalidaHotel;
    @SerializedName("HoraEntradaHotel")
    @Expose
    private String horaEntradaHotel;
    @SerializedName("HoraSalidaHotel")
    @Expose
    private String horaSalidaHotel;

    public Integer getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Integer idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getFotoPersona() {
        return fotoPersona;
    }

    public void setFotoPersona(String fotoPersona) {
        this.fotoPersona = fotoPersona;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getOrganizacionPersona() {
        return organizacionPersona;
    }

    public void setOrganizacionPersona(String organizacionPersona) {
        this.organizacionPersona = organizacionPersona;
    }

    public String getPuestoPersona() {
        return puestoPersona;
    }

    public void setPuestoPersona(String puestoPersona) {
        this.puestoPersona = puestoPersona;
    }

    public String getPaisPersona() {
        return paisPersona;
    }

    public void setPaisPersona(String paisPersona) {
        this.paisPersona = paisPersona;
    }

    public String getAerolineaVuelo() {
        return aerolineaVuelo;
    }

    public void setAerolineaVuelo(String aerolineaVuelo) {
        this.aerolineaVuelo = aerolineaVuelo;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getFechaLLegadaVuelo() {
        return fechaLLegadaVuelo;
    }

    public void setFechaLLegadaVuelo(String fechaLLegadaVuelo) {
        this.fechaLLegadaVuelo = fechaLLegadaVuelo;
    }

    public String getFechaSalidaVuelo() {
        return fechaSalidaVuelo;
    }

    public void setFechaSalidaVuelo(String fechaSalidaVuelo) {
        this.fechaSalidaVuelo = fechaSalidaVuelo;
    }

    public String getHoraLLegadaVuelo() {
        return horaLLegadaVuelo;
    }

    public void setHoraLLegadaVuelo(String horaLLegadaVuelo) {
        this.horaLLegadaVuelo = horaLLegadaVuelo;
    }

    public String getHoraSalidaVuelo() {
        return horaSalidaVuelo;
    }

    public void setHoraSalidaVuelo(String horaSalidaVuelo) {
        this.horaSalidaVuelo = horaSalidaVuelo;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getFechaEntradaHotel() {
        return fechaEntradaHotel;
    }

    public void setFechaEntradaHotel(String fechaEntradaHotel) {
        this.fechaEntradaHotel = fechaEntradaHotel;
    }

    public String getFechaSalidaHotel() {
        return fechaSalidaHotel;
    }

    public void setFechaSalidaHotel(String fechaSalidaHotel) {
        this.fechaSalidaHotel = fechaSalidaHotel;
    }

    public String getHoraEntradaHotel() {
        return horaEntradaHotel;
    }

    public void setHoraEntradaHotel(String horaEntradaHotel) {
        this.horaEntradaHotel = horaEntradaHotel;
    }

    public String getHoraSalidaHotel() {
        return horaSalidaHotel;
    }

    public void setHoraSalidaHotel(String horaSalidaHotel) {
        this.horaSalidaHotel = horaSalidaHotel;
    }

}
