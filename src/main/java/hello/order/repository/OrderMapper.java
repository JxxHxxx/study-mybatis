package hello.order.repository;

import hello.order.domain.Order;
import hello.order.dto.OrderSearchCond;
import hello.order.dto.OrderUpdateForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderMapper {
    // 메서드 명은 XML 파일과 매핑되기 때문에 중요하다
    void save(Order order);
    // @Param 은 인자가 두 개 이상일 때, 반드시 명시해야 한다. 그래야 MyBatis가 구분 가능
    void update(@Param("id") Long id, @Param("updateParam") OrderUpdateForm orderUpdateForm);

    Optional<Order> findById(Long id);

    List<Order> findAll(OrderSearchCond searchCond);
}
