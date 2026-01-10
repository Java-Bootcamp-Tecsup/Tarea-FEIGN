package multiple;

public class WhatsApp implements Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("ENviando la notificacion por WhatsApp "  + mensaje);
    }
}
