
package pe.gob.bcrp.www.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DatosServidorDTO {

    @SerializedName("id_Server")
    @Expose
    private Integer idServer;
    @SerializedName("NameServer")
    @Expose
    private String nameServer;
    @SerializedName("IpHostServer")
    @Expose
    private String ipHostServer;
    @SerializedName("UseServer")
    @Expose
    private String useServer;
    @SerializedName("PassServer")
    @Expose
    private String passServer;

    public Integer getIdServer() {
        return idServer;
    }

    public void setIdServer(Integer idServer) {
        this.idServer = idServer;
    }

    public String getNameServer() {
        return nameServer;
    }

    public void setNameServer(String nameServer) {
        this.nameServer = nameServer;
    }

    public String getIpHostServer() {
        return ipHostServer;
    }

    public void setIpHostServer(String ipHostServer) {
        this.ipHostServer = ipHostServer;
    }

    public String getUseServer() {
        return useServer;
    }

    public void setUseServer(String useServer) {
        this.useServer = useServer;
    }

    public String getPassServer() {
        return passServer;
    }

    public void setPassServer(String passServer) {
        this.passServer = passServer;
    }

}
