public class Publicacion {
    protected String autor;
    protected String texto;

    public Publicacion(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrar(){
        System.out.println("AUTOR: " + autor + " | Texto: "+ texto);
    }
}
