package zhang.springframework.gof.facade.subcomponents;


import zhang.springframework.gof.facade.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product){
        /*Check Warehouse database for product availability*/
        return true;
    }
}
