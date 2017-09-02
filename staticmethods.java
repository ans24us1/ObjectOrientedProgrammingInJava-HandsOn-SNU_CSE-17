/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author anuradha.ravi
 */
public class staticmethods {

    public static void main(String[] args) {
        Student s;
        ArrayList<Student> studentarray = new ArrayList<Student>();
        for (int i = 0; i < 5; i++) {
            s = new Student();
            //Student.trystatic();
            s.trystatic1();
            studentarray.add(s);
        }
        for (Student s1 : studentarray) {
            System.out.println("sttry value : " + Student.sttry);
            System.out.println("sttry1 value : " + s1.sttry1);
        }
    }

}
