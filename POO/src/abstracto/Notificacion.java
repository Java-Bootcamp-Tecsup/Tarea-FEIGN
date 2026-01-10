package abstracto;

public abstract class Notificacion {

    protected String remitente; //Estado compartido

    public Notificacion(String remitente) {
        this.remitente = remitente;
    }

    //Metodo abstracto (es el que cada hijo debe implementar)
    public abstract void enviar(String mensaje);

    //Metodo concreto (logica comun)
    public void logEnvio(){
        System.out.println("Enviado por: "+ remitente);
    }

}
