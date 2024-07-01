package PatronFactory;

public class MainFactory {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion email = factory.crearNotificacion("email");
        email.enviarMensaje("Mensaje por correo");

        Notificacion sms = factory.crearNotificacion("sms");
        sms.enviarMensaje("Mensaje por sms");

        Notificacion app = factory.crearNotificacion("app");
        app.enviarMensaje("Mensaje por la app");

        NotificacionFactoryIn urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("mensaje urgente por email");

        NotificacionFactoryIn regularFactory = new RegularNotificacionFactory();
        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Mensaje regular por mensaje");
    }

}


