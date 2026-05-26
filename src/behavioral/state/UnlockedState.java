package behavioral.state;

public class UnlockedState implements GateState{
    @Override
    public void insertCard(Gate gate) {
        System.out.println("Ошибка ! Проезд уже оплачен проходите!");
    }

    @Override
    public void pass(Gate gate) {
        System.out.println("Вы прошли успешно ! Турникет закрывается!");
        gate.changeState(new LockedState());
    }
}
