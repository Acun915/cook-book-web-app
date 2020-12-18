package com.cookbook.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloTestService {

    private int counter = 0;

    public String fetchHelloTestMessage() {
        return "You are " + (++counter) + " person visiting this site";
    }

}
