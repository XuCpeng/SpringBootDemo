package cn.medemede.springboot.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFuncytionService {
    @Autowired
    private
    FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
