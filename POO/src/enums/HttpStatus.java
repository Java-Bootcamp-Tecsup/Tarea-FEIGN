package enums;

public enum HttpStatus {
    OK(200, "OK"),
    CREATED(201, "Created"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    SERVER_ERROR(500, "Server Error");
    private final int code;
    private final String descripcion;

    HttpStatus(int code, String descripcion) {
        this.code = code;
        this.descripcion = descripcion;
    }

    public int getCode() {
        return code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static HttpStatus fromCode(int code){
        for (HttpStatus s : values()){
            if(s.code == code) return s;
        }
        return null; // o Lanzar una Exepcion
    }

}
