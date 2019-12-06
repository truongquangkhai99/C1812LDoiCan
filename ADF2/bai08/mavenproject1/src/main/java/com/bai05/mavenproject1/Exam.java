/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai05.mavenproject1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.*;

public class Exam implements Serializable, Cloneable{
    private String rollNumber;
    private String fullName;
    private String examId;
    private String examName;
    private float mark;
    String x;
    public static Hashtable<String, Exam> map = new Hashtable();
    public static Hashtable<String, Exam> outputMap = new Hashtable();
    public Exam() {
        
    }
    public static byte[] convertObjectToBytes() {
        byte[] bytes = {};
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(Exam.map);
            oos.flush();
            bytes = bos.toByteArray();
        } catch(IOException e) {
            return bytes;
        }
        return bytes;        
    }
    public static void saveToFile(String fileName) {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            outputStream.write(Exam.convertObjectToBytes());
            outputStream.close();
            System.out.println("Save to file successfully");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("CAnnot read file");
        }

    }
    public static void readFromFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(fileName));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o1 = objectInputStream.readObject();			
            Exam.outputMap = (Hashtable<String, Exam>) o1;			
            System.out.println("Read file successfully");
        }catch(Exception e) {
            System.out.println("Cannot read file"+fileName);
        }
        
    }
    public static void printMap(Hashtable<String, Exam> map) {
        map.forEach((key, exam) -> {
            System.out.println(key);
            System.out.println(exam.toString());
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
