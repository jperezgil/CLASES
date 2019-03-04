
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QRValidationDTO {

    @SerializedName("errorstatus")
    @Expose
    private Boolean errorstatus;
    @SerializedName("errormessasge")
    @Expose
    private String errormessasge;

    public Boolean getErrorstatus() {
        return errorstatus;
    }

    public void setErrorstatus(Boolean errorstatus) {
        this.errorstatus = errorstatus;
    }

    public String getErrormessasge() {
        return errormessasge;
    }

    public void setErrormessasge(String errormessasge) {
        this.errormessasge = errormessasge;
    }

}
