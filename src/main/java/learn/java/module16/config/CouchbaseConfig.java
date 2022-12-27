package learn.java.module16.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

/**
 * @author khangndd
 */
@Configuration
@EnableCouchbaseRepositories
@EnableReactiveCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    @Override
    public String getConnectionString() {
        return "localhost";
    }

    @Override
    public String getUserName() {
        return "Administrator";
    }

    @Override
    public String getPassword() {
        return "password";
    }

    @Override
    public String getBucketName() {
        return "module-16";
    }

    @Override
    public String typeKey() {
        return "type";
    }
}
