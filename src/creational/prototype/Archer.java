package creational.prototype;

public class Archer extends Warrior{
    public int getArrowsCount() {
        return arrowsCount;
    }

    private int arrowsCount;

    public Archer(int health , int speed , int arrowsCount){
        super(health , speed);
        this.arrowsCount = arrowsCount;
    }

    public Archer(Archer archer ){
        super(archer);
        if(archer != null){
            this.arrowsCount = archer.arrowsCount;
        }
    }

    @Override
    public Warrior clone() {
        return new Archer(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Archer) || !super.equals(object)) return false;
        Archer archer = (Archer) object;
        return archer.arrowsCount == arrowsCount;
    }
}
