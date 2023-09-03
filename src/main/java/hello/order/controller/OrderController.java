package hello.order.controller;

import hello.order.domain.Order;
import hello.order.domain.OrderInfo;
import hello.order.dto.OrderForm;
import hello.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @PostMapping("/orders")
    public void createOrder(@RequestBody OrderForm form) {

        Order order = new Order(form.getUserId(),
                OrderInfo.of(form.getItemId(), form.getItemQuantity(), form.getItemPrice()));
        Order savedOrder = orderRepository.save(order);

        log.info("order : {}", savedOrder.toString());
    }

    @GetMapping("/orders/{order-id}")
    public ResponseEntity<Order> findOrder(@PathVariable("order-id") Long orderId) {

        Order findOrder = orderRepository.findById(orderId);

        return ResponseEntity.ok(findOrder);
    }
}
