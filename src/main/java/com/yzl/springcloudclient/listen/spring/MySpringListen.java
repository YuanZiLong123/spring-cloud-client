package com.yzl.springcloudclient.listen.spring;

import org.springframework.context.ApplicationListener;

/**
 * @author admin
 * @date 2020-06-17 17:43
 */
public class MySpringListen implements ApplicationListener<MySpringEvent> {
    @Override
    public void onApplicationEvent(MySpringEvent mySpringEvent) {
        System.out.println("接收到事件：" + mySpringEvent.getSource() +" @ "+mySpringEvent.getApplicationContext());
    }
}
