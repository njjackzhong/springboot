package efo.springboot.starter.Topic;

import efo.springboot.starter.Course.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by JackLee on 2017/3/28.
 * @version  1.0
 */
public interface TopicRepository extends CrudRepository<Topic,String> {
    List<Topic>  findTopicByNameIsLike(String name);
}
