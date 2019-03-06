package courses.controllers;

import courses.entity.Course;
import courses.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/course/")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping(value = "course",method = RequestMethod.POST)
        public ResponseEntity<?> appendCourse(@RequestBody Course course){
        courseRepository.save(course);
            return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @RequestMapping(value = "getCourses",method = RequestMethod.GET)
    public ResponseEntity<?> getCourses(){
        Course course = new Course(1,"java",10000,1,"1 year");
        return new ResponseEntity<>(course,HttpStatus.OK);
    }
}
