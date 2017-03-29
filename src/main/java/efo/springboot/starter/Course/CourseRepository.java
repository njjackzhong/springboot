package efo.springboot.starter.Course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by JackLee on 2017/3/28.
 * @version  1.0
 */
public interface CourseRepository extends CrudRepository<Course,String> {
//    List<Course> getCoursesByTopic_Id(String topicId);
    List<Course> findByTopicId(String topicId);
}
