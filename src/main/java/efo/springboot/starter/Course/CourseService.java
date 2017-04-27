package efo.springboot.starter.Course;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.rabbitmq.tools.json.JSONReader;
import com.rabbitmq.tools.json.JSONUtil;
import com.rabbitmq.tools.json.JSONWriter;
import efo.springboot.starter.core.AppConfig;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/3/28.
 */
@Service
public class CourseService {

    private final AppConfig appConfig;

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(AppConfig appConfig, CourseRepository courseRepository) {
        this.appConfig = appConfig;
        this.courseRepository = courseRepository;
    }


    public List<Course> getAllCourses(String topicId) {
//        List<Course> courses = new ArrayList<>();
//        courseRepository.findByTopicId(topicId).forEach(courses::add);
//        return courses;
        return courseRepository.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }

    @PostConstruct
    public void display(){

        System.out.println(String.format("ip:%s,enabled:%s,user:%s,name:%s",appConfig.getRemoteAddress(),appConfig.isEnabled(),appConfig.getSecurity().getUsername(),appConfig.getSecurity().getPassword()));
    }
}
