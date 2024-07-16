package DependencyInversionPrinciple.NotificationExample.WithoutDIP;

public class WithoutDIPClient {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hi Shivangi");
    }
}
