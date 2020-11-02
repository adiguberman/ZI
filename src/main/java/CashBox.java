import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
public class CashBox {

    Map<String,Integer> catalog;
    Map<String,Discount> discountCatalog;

    public Integer getBuy(List<String> buy)
    {
        int price = 0;
        for (String str: buy) {
            int prodPrice =  catalog.get(str);
            Discount discount = discountCatalog.get(str);
            if (Objects.nonNull(discount)) {
                prodPrice -= discount.apply();
            }
            price += prodPrice;
        }
        return  price;
    }


}
