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
public class ThreadManagement {
    public void testThreads() {
        ThreadD threadD = new ThreadD();
        
        ThreadA threadA = new ThreadA();
        threadA.threadD = threadD;
        ThreadB threadB = new ThreadB();
        threadB.threadD = threadD;
        ThreadC threadC = new ThreadC();
        threadC.threadD = threadD;
        
        
        threadA.start();
        threadB.start();
        threadC.start();
        
    }
}
