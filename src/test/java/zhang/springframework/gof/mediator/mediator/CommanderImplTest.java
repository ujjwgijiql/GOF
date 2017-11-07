package zhang.springframework.gof.mediator.mediator;

import org.junit.Test;

import zhang.springframework.gof.mediator.colleague.ArmedUnit;
import zhang.springframework.gof.mediator.colleague.SoldierUnit;
import zhang.springframework.gof.mediator.colleague.TankUnit;
import zhang.springframework.gof.mediator.mediator.Commander;
import zhang.springframework.gof.mediator.mediator.CommanderImpl;

import static org.junit.Assert.*;


public class CommanderImplTest {

    @Test
    public void testMediator() throws Exception {
        Commander commander= new CommanderImpl();
        ArmedUnit soldierUnit=new SoldierUnit(commander);
        ArmedUnit tankUnit=new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}