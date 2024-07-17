package DependencyInjection.WithoutDI;

public class WithoutDIClient {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.switchToSMSService();
        notificationService.sendNotification("Hi Shivangi !!");
    }
}
