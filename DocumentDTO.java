
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentDTO {

    @SerializedName("NombreReporsitorio")
    @Expose
    private String nombreReporsitorio;
    @SerializedName("ExtesionRepositorio")
    @Expose
    private String extesionRepositorio;
    @SerializedName("LinkRepositorio")
    @Expose
    private String linkRepositorio;
    @SerializedName("TipoRepositorio")
    @Expose
    private String tipoRepositorio;

    public String getNombreReporsitorio() {
        return nombreReporsitorio;
    }

    public void setNombreReporsitorio(String nombreReporsitorio) {
        this.nombreReporsitorio = nombreReporsitorio;
    }

    public String getExtesionRepositorio() {
        return extesionRepositorio;
    }

    public void setExtesionRepositorio(String extesionRepositorio) {
        this.extesionRepositorio = extesionRepositorio;
    }

    public String getLinkRepositorio() {
        return linkRepositorio;
    }

    public void setLinkRepositorio(String linkRepositorio) {
        this.linkRepositorio = linkRepositorio;
    }

    public String getTipoRepositorio() {
        return tipoRepositorio;
    }

    public void setTipoRepositorio(String tipoRepositorio) {
        this.tipoRepositorio = tipoRepositorio;
    }


}
