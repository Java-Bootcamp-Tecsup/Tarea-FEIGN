package abstracto;

public class NotificacionSMS extends Notificacion{

    public NotificacionSMS(String remitente) {
        super(remitente);
    }
    @Override
    public void enviar(String mensaje) {
        System.out.println("SMS enviado "+ mensaje);
    }
}
