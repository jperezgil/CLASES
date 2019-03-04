
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ParticipantDetailDTO implements Serializable {

@SerializedName("NombreCompleto")
@Expose
private String nombreCompleto;
    @SerializedName("PuestoPersona")
    @Expose
    private String puestoPersona;
    @SerializedName("OrganizacionPersona")
    @Expose
    private String organizacionPersona;
    @SerializedName("AbreviaturaOrganizacionPersona")
    @Expose
    private String abreviaturaOrganizacionPersona;
    @SerializedName("BiografiaDatosAnexo")
    @Expose
    private String biografiaDatosAnexo;
    @SerializedName("CorreoPersona")
    @Expose
    private String correoPersona;
    @SerializedName("id_RolParticipante")
    @Expose
    private Integer idRolParticipante;

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

    public String getAbreviaturaOrganizacionPersona() {
        return abreviaturaOrganizacionPersona;
    }

    public void setAbreviaturaOrganizacionPersona(String abreviaturaOrganizacionPersona) {
        this.abreviaturaOrganizacionPersona = abreviaturaOrganizacionPersona;
    }

    public String getBiografiaDatosAnexo() {
        return biografiaDatosAnexo;
    }

    public void setBiografiaDatosAnexo(String biografiaDatosAnexo) {
        this.biografiaDatosAnexo = biografiaDatosAnexo;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public Integer getIdRolParticipante() {
        return idRolParticipante;
    }

    public void setIdRolParticipante(Integer idRolParticipante) {
        this.idRolParticipante = idRolParticipante;
    }
}
