package zhang.springframework.gof.visitor.structure;

import zhang.springframework.gof.visitor.visitors.MailClientVisitor;

public class OperaMailClient implements MailClient{
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println(" OperaMailClient: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println(" OperaMailClient: Receiving mail");
     }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}