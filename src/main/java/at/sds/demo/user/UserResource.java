package at.sds.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User findUser(@PathVariable Integer id){
        return service.findOne(id);
    }

    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user){
        service.save(user);

        ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")

        ResponseEntity
    }

}
