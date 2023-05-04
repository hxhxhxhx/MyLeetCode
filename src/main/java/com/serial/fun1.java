package com.serial;

import java.io.*;

public class fun1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject();
        readObject();


    }

    public static void writeObject() throws IOException {
        File file = new File("D:seria.txt");
        Student student = new Student("zhangsan",23);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(student);
        out.close();
    }

    public static void readObject() throws IOException, ClassNotFoundException {
        File file = new File("D:seria.txt");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Student o = (Student)in.readObject();
        in.close();
        System.out.println(o.toString());
    }

}
