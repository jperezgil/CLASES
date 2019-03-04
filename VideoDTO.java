
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoDTO {

    @SerializedName("stringresult")
    @Expose
    private String stringresult;

    public String getStringresult() {
        return stringresult;
    }

    public void setStringresult(String stringresult) {
        this.stringresult = stringresult;
    }
}
