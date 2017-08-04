package com.epam.puzzler.service;

import org.springframework.stereotype.Service;

@Service
public class WrapperCommonService implements CommonService {

    private MyCommonService service;

    public WrapperCommonService(MyCommonService service){
        this.service = service;
    }


    @Override
    public void printClassLoaders(Class clazz) {
        System.out.println("WRAAAAAAP");
        service.printClassLoaders(clazz);
    }
}
