
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionsDTO {

    @SerializedName("id_PreguntaActividad")
    @Expose
    private Integer idPreguntaActividad;
    @SerializedName("GlosaPreguntaActividad")
    @Expose
    private String glosaPreguntaActividad;

    public Integer getIdPreguntaActividad() {
        return idPreguntaActividad;
    }

    public void setIdPreguntaActividad(Integer idPreguntaActividad) {
        this.idPreguntaActividad = idPreguntaActividad;
    }

    public String getGlosaPreguntaActividad() {
        return glosaPreguntaActividad;
    }

    public void setGlosaPreguntaActividad(String glosaPreguntaActividad) {
        this.glosaPreguntaActividad = glosaPreguntaActividad;
    }

}
