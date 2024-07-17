package DependencyInjection.WithDI;

public class ObjectCreator {

    public static NotificationService createNotificationWithEmail(){
        MessageService emailMessageService = new EmailService();

        NotificationService notificationService = new NotificationService(emailMessageService);

        return notificationService;
    }

    public static NotificationService createNotificationWithSMS(){
        MessageService smsMessageService = new SMSService();

        NotificationService notificationService = new NotificationService(smsMessageService);

        return notificationService;
    }
}
