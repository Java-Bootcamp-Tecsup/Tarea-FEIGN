public class PostVideo extends Publicacion{

    private int duracionSeg;

    public PostVideo(String autor, String texto, int duracionSeg) {
        super(autor, texto);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(" Video: " + duracionSeg);
    }
}
