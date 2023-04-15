public class Archer extends Warrior<Throwing, Shield>{

    public Archer(String name, int hp, Shield protect, Throwing weapon) {
        super(name, hp, protect, weapon);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
