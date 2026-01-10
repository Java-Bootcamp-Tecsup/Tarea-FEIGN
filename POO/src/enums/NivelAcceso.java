package enums;

public enum NivelAcceso {
    BAJO(1), MEDIO(2), ALTO(3);
    private final int codigo;
    NivelAcceso(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
