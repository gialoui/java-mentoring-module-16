package learn.java.module16.repo;

import learn.java.module16.entity.UserEntity;
import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

/**
 * @author khangndd
 */
@Repository
@Collection("member")
public interface UserRepository extends CouchbaseRepository<UserEntity, String> {
}
