package hello.order.dto;

import lombok.Getter;

@Getter
public class OrderUpdateForm {

    private final boolean cancelFlag;

    public OrderUpdateForm(boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }
}
