package abstracto;

public class NotificacionEmail extends Notificacion{
    public NotificacionEmail(String remitente) {
        super(remitente);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("EMAIL enviado "+ mensaje);
    }
}
