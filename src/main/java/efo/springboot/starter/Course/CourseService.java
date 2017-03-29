package efo.springboot.starter.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/3/28.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


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
}
