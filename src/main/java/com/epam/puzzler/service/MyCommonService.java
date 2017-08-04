package com.epam.puzzler.service;

import org.springframework.stereotype.Service;

@Service
public class MyCommonService implements CommonService {

    @Override
    public void printClassLoaders(Class clazz) {
        ClassLoader loader = clazz.getClassLoader();
        while (loader != null) {
            System.out.println(loader);
            loader = loader.getClass().getClassLoader();
        }
        System.out.println("BootStrap ClassLoader");
    }
}
