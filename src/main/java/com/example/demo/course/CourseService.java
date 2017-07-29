package com.example.demo.course;

import com.example.demo.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhife on 2017/7/23.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;


    public Course get(String id) {
        return courseRepo.findOne(id);
    }

    public Course add(Course data) {
        return courseRepo.save(data);
    }

    public void update(String id, Course data) {
        courseRepo.save(data);
    }


    public void delete(String id) {
        courseRepo.delete(id);
    }


    public List<Course> getAll(String tid) {
        return courseRepo.findByTopicId(tid);
    }
}
