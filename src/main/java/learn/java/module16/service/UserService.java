package learn.java.module16.service;

import learn.java.module16.converter.SportConverter;
import learn.java.module16.converter.UserConverter;
import learn.java.module16.dto.SportDto;
import learn.java.module16.dto.UserDto;
import learn.java.module16.entity.UserEntity;
import learn.java.module16.exception.NotFoundException;
import learn.java.module16.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author khangndd
 */
@Service
public class UserService {
    @Value("${storage.expiry:0}")
    private int expiry;

    @Autowired
    private UserRepository repository;

    public String create(UserDto user) {
        var entity = UserConverter.fromDto(user);
        entity.setId(UUID.randomUUID().toString());

        return repository.save(entity).getId();
    }

    public String addSport(String id, SportDto dto) {
        var entityOptional = repository.findById(id);

        if (entityOptional.isPresent()) {
            var entity = entityOptional.get();
            var sportEntity = SportConverter.fromDto(dto);
            sportEntity.setId(UUID.randomUUID().toString());

            if (entity.getSports() == null) {
                entity.setSports(new ArrayList<>());
            }
            
            entity.getSports().add(sportEntity);
            entity.setSports(entity.getSports());

            repository.save(entity);
            return sportEntity.getId();
        } else {
            throw new NotFoundException();
        }
    }

    public UserEntity findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public UserEntity findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
