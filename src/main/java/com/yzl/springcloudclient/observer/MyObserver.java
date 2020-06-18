package com.yzl.springcloudclient.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author admin
 * @date 2020-06-17 17:01
 */
public class MyObserver extends Observable {

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
