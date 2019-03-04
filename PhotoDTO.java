
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotoDTO {

    @SerializedName("fotoresult")
    @Expose
    private String fotoresult;

    public String getFotoresult() {
        return fotoresult;
    }

    public void setFotoresult(String fotoresult) {
        this.fotoresult = fotoresult;
    }
}
