package learn.java.module16.entity;

import learn.java.module16.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author khangndd
 */
@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    private String id;

    @Field
    @NotNull
    private String email;

    @Field
    @NotNull
    private String fullName;

    @Field
    @NotNull
    private Date birthDate;

    @Field
    @NotNull
    private Gender gender;
}
