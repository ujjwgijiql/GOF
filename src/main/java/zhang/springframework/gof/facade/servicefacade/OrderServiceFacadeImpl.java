package zhang.springframework.gof.facade.servicefacade;

import zhang.springframework.gof.facade.domain.Product;
import zhang.springframework.gof.facade.subcomponents.InventoryService;
import zhang.springframework.gof.facade.subcomponents.PaymentService;
import zhang.springframework.gof.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade{

    public boolean placeOrder(int pId){
        boolean orderFulfilled=false;
        Product product=new Product();
        product.productId=pId;
        if(InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId+" is available.");
            boolean paymentConfirmed= PaymentService.makePayment();
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled=true;
            }
        }
        return orderFulfilled;
    }
}
