/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz1;
import java.util.*;
/**
 *
 * @author anuradha.ravi
 */
public class JavaQuiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputString = "Long Live and Prosper";
        String[] words = inputString.trim().split("");
        for(String s:words)
        {
            System.out.println(s);
        }
        String s = "The enterprise is the ultimate key ";
        int count = s.length() - s.replace("e", "").length() ;
        System.out.println("Number of occurances of 'e' in "+s+" = "+(s.length() - s.replace("e", "").length()) );

        ArrayList<Google> arGoogle = new ArrayList<Google>();
        System.out.println("How many products to add?");
        Scanner sc=new Scanner(System.in);
        count = sc.nextInt();
        Google g;
        for(int i=0;i<count;i++)
        {
            g=new Google();
            g.addProduct(arGoogle);
        }
        for(Google g1:arGoogle)
        System.out.println("The products are : "+g1.product);
    }
    
}
