import java.util.Random;

public abstract class Personage {
    protected static Random rnd = new Random();
    private String name;
    private int hp;
    protected SafeTool protect;

    public boolean isAlive(){
        return hp>0;
    }

    public Personage(String name, int hp, SafeTool protect) {
        this.name = name;
        this.hp = hp;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void reduceHp (int damage){
        if (this.protect.isIntact()){
            int variable = rnd.nextInt(101);
            if (variable<=this.protect.blockVariant()){
                damage -= this.protect.protection();
                this.protect.safetyMarginReduce();
            }
        }
        this.hp-=damage;
        if (this.hp<0){
            this.hp = 0;
        }
    }
}
