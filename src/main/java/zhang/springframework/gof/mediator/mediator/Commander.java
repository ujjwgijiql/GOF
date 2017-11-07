package zhang.springframework.gof.mediator.mediator;


import zhang.springframework.gof.mediator.colleague.ArmedUnit;
import zhang.springframework.gof.mediator.colleague.SoldierUnit;
import zhang.springframework.gof.mediator.colleague.TankUnit;

public interface Commander {
   void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);
    void setAttackStatus(boolean attackStatus);
    boolean canAttack();
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
