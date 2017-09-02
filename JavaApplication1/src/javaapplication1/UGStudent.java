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
public class UGStudent extends Student {
    
    String clubs;
    String lasc;
    UGStudent(String clubs, String lasc, int sno, long phno, float cgpa, String name){
        super("Anuradha");
        //Student("Anuradha");
        //super(sno, phno, cgpa);
        this.clubs=clubs;
        this.lasc=lasc;
        super.phno=phno;
        super.cgpa=cgpa;
        PrintStudent();
        System.out.println(printjinherit());
    }

}
