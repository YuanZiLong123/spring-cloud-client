package com.yzl.springcloudclient.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author admin
 * @date 2020-06-17 17:02
 */
public class ObserverTest {

    public static void main(String[] args) {
        MyObserver myObserver =  new MyObserver();

        myObserver.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o);
                System.out.println(arg);
            }
        });


        myObserver.setChanged();
        myObserver.notifyObservers("add");
    }

}
