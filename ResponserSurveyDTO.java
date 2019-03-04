
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponserSurveyDTO {

    @SerializedName("errorstatus")
    @Expose
    private Boolean errorstatus;
    @SerializedName("messagestatus")
    @Expose
    private String messagestatus;

    public Boolean getErrorstatus() {
        return errorstatus;
    }

    public void setErrorstatus(Boolean errorstatus) {
        this.errorstatus = errorstatus;
    }

    public String getMessagestatus() {
        return messagestatus;
    }

    public void setMessagestatus(String messagestatus) {
        this.messagestatus = messagestatus;
    }

}