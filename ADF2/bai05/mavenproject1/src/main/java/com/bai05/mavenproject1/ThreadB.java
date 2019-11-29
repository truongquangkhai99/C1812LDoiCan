/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

/**
 *
 * @author sunli
 */
public class ThreadB extends Thread {
    public ThreadD threadD;
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Begin ThreadB");
        for(int i = 0; i < 4_000_000; i++) {
            System.out.print("");
        }
        System.out.println("End ThreadB");
        threadD.addThread(this);
        if(threadD.checkPreviousTaskFinish() == true) {
            threadD.start();
        }
    }

    @Override
    public synchronized void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
