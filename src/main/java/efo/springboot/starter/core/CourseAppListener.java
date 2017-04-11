package efo.springboot.starter.core;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by JackLee on 2017/3/31.
 */
public class CourseAppListener implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("OnApplicationEvent");
    }
}
