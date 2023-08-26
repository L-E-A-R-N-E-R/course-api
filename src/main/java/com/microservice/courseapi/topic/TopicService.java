package com.microservice.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = Arrays.asList(
    new Topic("1","Spring","Everything about Spring Framework"),
    new Topic("2","Microservices","Microservice architecture and deploymeny"),
    new Topic("3","Cloud","AWS")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
