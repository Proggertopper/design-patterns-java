package creational.prototype;

public abstract class Warrior {
    private int health;
    private int speed;

    public Warrior(int health , int speed){
        this.health = health;
        this.speed = speed;
    }

    public Warrior(Warrior warrior){
        if(warrior != null){
            this.health = warrior.health;
            this.speed = warrior.speed;
        }
    }

    public abstract Warrior clone();

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Warrior)) return false;
        Warrior warrior = (Warrior) object;
        return warrior.health==health && warrior.speed==speed;
    }
}
