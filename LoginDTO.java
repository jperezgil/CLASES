package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginDTO {

    @SerializedName("id_Usuario")
    @Expose
    private Integer idUsuario;
    @SerializedName("id_RolParticipante")
    @Expose
    private Integer idRolParticipante;
    @SerializedName("EstadoLogin")
    @Expose
    private Boolean estadoLogin;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRolParticipante() {
        return idRolParticipante;
    }

    public void setIdRolParticipante(Integer idRolParticipante) {
        this.idRolParticipante = idRolParticipante;
    }

    public Boolean getEstadoLogin() {
        return estadoLogin;
    }

    public void setEstadoLogin(Boolean estadoLogin) {
        this.estadoLogin = estadoLogin;
    }
}
