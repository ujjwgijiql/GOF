package zhang.springframework.gof.visitor.visitors;


import zhang.springframework.gof.visitor.structure.OperaMailClient;
import zhang.springframework.gof.visitor.structure.SquirrelMailClient;
import zhang.springframework.gof.visitor.structure.ZimbraMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
    void visit(ZimbraMailClient mailClient);
}
