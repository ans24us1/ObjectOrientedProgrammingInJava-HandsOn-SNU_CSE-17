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
public class Google {
    
    static String product;
    Scanner sc=new Scanner(System.in);
    void addProduct(ArrayList<Google> arGoogle)
    {
        Google g=new Google();
        System.out.println("Enter the product name : ");
        product=sc.next();
        arGoogle.add(g);
    }
}
