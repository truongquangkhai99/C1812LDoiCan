/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ThreadA extends Thread {
    public ThreadD threadD;
    @Override
    public void run() {
        try {
            super.run(); //To change body of generated methods, choose Tools | Templates
            System.out.println("Begin ThreadA");
            for(int i = 0; i < 2_000_000; i++) {
                System.out.print("");
            }
            System.out.println("End ThreadA");
            threadD.addThread(this);
            if(threadD.checkPreviousTaskFinish() == true) {
                threadD.start();
            }
        } catch(Exception e ) {
            System.out.println("Error: "+e.toString());
        }
        
    }

    @Override
    public synchronized void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
