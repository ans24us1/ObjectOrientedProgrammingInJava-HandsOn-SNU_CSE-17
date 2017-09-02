/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson14.sep;

/**
 *
 * @author anuradha.ravi
 */
public class HandsOn14Sep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UGStudent ugst = new UGStudent(1,4.5f,"anu@sd.com",94883478);
        ugst.addStudent(); //123
        PGStudent pgst = new PGStudent(7.2f);
        pgst.addStudent(); //23
        Student std;
        int i=0;
        float cgpa;
        cgpa=2.3f;
        std= new Student();
        while(i<2)
        {
            std= new Student();
            std.setcgpa(cgpa);
            std.addStudent(); //50
               cgpa=4.2f;      
               i++;
               
        }
        i=0;
        Student.arrstu.get(i).setcgpa(3.4f);
        /*for(Student s:Student.arrstu)
        {
            s.arrstu.get(i).setcgpa(3.4f);
            System.out.println();
            i++;
        }*/
        for(int j=0;j<4;j++)
        {
            ugst.addStudent();
            pgst.addStudent();
            std.addStudent();
        }
    }
    
}
