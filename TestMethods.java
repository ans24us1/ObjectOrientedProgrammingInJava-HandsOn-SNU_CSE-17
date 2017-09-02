/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author anuradha.ravi
 */
public class TestMethods {
    public static void main(String args[]) {
		Student s1 = new Student("Mehta");
		Student s2 = new Student("Mirwani");
		System.out.println("Before Swap:- Student 1:" + s1.lname + "; Student 2:" + s2.lname);
		swap(s1, s2);
		System.out.println("After Swap:- Student 1:" + s1.lname + "; Student:" + s2.lname);
                System.out.println("Before Swap variables:- Student 1:" + s1.lname + "; Student:" + s2.lname);

                swapname(s1,s2);
                System.out.println("After Swap:- Student 1:" + s1.lname + "; Student:" + s2.lname);
	}
	public static void swap(Student student1, Student student2) {
		Student temp = new Student("");
		temp = student1;
		student1 = student2;
		student2 = temp;	
        }
        public static void swapname(Student student1, Student student2)
        {
            String name;
            name=student1.lname;
            student1.lname=student2.lname;
            student2.lname=name;
        }
}
