package hello.order.domain;

import lombok.Getter;

@Getter
public class OrderInfo {

    protected Long itemId;
    protected Integer itemQuantity;
    protected Integer itemPrice;

    public OrderInfo(Long itemId, Integer itemQuantity, Integer itemPrice) {
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public static OrderInfo of(Long itemId, Integer itemQuantity, Integer itemPrice) {
        return new OrderInfo(itemId, itemQuantity, itemPrice);
    }
}
