package com.example.FirstApp;

import org.springframework.stereotype.Component;

@Component
public class Dekstop implements Computer {

    public void compile() {
        System.out.println("Compiling without bugs from desktop");
    }
}
