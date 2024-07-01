package PatronFactory;

public interface NotificacionFactoryIn {

        EmailNotificacion crearEmailNotificacion();
        SMSNotificacion crearSMSNotificacion();
        AppNotification crear();

}
