package efo.springboot.starter.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jack on 2017/3/28.
 *
 * @version 1.0
 */
@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns a string representation of the object.
     */
    @Override
    public String toString() {
        return String.format("{\"id\":%s,\"name\":%s,\"description\":%s}",id,name,description);
    }
}
