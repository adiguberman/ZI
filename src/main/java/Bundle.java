
/*
Buy x get y free
 */
public class Bundle implements Discount {
    private final int x;
    private int currentx;
    private final Integer discount;

    public Bundle(Integer x, Integer discount) {
        this.x = x;
        currentx = x;
        this.discount = discount;
    }

    @Override
    public Integer apply() {
        if (currentx > 0) {
            currentx--;
            return 0;
        }
        return discount;
    }
}
