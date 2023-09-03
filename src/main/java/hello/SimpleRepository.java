package hello;


import java.util.List;

public interface SimpleRepository<Entity, ID> {

    Entity save(Entity entity);

    void update(ID id, Object updateForm);

    Entity findById(ID id);

    List<Entity> findAll(Object searchCond);
}
