public class PostImagen extends Publicacion {
    private String urlImagen;
    public PostImagen(String autor, String texto, String urlImagen) {
        super(autor, texto);
        this.urlImagen = urlImagen;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(" Imagen: " + urlImagen);
    }
}
