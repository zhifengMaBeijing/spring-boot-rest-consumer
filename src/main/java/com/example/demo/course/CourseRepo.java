package com.example.demo.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zhife on 2017/7/23.
 */
public interface CourseRepo extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String tid);
}
