
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SurveyQuestionDTO implements Serializable {

    @SerializedName("id_PreguntaEncuesta")
    @Expose
    private Integer idPreguntaEncuesta;
    @SerializedName("GlosaPreguntaEncuesta")
    @Expose
    private String glosaPreguntaEncuesta;
    @SerializedName("CalificacionRespuestaEncuesta")
    @Expose
    private Integer calificacionRespuestaEncuesta;

    public Integer getIdPreguntaEncuesta() {
        return idPreguntaEncuesta;
    }

    public void setIdPreguntaEncuesta(Integer idPreguntaEncuesta) {
        this.idPreguntaEncuesta = idPreguntaEncuesta;
    }

    public String getGlosaPreguntaEncuesta() {
        return glosaPreguntaEncuesta;
    }

    public void setGlosaPreguntaEncuesta(String glosaPreguntaEncuesta) {
        this.glosaPreguntaEncuesta = glosaPreguntaEncuesta;
    }

    public Integer getCalificacionRespuestaEncuesta() {
        return calificacionRespuestaEncuesta;
    }

    public void setCalificacionRespuestaEncuesta(Integer calificacionRespuestaEncuesta) {
        this.calificacionRespuestaEncuesta = calificacionRespuestaEncuesta;
    }
}
