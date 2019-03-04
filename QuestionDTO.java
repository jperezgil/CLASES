
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionDTO {

    @SerializedName("boolresult")
    @Expose
    private Boolean boolresult;

    public Boolean getBoolresult() {
        return boolresult;
    }

    public void setBoolresult(Boolean boolresult) {
        this.boolresult = boolresult;
    }

}
