package PatronFactory;

public class EmailNotificacion implements  Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviado mensaje por medio de email");
    }
}
