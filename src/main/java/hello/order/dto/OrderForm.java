package hello.order.dto;

import hello.order.domain.OrderInfo;
import lombok.Getter;

@Getter
public class OrderForm {
    private final Long userId;
    private final Long itemId;
    private final Integer itemQuantity;
    private final Integer itemPrice;

    public OrderForm(Long userId, Long itemId, Integer itemQuantity, Integer itemPrice) {
        this.userId = userId;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
}
