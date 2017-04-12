package efo.springboot.starter.task;

import efo.springboot.starter.Topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @since 2017/04/11
 * Auto start a timed task
 * Created by JackLee on 2017/4/11.
 */
@Component
public class MsgProducer {

    private final TopicService topicService;

    @Autowired
    public MsgProducer(TopicService topicService) {
        this.topicService = topicService;
    }

    @Scheduled(fixedRate = 500)
    public void produce() {
        try {
            List topicList = topicService.getAllTopics();
            if (topicList != null) {
                //System.out.println("get all topics, num:" + topicList.size());
            } else {
                //System.out.println("get all topics,num: 0 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
