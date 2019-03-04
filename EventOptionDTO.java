
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class EventOptionDTO implements Serializable {

    @SerializedName("CodeID")
    @Expose
    private String codeID;
    @SerializedName("Activado")
    @Expose
    private boolean Activado;
    @SerializedName("Visible")
    @Expose
    private boolean Visible;
    @SerializedName("id_PadrePlantillaFront")
    @Expose
    private int id_PadrePlantillaFront;

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public boolean isActivado() {
        return Activado;
    }

    public void setActivado(boolean activado) {
        Activado = activado;
    }

    public boolean isVisible() {
        return Visible;
    }

    public void setVisible(boolean visible) {
        Visible = visible;
    }

    public int getId_PadrePlantillaFront() {
        return id_PadrePlantillaFront;
    }

    public void setId_PadrePlantillaFront(int id_PadrePlantillaFront) {
        this.id_PadrePlantillaFront = id_PadrePlantillaFront;
    }

    /*
    @SerializedName("CodeID")
    @Expose
    private String codeID;
    @SerializedName("IconoMenuApp")
    @Expose
    private String iconoMenuApp;
    @SerializedName("NombreActividad")
    @Expose
    private String nombreActividad;
    @SerializedName("OrdenManuAPP")
    @Expose
    private Integer ordenManuAPP;

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public String getIconoMenuApp() {
        return iconoMenuApp;
    }

    public void setIconoMenuApp(String iconoMenuApp) {
        this.iconoMenuApp = iconoMenuApp;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public Integer getOrdenManuAPP() {
        return ordenManuAPP;
    }

    public void setOrdenManuAPP(Integer ordenManuAPP) {
        this.ordenManuAPP = ordenManuAPP;
    }
*/
}
