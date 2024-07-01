package PatronFactory;

public class UrgenteNotificacionFactory implements NotificacionFactoryIn {

    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    @Override
    public AppNotification crearAppAplicacion() {
        return new AppNotification();
    }
}

