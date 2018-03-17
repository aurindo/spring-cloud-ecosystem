package br.com.aurindo.emailService.resource;

import br.com.aurindo.emailService.entity.User;
import br.com.aurindo.emailService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(
            @PathVariable(value = "id", required = true)Long userId) {
        return userService.findById(userId);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(
            @Valid @RequestBody User user) throws Exception {

        ResponseEntity responseEntity = null;

        User userSaved = userService.save(user);

        URI url =
                ServletUriComponentsBuilder.fromCurrentRequest().path("/").path(userSaved.getId().toString()).build().toUri();

        responseEntity = ResponseEntity.created(url).build();

        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(
            @PathVariable(value = "id", required = true)Long userId) {

        userService.delete(userId);

        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

}
