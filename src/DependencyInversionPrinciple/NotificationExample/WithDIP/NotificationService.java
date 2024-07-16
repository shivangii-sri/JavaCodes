package DependencyInversionPrinciple.NotificationExample.WithDIP;

public class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService){
        this.messageService= messageService;
    }

    public void sendNotification(String msg){
        messageService.sendMessage(msg);
    }
}
