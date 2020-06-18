package com.yzl.springcloudclient.listen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author admin
 * @date 2020-06-17 17:45
 */
public class SpringListenTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();

        context.addApplicationListener(new MySpringListen());

        context.refresh();

        context.publishEvent(new MySpringEvent("1111",context ));
    }
}
