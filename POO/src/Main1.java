import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Publicacion> feed = new ArrayList<>();

        feed.add(new PostImagen("AnaA", "Almuerzo de hoy","img_0001_jpg"));
        feed.add(new PostVideo("Luis", "Entrenamiento",45));
        feed.add(new PostImagen("Nike", "Vista de la Playa","img_1231_jpg"));
        feed.add(new PostVideo("Arturo", "Cocinando",120));
        feed.add(new PostImagen("Adrian", "Cena","img_8561_jpg"));

        int cantImagen = 0;
        int cantVideo = 0;

        System.out.println("============= FEED ============");
        for (Publicacion p : feed) {
            p.mostrar();
            System.out.println();

            if (p instanceof PostImagen) cantImagen++;
            else if (p instanceof PostVideo) cantVideo++;
        }
        System.out.println(" Total PostImagen: " + cantImagen);
        System.out.println(" Total PostVideo: " + cantVideo);

        //EXTRA
        boolean encontrado = false;
        for (Publicacion p : feed){
            if(p.getAutor().equals("Ana")){
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado ? "Encontrado autor ANA" : "NO ECONTRADO AUTOR ANA");

    }
}
