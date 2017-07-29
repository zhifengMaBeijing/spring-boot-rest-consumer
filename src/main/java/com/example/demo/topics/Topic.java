package com.example.demo.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zhife on 2017/7/23.
 */
@Entity
public class Topic {

    @Id
    private String id;
    private String name;

    public Topic() {

    }

    public Topic(String id, String name) {
        this.id = id;
        this.name = name;
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
}
