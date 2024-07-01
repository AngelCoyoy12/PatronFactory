package PatronFactory;

public class SMSNotificacion implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por SMS");
    }
}
