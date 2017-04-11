package efo.springboot.starter.task;

import efo.springboot.starter.Topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @since 2017/04/11
 * Created by JackLee on 2017/4/11.
 */
@Component
public class MsgProducer {

    @Autowired
    private TopicService topicService;

    @Scheduled(fixedRate = 500)
    public void produce() {
        try {
            List topicList = topicService.getAllTopics();
            if (topicList != null)
                System.out.println("get all topics, num:" + topicList.size());
            else
                System.out.println("get all topics,num: 0 ");
        } catch (Exception e) {
            //
        } finally {
            //
        }
    }
}
