package courses.controllers;
import courses.entity.People;
import courses.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/people/")
public class PeopleController {
    @Autowired
    private PeopleRepository peopleRepository;

    @RequestMapping(value = "people",method = RequestMethod.POST)
    public ResponseEntity<?> appendPeople(@RequestBody People people ){
        peopleRepository.save(people);
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @RequestMapping(value = "getPeople",method = RequestMethod.GET)
    public ResponseEntity<?> getPeople(){
        People people = new People(1,1,"Argen","0558897654","argen.@mail.ru",1,"student",24);
        return new ResponseEntity<>(people,HttpStatus.OK);
    }
}
