/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.util.Random;

public class Thread2 extends Thread{
    public Thread3 thread3;
    @Override
    public void run() {
        super.run();
        System.out.println("Begin T2");
        thread3.b = new Random().nextInt(101) + 100;
        System.out.println("b = "+thread3.b);
        System.out.println("End T2");
    }       
}
