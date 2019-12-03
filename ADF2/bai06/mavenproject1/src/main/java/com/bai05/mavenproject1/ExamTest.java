/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.util.Scanner;

public class ExamTest {
    public static void main(String[] args) {
        //Exam exam = new Exam("125a", "Nguyen Van A", "11", "Thi ADF2", 5);
        System.out.println("Enter number of exams :");
        Scanner scanner = new Scanner(System.in);
        Integer numberOfExams = scanner.nextInt();
        for(int i = 0; i < numberOfExams; i++) {
            Exam exam = Exam.input();
            Exam.map.put(exam.getRollNumber()+exam.getExamId(), exam);
        }
        System.out.println("haha");
        Exam.saveToFile("HOANG12.TXT");
    }
}
