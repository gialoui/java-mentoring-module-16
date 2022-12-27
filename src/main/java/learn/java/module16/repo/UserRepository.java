package learn.java.module16.repo;

import learn.java.module16.entity.UserEntity;
import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author khangndd
 */
@Repository
@Collection("member")
public interface UserRepository extends CouchbaseRepository<UserEntity, String> {
    UserEntity findByEmail(String email);

    @Query("#{#n1ql.selectEntity} WHERE #{#n1ql.filter} AND ANY s IN sports SATISFIES s.sportName IN [$1] END")
    List<UserEntity> findBySportName(String sportName);
}
