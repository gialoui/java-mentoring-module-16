package learn.java.module16.converter;

import learn.java.module16.dto.UserDto;
import learn.java.module16.entity.UserEntity;
import org.modelmapper.ModelMapper;

/**
 * @author khangndd
 */
public class UserConverter {
    public static UserEntity fromDto(UserDto dto) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(dto, UserEntity.class);
    }
}
