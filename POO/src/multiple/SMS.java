package multiple;

public class SMS implements Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando la notificacion por SMS " + mensaje);
    }
}
