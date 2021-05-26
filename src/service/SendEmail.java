package service;

import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class SendEmail {

    public void sendMail(String sendTo) {
        final String from = "michal7010@gmail.com";
        final String host = "localhost";
        final Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        final Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo));
            message.setSubject("This is the Subject Line!");
            message.setText("This is actual message");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
}