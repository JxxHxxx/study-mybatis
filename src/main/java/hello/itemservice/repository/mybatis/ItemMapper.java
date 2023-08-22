package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    // 메서드 명은 XML 파일과 매핑되기 때문에 중요하다.ㅐ
    void save(Item item);
    // @Param 은 인자가 두 개 이상일 때, 반드시 명시해야 한다. 그래야 MyBatis가 구분 가능
    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto updateParam);

    List<Item> findAll(ItemSearchCond itemSearch);

    Optional<Item> findById(Long id);
}
