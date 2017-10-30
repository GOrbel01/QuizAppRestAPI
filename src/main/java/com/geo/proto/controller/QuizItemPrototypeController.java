package com.geo.proto.controller;

import com.geo.proto.item.QuizItemPrototype;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController //Annotation marks class as controller where each method returns a domain object
public class QuizItemPrototypeController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/quiz/item") //Default Mapping of Controllers as GET/PUT/POST etc
    public QuizItemPrototype quizItemPrototype(@RequestParam(value = "question") String question, @RequestParam(value = "answer") String answer) {
        return new QuizItemPrototype(counter.incrementAndGet(), question, answer);
    }

}
