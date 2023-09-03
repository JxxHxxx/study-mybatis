package hello.order.domain;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    private Long id;
    private Long userId;
    private LocalDateTime orderTime;
    private boolean cancelFlag;
    private OrderInfo orderInfo;

    public Order(Long userId, OrderInfo orderInfo) {
        this.userId = userId;
        this.orderTime = LocalDateTime.now();
        this.orderInfo = orderInfo;
        this.cancelFlag = false;
    }
}
