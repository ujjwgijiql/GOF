package zhang.springframework.gof.ChainofResponsibility;

        import zhang.springframework.gof.ChainofResponsibility.handlers.AbstractSupportHandler;
import zhang.springframework.gof.ChainofResponsibility.handlers.BillingSupportHandler;
import zhang.springframework.gof.ChainofResponsibility.handlers.GeneralSupportHandler;
import zhang.springframework.gof.ChainofResponsibility.handlers.TechnicalSupportHandler;

public class RequestorClient {

    public  static AbstractSupportHandler getHandlerChain(){


        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler( AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(  AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }

}
