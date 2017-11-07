package zhang.springframework.gof.state.states;

public interface CandyVendingMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}
