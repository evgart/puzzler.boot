package com.epam.puzzler.service;

import org.springframework.stereotype.Component;

@Component
public class MyArgumentHelper implements ArgumentHelper {
    @Override
    public void help() {
        System.out.println("Helper helps!");
    }
}
