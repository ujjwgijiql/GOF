package zhang.springframework.gof.builder.director;

import zhang.springframework.gof.builder.builders.ConcreteHouseBuilder;
import zhang.springframework.gof.builder.builders.HouseBuilder;
import zhang.springframework.gof.builder.builders.PrefabricatedHouseBuilder;
import zhang.springframework.gof.builder.director.ConstructionEngineer;
import zhang.springframework.gof.builder.product.House;

import org.junit.Test;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }
}