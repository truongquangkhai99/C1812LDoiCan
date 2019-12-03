/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.ObjectOutputStream;

public class Exam implements Serializable, Cloneable{
    private String rollNumber;
    private String fullName;
    private String examId;
    private String examName;
    private float mark;
    String x;
    public static Hashtable<String, Exam> map = new Hashtable();
    public Exam() {
        
    }
    private byte[] convertObjectToBytes() {
        byte[] bytes = {};
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            bytes = bos.toByteArray();
        } catch(IOException e) {
            return bytes;
        }
        return bytes;        
    }
    public static void saveToFile(String fileName) {
        Exam.map.forEach((key, exam) -> {
            try {
                FileOutputStream outputStream = new FileOutputStream(fileName);
                outputStream.write(exam.convertObjectToBytes());

                outputStream.close();
                System.out.println("Save to file successfully");
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
            } catch (IOException e) {
                System.err.println("CAnnot read file");
            }
        });

    }
    public static Exam input() {
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter rollNumber: ");
            String rollNumber = scanner.nextLine();

            scanner = new Scanner(System.in);
            System.out.println("Enter fullName: ");
            String fullName = scanner.nextLine();

            scanner = new Scanner(System.in);
            System.out.println("Enter examId: ");
            String examId = scanner.nextLine();

            scanner = new Scanner(System.in);
            System.out.println("Enter examName: ");
            String examName = scanner.nextLine();

            scanner = new Scanner(System.in);
            System.out.println("Enter mark: ");
            Float mark = scanner.nextFloat();
            return new Exam(rollNumber, fullName, examId, examName, mark);
        } catch(Exception e) {
            return null;
        }
        
        
        
    }
    public Exam(String rollNumber, String fullName, String examId, String examName, float mark) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.examId = examId;
        this.examName = examName;
        this.mark = mark;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {        
        return "roll's number : "+this.rollNumber +"\n"+
                "fullName : "+this.fullName +"\n"+
                "exam's Id : "+this.examId +"\n"+
                "exam's name :" + this.examName +"\n"+
                "mark : "+this.mark;
    }

    
}
