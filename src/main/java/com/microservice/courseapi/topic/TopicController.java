package com.microservice.courseapi.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class TopicController {
    
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
            new Topic("1","Spring","Everything about Spring Framework"),
            new Topic("2","Microservices","Microservice architecture and deploymeny"),
            new Topic("3","Cloud","AWS")
        );
    }
}
