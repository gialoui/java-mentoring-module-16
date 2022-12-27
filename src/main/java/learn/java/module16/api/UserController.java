package learn.java.module16.api;

import learn.java.module16.dto.SportDto;
import learn.java.module16.dto.UserDto;
import learn.java.module16.entity.UserEntity;
import learn.java.module16.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author khangndd
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestBody UserDto json) {
        return ResponseEntity.ok(service.create(json));
    }

    @RequestMapping(value = "/{id}/sport", method = RequestMethod.PUT)
    public ResponseEntity<String> addSport(@PathVariable("id") String id,
                                           @RequestBody SportDto json) {
        return ResponseEntity.ok(service.addSport(id, json));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @RequestMapping(value = "/by-email/{email}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> findByEmail(@PathVariable("email") String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }

    @RequestMapping(value = "/sport/{sportName}", method = RequestMethod.GET)
    public ResponseEntity<List<UserEntity>> findBySportName(@PathVariable("sportName") String sportName) {
        return ResponseEntity.ok(service.findBySportName(sportName));
    }
}
