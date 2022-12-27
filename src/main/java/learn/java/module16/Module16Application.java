package learn.java.module16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {CouchbaseAutoConfiguration.class})
public class Module16Application {

	public static void main(String[] args) {
		SpringApplication.run(Module16Application.class, args);
	}

}
