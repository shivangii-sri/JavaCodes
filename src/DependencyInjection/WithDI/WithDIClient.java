package DependencyInjection.WithDI;

public class WithDIClient {

    public static void main(String[] args) {

        NotificationService notificationService = ObjectCreator.createNotificationWithEmail();
        notificationService.sendNotification("Sudhanshu is a genius in dreams");

        NotificationService notificationService1 = ObjectCreator.createNotificationWithSMS();
        notificationService1.sendNotification("this is with sms");
    }
}
