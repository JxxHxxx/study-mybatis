package hello.order.repository;

import hello.SimpleRepository;
import hello.order.domain.Order;
import hello.order.dto.OrderSearchCond;
import hello.order.dto.OrderUpdateForm;
import hello.order.exception.PersistenceNotExistedException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository implements SimpleRepository<Order, Long> {

    private final OrderMapper orderMapper;

    @Override
    public Order save(Order order) {
        orderMapper.save(order);
        return order;
    }

    @Override
    public void update(Long id, Object updateForm) {
        OrderUpdateForm orderUpdateForm = (OrderUpdateForm) updateForm;
        orderMapper.update(id, orderUpdateForm);

    }

    @Override
    public Order findById(Long id) {
        Order order = orderMapper.findById(id)
                .orElseThrow(() -> new PersistenceNotExistedException("존재하지 않는 주문입니다"));

        System.out.println(order);

        return order;

    }

    @Override
    public List<Order> findAll(Object searchCond) {
        OrderSearchCond orderSearchCond = (OrderSearchCond) searchCond;
        return orderMapper.findAll(orderSearchCond);
    }
}
