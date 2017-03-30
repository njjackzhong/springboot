package efo.springboot.starter.Topic;

import efo.springboot.starter.Course.Course;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by JackLee on 2017/3/28.
 * @version  1.0
 */
public interface TopicRepository extends CrudRepository<Topic,String> {

}
