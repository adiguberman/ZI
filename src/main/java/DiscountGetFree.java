public class DiscountGetFree implements Discount {
    private final int x;
    private final int y;
    private int currentx;
    private int currenty;
    private final Integer price;

    public DiscountGetFree(Integer x, Integer y, Integer price) {
        this.x = x;
        this.y = y;
        currentx = x;
        currenty = y;
        this.price = price;
    }

    @Override
    public Integer apply() {
        int res = price;
        if (currentx > 0) {
            currentx--;
        }else {
            if (currenty > 0) {
                if (currenty == 1) {
                    currentx = x;
                    currenty = y;
                }
                return res;
            }
        }
        return 0;
    }
}
