package behavioral.state;

public class LockedState implements GateState{
    @Override
    public void insertCard(Gate gate) {
        System.out.println("Карта принята, открываю турникет");
        gate.changeState(new UnlockedState());
    }

    @Override
    public void pass(Gate gate) {
        System.out.println("Ошибка ! Проход закрыт, сначала оплатите");
    }
}
