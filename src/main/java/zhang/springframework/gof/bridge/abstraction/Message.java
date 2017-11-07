package zhang.springframework.gof.bridge.abstraction;

import zhang.springframework.gof.bridge.implementation.MessageSender;

public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }
     abstract public void send();
}
