package com.yzl.springcloudclient.listen.springboot;

import org.springframework.boot.context.config.ConfigFileApplicationListener;

/**
 * @author admin
 * @date 2020-06-18 11:32
 */
public class SpringBootListenTest {

    public static void main(String[] args) {
        ConfigFileApplicationListener configFileApplicationListener =
                new ConfigFileApplicationListener();
    }

}
