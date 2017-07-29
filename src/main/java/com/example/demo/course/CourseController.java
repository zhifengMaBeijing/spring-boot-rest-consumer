package com.example.demo.course;

import com.example.demo.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhife on 2017/7/23.
 */


@RestController
@RequestMapping("topics")
public class CourseController {

    @Autowired
    private CourseService s;


    @RequestMapping(value = "{tid}/course", method = RequestMethod.POST)
    public Course create(@RequestBody Course data, @PathVariable String tid) {
        data.setTopic(new Topic(tid, ""));
        return s.add(data);
    }

    @RequestMapping(value = "{tid}/course/{cid}", method = RequestMethod.GET)
    public Course read(@PathVariable String cid) {
        return s.get(cid);
    }

    @RequestMapping(value = "{tid}/course", method = RequestMethod.GET)
    public List<Course> readAll(@PathVariable String tid) {
        return s.getAll(tid);
    }

    @RequestMapping(value = "{tid}/course/{cid}", method = RequestMethod.PUT)
    public void update(@RequestBody Course data, @PathVariable String tid, @PathVariable String cid) {
        data.setTopic(new Topic(tid, ""));
        s.update(cid, data);
    }

    @RequestMapping(value = "{tid}/course/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        s.delete(id);
    }

}
