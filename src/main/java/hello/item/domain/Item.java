package hello.item.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Item {

    private Long id;

    private String itemName;
    private Integer price;
    private Integer quantity;
    private LocalDateTime createTime;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.createTime = LocalDateTime.now();
    }
}
