package zhang.springframework.gof.bridge.abstraction;

import zhang.springframework.gof.bridge.implementation.MessageSender;

public class TextMessage extends Message{

    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
      messageSender.sendMessage();
    }

}
