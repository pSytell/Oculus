package courses.controllers;

import courses.entity.Roles;
import courses.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role/")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping(value = "role",method = RequestMethod.POST)
    public ResponseEntity<?>appendRole(@RequestBody Roles roles){
        roleRepository.save(roles);
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @RequestMapping(value = "getRoles",method = RequestMethod.GET)
    public ResponseEntity<?>getRoles(){
        Roles roles = new Roles(1,"Manager",1);
        return new ResponseEntity<>(roles,HttpStatus.OK);
    }
}
