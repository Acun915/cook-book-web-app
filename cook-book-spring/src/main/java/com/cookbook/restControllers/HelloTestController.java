package com.cookbook.restControllers;

import com.cookbook.services.HelloTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloTestController {

    private final HelloTestService helloTestService;

    @GetMapping(path = "/rest/helloTest")
    public String hello() {
        return helloTestService.fetchHelloTestMessage();
    }
}
