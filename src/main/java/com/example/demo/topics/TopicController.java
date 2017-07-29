package com.example.demo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhife on 2017/7/23.
 */


@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService s;

    @RequestMapping(method = RequestMethod.POST)
    public Topic create(@RequestBody Topic data) {
        return s.add(data);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Topic read(@PathVariable String id) {
        return s.get(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Topic data, @PathVariable String id) {
        s.update(id, data);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        s.delete(id);
    }

}
