package util;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author luciano
 */
public class Email {

  public String sendGMail(String name, String destination, String message) throws EmailException {
    SimpleEmail email = new SimpleEmail();
    email.setHostName("smtp.gmail.com");
    email.setSmtpPort(587);
    email.addTo(destination, name);
    email.setFrom("lucianobeserra@gmail.com", "Grupo Espírita Chico Xavier");
    email.setSubject("Aviso Devolução atrasada");
    email.setMsg(message);
    email.setSSL(true);
    System.out.println("Autenticando, aguarde ...");
    email.setAuthentication("lucianobeserra", "mf0104lb");
    System.out.println("Enviando, aguarde ...");
    return "Email " + email.send() + " enviado.";
  }

  public void sendHotMail(String to, String subject, String msg) {
    Properties property = new Properties();
    property.put("mail.transport.protocol", "smtp");
    property.put("mail.smtp.host", "smtp.live.com");
    property.put("mail.smtp.socketFactory.port", "587");
    property.put("mail.smtp.socketFactory.fallback", "false");
    property.put("mail.smtp.starttls.enable", "true");
    property.put("mail.smtp.auth", "true");
    property.put("mail.smtp.port", "587");

    Session session = Session.getDefaultInstance(property, new javax.mail.Authenticator() {
      @Override
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("contato@gecx.net.br", "gecx2013");
      }
    });

    session.setDebug(true);
    try {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("contato@gecx.net.br", "Grupo Espírita Chico Xavier"));
      message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
      message.setSubject(subject);
      message.setText(msg);
      Transport.send(message);
      JOptionPane.showMessageDialog(null, "Email Enviado", "Informação", JOptionPane.INFORMATION_MESSAGE);
    } catch (MessagingException | UnsupportedEncodingException me) {
      System.out.println(me.getLocalizedMessage());
    }
  }

}
