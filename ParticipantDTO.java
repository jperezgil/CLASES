
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ParticipantDTO implements Serializable {


    @SerializedName("id_Participante")
    @Expose
    private Integer idParticipante;
    @SerializedName("NombreCompleto")
    @Expose
    private String nombreCompleto;
    @SerializedName("OrganizacionPersona")
    @Expose
    private String organizacionPersona;
    @SerializedName("AbreviaturaOrganizacionPersona")
    @Expose
    private String abreviaturaOrganizacionPersona;
    @SerializedName("PuestoPersona")
    @Expose
    private String puestoPersona;
    @SerializedName("CorreoPersona")
    @Expose
    private String correoPersona;
    @SerializedName("FotoPersona")
    @Expose
    private String fotoPersona;

    public Integer getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Integer idParticipante) {
        this.idParticipante = idParticipante;
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

    public String getAbreviaturaOrganizacionPersona() {
        return abreviaturaOrganizacionPersona;
    }

    public void setAbreviaturaOrganizacionPersona(String abreviaturaOrganizacionPersona) {
        this.abreviaturaOrganizacionPersona = abreviaturaOrganizacionPersona;
    }

    public String getPuestoPersona() {
        return puestoPersona;
    }

    public void setPuestoPersona(String puestoPersona) {
        this.puestoPersona = puestoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getFotoPersona() {
        return fotoPersona;
    }

    public void setFotoPersona(String fotoPersona) {
        this.fotoPersona = fotoPersona;
    }
}
