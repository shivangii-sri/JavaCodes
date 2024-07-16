package DependencyInversionPrinciple.NotificationExample.WithoutDIP;

public class NotificationService {
    private EmailService emailService;

    public NotificationService(){
        this.emailService = new EmailService();
    }

    public void sendNotification(String msg){
        emailService.sendEmail(msg);
    }
}
