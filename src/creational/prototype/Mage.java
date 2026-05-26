package creational.prototype;

import java.util.Objects;

public class Mage extends Warrior{

    private String color;

    public Mage(int health , int speed , String color){
        super(health, speed);
        this.color = color;
    }

    public Mage(Mage mage){
        super(mage);
        if(mage != null){
            this.color = mage.color;
        }
    }

    @Override
    public Warrior clone() {
        return new Mage(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Mage) || !super.equals(object)) return false;
        Mage mage = (Mage) object;
        return Objects.equals(color , mage.color);
    }
}
