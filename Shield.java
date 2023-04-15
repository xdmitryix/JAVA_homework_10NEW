import java.util.Random;

public abstract class Shield implements SafeTool{
    protected static Random rnd = new Random();
    protected String name;
    protected int protection;
    private int blockVariant;
    private int safetyMargin;

    @Override
    public int blockVariant() {
        return blockVariant;
    }

    @Override
    public void safetyMarginReduce() {
        this.safetyMargin -= rnd.nextInt(11-1)+1;
        if (this.safetyMargin <= 0){
            this.safetyMargin = 0;
        }
    }

    public boolean isIntact() {
        while (safetyMargin > 0) {
            return true;
        }
        return false;
    }

    public Shield(String name, int protection, int blockVariant, int safetyMargin) {
        this.name = name;
        this.blockVariant = blockVariant;
        this.safetyMargin = safetyMargin;
    }

    @Override
    public int safetyMargin() {
        return safetyMargin;
    }

    @Override
    public String toString() {
        return String.format("%s (защита: %d ресурс: %d)", name, protection(), safetyMargin);
    }
}
