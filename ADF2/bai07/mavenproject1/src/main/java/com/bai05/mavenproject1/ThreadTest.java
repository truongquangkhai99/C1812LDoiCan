/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) {
        test();
    }
    public static Integer a,b, sum;
    public static void test() {
        a = b = sum = 0;
        Thread t3 = new Thread(() -> {
            System.out.println("Begin T3");
            sum = a + b;
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("Sum = "+sum);
            System.out.println("End T3");
        });
        Thread t1 = new Thread(() -> {
            System.out.println("Begin T1");
            a = new Random().nextInt(101);
            System.out.println("End T1");
            if (a > 0 && b > 0) {
                t3.start();
//                synchronized (t3) {
//                    
//                }
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Begin T2");
            b = new Random().nextInt(101) + 100;
            System.out.println("End T2");
            if (a > 0 && b > 0) {
                t3.start();
//                synchronized (t3) {
//                    t3.start();
//                }

            }
        });
        
        t1.start();
        t2.start();
        for(int i = 0; i < 1_000_000; i++){
            for(int j = 0; j < 1_000_000; j++){
        }
        }
    }
}
