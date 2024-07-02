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
    public AppNotification crearAppNotificacion() {
        return new AppNotification();
    }
}

