
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ExposerDTO implements Serializable {
    @SerializedName("id_Participante")
    @Expose
    private Integer idParticipante;
    @SerializedName("FotoPersona")
    @Expose
    private String fotoPersona;
    @SerializedName("NombreCompletoUsuario")
    @Expose
    private String nombreCompletoUsuario;
    @SerializedName("PuestoPersona")
    @Expose
    private String puestoPersona;
    @SerializedName("OrganizacionPersona")
    @Expose
    private String organizacionPersona;
    @SerializedName("AbreviaturaOrganizacionPersona")
    @Expose
    private String abreviaturaOrganizacionPersona;

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

    public String getNombreCompletoUsuario() {
        return nombreCompletoUsuario;
    }

    public void setNombreCompletoUsuario(String nombreCompletoUsuario) {
        this.nombreCompletoUsuario = nombreCompletoUsuario;
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

    public String getAbreviaturaOrganizacionPersona() {
        return abreviaturaOrganizacionPersona;
    }

    public void setAbreviaturaOrganizacionPersona(String abreviaturaOrganizacionPersona) {
        this.abreviaturaOrganizacionPersona = abreviaturaOrganizacionPersona;
    }

}
