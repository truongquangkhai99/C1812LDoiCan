/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        test();
    }   
    public static void test() throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.thread3 = t3;
        t2.thread3 = t3;
        
        
        t1.start();       
        t2.start();        
        t1.join();
        t2.join();
        t3.start();
    }
}
