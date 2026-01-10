package abstracto;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Notificacion> notificaciones = new ArrayList<>();
        notificaciones.add(new NotificacionWSP("Sistema WSP"));
        notificaciones.add(new NotificacionEmail("Sistema EMAIL"));
        notificaciones.add(new NotificacionSMS("Sistema SMS"));
        for(Notificacion lista: notificaciones){
            lista.enviar("Mensaje 1");
        }
    }
}
