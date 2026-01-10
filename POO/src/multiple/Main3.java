package multiple;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Notificacion> notificacions = new ArrayList<>();

        notificacions.add(new Email());
        notificacions.add(new SMS());
        notificacions.add(new WhatsApp());

        for (Notificacion n : notificacions){
            n.enviar("Hola, este es una notificacion importante");
        }
    }
}
