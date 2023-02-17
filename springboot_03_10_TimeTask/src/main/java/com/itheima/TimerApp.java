package com.itheima;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                test();
            }
        },10000,1000);

    }
    static void test(){
        System.out.println("test");
    }
}
