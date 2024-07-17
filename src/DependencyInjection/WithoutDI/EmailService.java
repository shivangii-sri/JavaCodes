package DependencyInjection.WithoutDI;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending notification with email, with msg : " + msg);
    }
}
