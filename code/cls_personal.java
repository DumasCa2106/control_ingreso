package code;

public class cls_personal{
    private String idStr;
    private String nombreStr;
    private String contactoStr; 
    private String correoStr;
    public cls_personal(String idStr, String nombreStr, String contactoStr, String correoStr) {
        this.idStr = idStr;
        this.nombreStr = nombreStr;
        this.contactoStr = contactoStr;
        this.correoStr = correoStr;
    }
    public String getIdStr() {
        return idStr;
    }
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }
    public String getNombreStr() {
        return nombreStr;
    }
    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }
    public String getContactoStr() {
        return contactoStr;
    }
    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }
    public String getCorreoStr() {
        return correoStr;
    }
    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    
}


