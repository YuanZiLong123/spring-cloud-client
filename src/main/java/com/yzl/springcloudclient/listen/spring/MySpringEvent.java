package com.yzl.springcloudclient.listen.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @author admin
 * @date 2020-06-17 17:40
 */
public class MySpringEvent extends ApplicationEvent {

    private final ApplicationContext applicationContext;

    public MySpringEvent(Object source, ApplicationContext applicationContext) {
        super(source);
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
