import java.util.Random;

public class MakeshiftShield extends Shield{
    protected static Random rnd = new Random();
    public MakeshiftShield() {
        super("Самодельный щит", rnd.nextInt(50), 25, rnd.nextInt(21-10)+10);
    }

    @Override
    public int protection() {
        return rnd.nextInt(50);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}
