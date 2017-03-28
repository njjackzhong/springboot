package efo.springboot.starter.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jack on 2017/3/28.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRespository topicRespository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    ));

    public List<Topic> getAllTopics() {
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRespository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.parallelStream().filter(t -> t.getId().equals(id)).findFirst().orElse(new Topic());
    }

    public void addTopic(Topic topic) {
//        topics.add(topic);
        topicRespository.save(topic);
    }

    public void updateTopic(Topic topic) {
        topics.parallelStream().filter(t -> t.getId().equals(topic.getId())).forEach(t -> {
            t.setDescription(topic.getDescription());
            t.setName(topic.getName());
        });
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
