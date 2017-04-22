package cn.medemede.springboot.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        UseFuncytionService useFuncytionService=context.getBean(UseFuncytionService.class);
        System.out.println(useFuncytionService.sayHello("di"));
        context.close();
    }
}
