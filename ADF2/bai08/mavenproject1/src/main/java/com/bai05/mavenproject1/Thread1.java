/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.util.Random;

public class Thread1 extends Thread{
    public Thread3 thread3;
    @Override
    public void run() {
        super.run();
        System.out.println("Begin T1");
            thread3.a = new Random().nextInt(101);
            System.out.println("a = "+thread3.a);
            System.out.println("End T1");
    }
    
    
}
