package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle r1 = new Rectangle(new Point(0.0, 0.0),
                new Point(2.2, 0.0),
        new Point(2.2, 3.3),
        new Point(0.0, 3.3));
        //Kiem tra lai cac Point sao cho r1, r2 la 2 hinh chu nhat
        Rectangle r2 = new Rectangle(new Point(5.0, 0.0),
                new Point(7.2, 0.0),
                new Point(2.2, 3.3),
                new Point(0.0, 3.3));
        System.out.println("Collision: "+ r1.checkCollision(r2));
    }
}
