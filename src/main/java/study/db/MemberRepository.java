package study.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import study.db.entity.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer> { // entity타입, id의 타입(primary key)

}
