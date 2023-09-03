package hello.order.dto;

import lombok.Getter;

@Getter
public class OrderSearchCond {

    private final String userId;
    private final Long itemId;

    public OrderSearchCond(String userId, Long itemId) {
        this.userId = userId;
        this.itemId = itemId;
    }
}
