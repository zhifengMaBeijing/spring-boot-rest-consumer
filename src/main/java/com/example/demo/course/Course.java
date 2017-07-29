package com.example.demo.course;

import com.example.demo.topics.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by zhife on 2017/7/23.
 */
@Entity
public class Course {

    @Id
    private String id;
    private String name;

    @ManyToOne
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String tid) {
        super();
        this.id = id;
        this.name = name;
        this.topic = new Topic(tid,"");
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

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
