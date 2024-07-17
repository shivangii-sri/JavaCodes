package DependencyInjection.WithoutDI;

public class NotificationService {
    private MessageService messageService;

    public NotificationService(){
        this.messageService = new EmailService();
    }

    public void sendNotification(String msg){
        messageService.sendMessage(msg);
    }

    public void switchToSMSService(){
        this.messageService = new SMSService();
    }
}
