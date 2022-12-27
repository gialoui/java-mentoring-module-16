package learn.java.module16.converter;

import learn.java.module16.dto.SportDto;
import learn.java.module16.entity.embedded.Sport;
import org.modelmapper.ModelMapper;

/**
 * @author khangndd
 */
public class SportConverter {
    public static Sport fromDto(SportDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Sport.class);
    }
}
