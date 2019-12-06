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
public class Thread3 extends Thread{
    public Integer a = 0;
    public Integer b = 0;
    @Override
    public void run() {
        super.run(); 
        System.out.println("Begin T3");
        Integer sum = a + b;
        System.out.println("sum = "+sum);
        System.out.println("Begin T3");
        
        
    }
    
}
