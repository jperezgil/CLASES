
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurveyHeaderDTO {

    @SerializedName("NombreEncuesta")
    @Expose
    private String nombreEncuesta;
    @SerializedName("SugerenciaEncuesta")
    @Expose
    private String sugerenciaEncuesta;

    public String getNombreEncuesta() {
        return nombreEncuesta;
    }

    public void setNombreEncuesta(String nombreEncuesta) {
        this.nombreEncuesta = nombreEncuesta;
    }

    public String getSugerenciaEncuesta() {
        return sugerenciaEncuesta;
    }

    public void setSugerenciaEncuesta(String sugerenciaEncuesta) {
        this.sugerenciaEncuesta = sugerenciaEncuesta;
    }

}
