package learn.java.module16.dto;

import learn.java.module16.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author khangndd
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String email;
    private String fullName;
    private Date birthDate;
    private Gender gender;
}
