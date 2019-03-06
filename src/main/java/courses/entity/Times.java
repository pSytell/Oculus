package courses.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.text.ParseException;
@Entity
public class Times {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int timeId;
    private String courseTime;
    public Times(int timeId, String courseTime){

            this.timeId = timeId;
            this.courseTime = courseTime;
    }
    public Times(){

    }
    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }
}

