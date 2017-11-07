package zhang.springframework.gof.bridge.abstraction;

import zhang.springframework.gof.bridge.abstraction.Message;
import zhang.springframework.gof.bridge.abstraction.TextMessage;
import zhang.springframework.gof.bridge.implementation.EmailMessageSender;
import zhang.springframework.gof.bridge.implementation.MessageSender;
import zhang.springframework.gof.bridge.implementation.TextMessageSender;

import org.junit.Test;

import static org.junit.Assert.*;


public class MessageTest {

    @Test
    public void testSend() throws Exception {
      MessageSender textMessageSender=new TextMessageSender();
      Message textMessage=new TextMessage(textMessageSender);
      textMessage.send();

       MessageSender emailMessageSender=new EmailMessageSender();
       Message emailMessage=new TextMessage(emailMessageSender);
       emailMessage.send();
    }
}