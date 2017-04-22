package cn.medemede.springboot.ch1.di.javaconfig;

import org.springframework.stereotype.Service;


@Service
public class UseFunctionService {
    private FunctionService functionService;

    void setFunctionService(FunctionService functionService){
        this.functionService=functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
