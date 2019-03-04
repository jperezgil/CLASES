package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GeneralInfoDTO implements Serializable {

    @SerializedName("id_PlantillaFront")
    @Expose
    private Integer idPlantillaFront;
    @SerializedName("CodeID")
    @Expose
    private String codeID;
    @SerializedName("NombrePlantillaFront")
    @Expose
    private String nombrePlantillaFront;
    @SerializedName("TipoPlantillaFront")
    @Expose
    private String tipoPlantillaFront;
    @SerializedName("id_Entorno")
    @Expose
    private Integer idEntorno;
    @SerializedName("id_PadrePlantillaFront")
    @Expose
    private Object idPadrePlantillaFront;

    public Integer getIdPlantillaFront() {
        return idPlantillaFront;
    }

    public void setIdPlantillaFront(Integer idPlantillaFront) {
        this.idPlantillaFront = idPlantillaFront;
    }

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public String getNombrePlantillaFront() {
        return nombrePlantillaFront;
    }

    public void setNombrePlantillaFront(String nombrePlantillaFront) {
        this.nombrePlantillaFront = nombrePlantillaFront;
    }

    public String getTipoPlantillaFront() {
        return tipoPlantillaFront;
    }

    public void setTipoPlantillaFront(String tipoPlantillaFront) {
        this.tipoPlantillaFront = tipoPlantillaFront;
    }

    public Integer getIdEntorno() {
        return idEntorno;
    }

    public void setIdEntorno(Integer idEntorno) {
        this.idEntorno = idEntorno;
    }

    public Object getIdPadrePlantillaFront() {
        return idPadrePlantillaFront;
    }

    public void setIdPadrePlantillaFront(Object idPadrePlantillaFront) {
        this.idPadrePlantillaFront = idPadrePlantillaFront;
    }

}