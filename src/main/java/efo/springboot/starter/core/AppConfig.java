package efo.springboot.starter.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 *          Created by JackLee on 2017/3/30.
 */

@Component
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public class AppConfig {
    private  Com com = new Com();

    public Com getCom() {
        return com;
    }

    public void setCom(Com com) {
        this.com = com;
    }


    public static class Com {
        public Com() {
        }

        private String name;
        private String rate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        @Override
        public String toString() {
            return "Com{" +
                    "name='" + name + '\'' +
                    ", rate='" + rate + '\'' +
                    '}';
        }
    }
}
