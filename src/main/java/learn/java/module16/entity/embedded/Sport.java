package learn.java.module16.entity.embedded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author khangndd
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sport {
    private String id;
    private String sportName;
    private String sportProficiency;
}
