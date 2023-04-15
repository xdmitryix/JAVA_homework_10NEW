public class WoodShield extends Shield{

    public WoodShield() {
        super("Деревяный щит", 15, 20, 25);
    }

    @Override
    public int protection() {
        if (isIntact()) return 15;
        else return 0;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}
