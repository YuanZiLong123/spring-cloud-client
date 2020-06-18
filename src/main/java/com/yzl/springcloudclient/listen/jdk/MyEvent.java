package com.yzl.springcloudclient.listen.jdk;

import java.util.EventObject;

/**
 * @author admin
 * @date 2020-06-17 17:26
 */
public class MyEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEvent(Object source) {
        super(source);
    }


}
