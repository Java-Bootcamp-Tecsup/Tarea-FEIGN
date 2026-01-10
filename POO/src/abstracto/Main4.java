package abstracto;

public class Main4 {
    public static void main(String[] args) {
        Notificacion not1 = new NotificacionEmail("Sistema");
        Notificacion not2 = new NotificacionSMS("Sistema");
        Notificacion not3 = new NotificacionWSP("Sistema");

        not1.enviar("Mnesaje 1");
        not2.enviar("Mnesaje 1");
        not3.enviar("Mnesaje 1");
    }
}
