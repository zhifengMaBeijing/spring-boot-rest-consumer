package com.example.demo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhife on 2017/7/23.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;


    public Topic get(String id) {
        return topicRepo.findOne(id);
    }

    public Topic add(Topic data) {
        return topicRepo.save(data);
    }

    public void update(String id, Topic data) {
        topicRepo.save(data);
    }


    public void delete(String id) {
        topicRepo.delete(id);
    }
}
