import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Map<String,Integer> catalog = new HashMap<>(3);
        catalog.put("A",10);
        catalog.put("B",20);
        catalog.put("C",30);
        catalog.put("D",40);
        Map<String,Discount> discountCatalog = new HashMap<>(3);
        discountCatalog.put("A",new DiscountGetFree(2,1,10));
        discountCatalog.put("D",new DiscountGetFree(3,2,40));
        discountCatalog.put("B",new Bundle(3,10));

        CashBox cashBox = new CashBox(catalog,discountCatalog);
        List<String> buy = new ArrayList<>();
        buy.add("A");
        buy.add("B");
        buy.add("C");
        System.out.println(cashBox.getBuy(buy));
        buy.clear();
        buy.add("A");
        buy.add("A");
        buy.add("A");
        System.out.println(cashBox.getBuy(buy));
        buy.clear();
        buy.add("D");
        buy.add("D");
        buy.add("D");
        buy.add("D");
        System.out.println(cashBox.getBuy(buy));
        buy.clear();
        buy.add("A");
        buy.add("B");
        buy.add("B");
        buy.add("B");
        System.out.println(cashBox.getBuy(buy));
    }
}
