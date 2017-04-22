package cn.medemede.springboot.ch1.aop;

import org.springframework.stereotype.Service;



@Service
public class DemoAnnotationService {
    @cn.medemede.springboot.ch1.aop.Action(name = "注解式的add拦截")
    public void add(){}
}
