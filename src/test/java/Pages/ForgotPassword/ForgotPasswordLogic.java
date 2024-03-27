package Pages.ForgotPassword;

import java.util.Properties;
import javax.mail.*;

public class ForgotPasswordLogic extends ForgotPasswordPO {

    public void forgotPasswordLinkDisplayedWithResendPasswordOrLoginButtons() {
        waitForVisibility(resetPassword);
        validateURL("forgetpassword");
        isElementDisplayed(Login);
    }

    public void validateOnResedPasswordEmail() throws MessagingException {
        // Email server configuration
        String host = "https://mail.google.com";
        String username = "yarahelal96@gmail.com";
        String password = "@Yara123Gmail";

        // Set properties
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");

        // Connect to the email server
        Session session = Session.getDefaultInstance(properties);
        try {
            Store store = session.getStore("imaps");
            store.connect(host, username, password);

            // Access the inbox folder
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // Get messages
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                // Print email content
                if(message.getSubject().equals("Set saeker account password")) {
                    System.out.println("Subject: " + message.getSubject());
                    System.out.println("From: " + message.getFrom()[0]);
                    System.out.println("Content: " + message.getContent());
                }
            }

            // Close the connection
            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

