package DependencyInversionPrinciple.NotificationExample.WithDIP;

public class SMSService implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending notification with SMS, with msg : " + msg);
    }
}
