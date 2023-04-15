public interface SafeTool {
    boolean isIntact();

    int protection();

    int blockVariant();

    void safetyMarginReduce();
    int safetyMargin();
}