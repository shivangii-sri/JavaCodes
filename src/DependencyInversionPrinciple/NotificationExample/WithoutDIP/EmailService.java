package DependencyInversionPrinciple.NotificationExample.WithoutDIP;

import java.security.spec.RSAOtherPrimeInfo;

public class EmailService {

    public void sendEmail(String msg){
        System.out.println("Sending notification with email, with msg : " + msg);
    }
}
