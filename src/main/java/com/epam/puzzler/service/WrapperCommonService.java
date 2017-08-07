package com.epam.puzzler.service;

import org.springframework.stereotype.Service;

@Service
public class WrapperCommonService implements CommonService {

    private MyCommonService service;

    private ArgumentHelper helper;

    //public WrapperCommonService(MyCommonService service){
    ///    this.service = service;
    //}

    public WrapperCommonService(MyCommonService service, ArgumentHelper helper){
        this.service = service;
        this.helper = helper;
    }

    @Override
    public void printClassLoaders(Class clazz) {
        helper.help();
        System.out.println("WRAAAAAAP");
        service.printClassLoaders(clazz);
    }
}
