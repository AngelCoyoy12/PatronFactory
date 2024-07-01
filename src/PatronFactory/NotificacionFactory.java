package PatronFactory;

public class NotificacionFactory {

    public Notificacion crearNotificacion(String tipoMensaje) {
        switch (tipoMensaje.toLowerCase()) {
            case "email":
                return new EmailNotificacion();
            case "sms":
                return new SMSNotificacion();
            case "app":
                return new AppNotification();
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipoMensaje);
        }
    }
}
