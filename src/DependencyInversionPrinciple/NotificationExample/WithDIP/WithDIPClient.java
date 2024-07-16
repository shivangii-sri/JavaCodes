package DependencyInversionPrinciple.NotificationExample.WithDIP;

public class WithDIPClient {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification("Hi Shivangi");

        SMSService smsService = new SMSService();
        NotificationService notificationService1 = new NotificationService(smsService);
        notificationService1.sendNotification("Hi Sudhanshu");
    }
}
