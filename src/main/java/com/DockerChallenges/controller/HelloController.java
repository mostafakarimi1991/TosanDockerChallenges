package com.DockerChallenges.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.CaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

@RestController
@RequestMapping("/")
@Slf4j
public class HelloController {

    @GetMapping("helloworld")
    public ResponseEntity<String> helloStranger() {
        log.info(OffsetDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString());
        String message = "Hello Stranger";
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    @PostMapping("helloworld")
    public ResponseEntity<String> helloWithName(@RequestParam String name) {
        log.info(OffsetDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString());
        String result = CaseUtils.toCamelCase(name,false,' ');
        String message = "Hello " + result;
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    @GetMapping("author")
    public ResponseEntity<String> authorName() {
        log.info(OffsetDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString());
        String message = "Mostafa Karimi";
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
