package code;

public class cls_control{
    private String idStr;
    private String fechaE;
    private String horaE;
    public cls_control(String idStr, String fechaE, String horaE) {
        this.idStr = idStr;
        this.fechaE = fechaE;
        this.horaE = horaE;
    }
    public String getIdStr() {
        return idStr;
    }
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }
    public String getFechaE() {
        return fechaE;
    }
    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }
    public String getHoraE() {
        return horaE;
    }
    public void setHoraE(String horaE) {
        this.horaE = horaE;
    }
    
    
}