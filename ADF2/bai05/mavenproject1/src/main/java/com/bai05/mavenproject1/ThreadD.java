/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.util.ArrayList;

public class ThreadD extends Thread {
    private ArrayList<Thread> previousThreads = new ArrayList<Thread>();
    public void addThread(Thread thread) {        
        this.previousThreads.add(thread);
    }
    public Boolean checkPreviousTaskFinish() {
        return previousThreads.size() == 3;
    }
    
    @Override
    public void run() {
        super.run(); 
        System.out.println("Begin ThreadD");
        for(int i = 0; i < 3_000_000; i++) {
            System.out.print("");
        }
        System.out.println("End ThreadD");
        
    }

    @Override
    public synchronized void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
