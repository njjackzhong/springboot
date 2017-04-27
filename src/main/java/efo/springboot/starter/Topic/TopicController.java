package efo.springboot.starter.Topic;

import efo.springboot.starter.core.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jack on 2017/3/28.
 */
@RestController
public class TopicController {

    @Autowired
    private AppConfig appConfig;


    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics")
    public List<Topic> getAllTopics() {
        //System.out.printf(appConfig.getCom().toString());
        return topicService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }


}
