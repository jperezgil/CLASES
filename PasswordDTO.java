
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PasswordDTO {

    @SerializedName("correoParticipante")
    @Expose
    private String correoParticipante;

    public String getCorreoParticipante() {
        return correoParticipante;
    }

    public void setCorreoParticipante(String correoParticipante) {
        this.correoParticipante = correoParticipante;
    }

}
