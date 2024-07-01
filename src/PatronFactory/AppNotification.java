package PatronFactory;

public class AppNotification implements  Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por medio de la App");
    }
}
