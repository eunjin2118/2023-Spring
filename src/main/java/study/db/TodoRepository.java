package study.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import study.db.entity.Todo;
@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
