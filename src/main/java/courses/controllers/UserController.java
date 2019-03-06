package courses.controllers;

import courses.entity.User;
import courses.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/")
public class UserController {
    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "user",method = RequestMethod.POST)
    public ResponseEntity<?>appendUser(@RequestBody User user){
        repository.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public ResponseEntity<?> getAllUser(){
        User user = new User(1,"Argen","9999","Argen",1,2);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
