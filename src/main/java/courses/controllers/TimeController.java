package courses.controllers;

import courses.entity.Times;
import courses.repositories.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "/time/" )
public class TimeController {
    @Autowired
   private TimeRepository repository;
    
    @RequestMapping(value = "time", method = RequestMethod.POST)
    public ResponseEntity<?> appendTime(@RequestBody Times times){
        repository.save(times);
        return new ResponseEntity<>(times, HttpStatus.OK);
    }
    @RequestMapping(value = "getTime",method = RequestMethod.GET)
    public ResponseEntity<?> getTime(){

            Times times = new Times(1,"18:00");
        return new ResponseEntity<>(times,HttpStatus.OK);
    }
}
