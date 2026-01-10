package multiple;

public class Email implements Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("ENviando la notificacion por EMAIL: " + mensaje);
    }
}
