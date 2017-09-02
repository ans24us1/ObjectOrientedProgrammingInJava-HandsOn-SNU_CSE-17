/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson_5.pkg10;

/**
 *
 * @author anuradha.ravi
 */
public class PolyEx {}
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuradha.ravi
 */
class animal{
    int var=10;
    void walk(){
        System.out.println("In Animal-walk");
    }
}
class mammal extends animal{
    @Override
    void walk(){
        System.out.println("In mammal-Walk");
    }
}
class dog extends mammal{
    int var=20;
    long rear=30;
    @Override
    void walk(){
        super.walk();
        System.out.println("In Dog-Walk");
    }
    void bark(){
        System.out.println("In Dog - Barks");
    }
}
class cat extends mammal{
    @Override
    void walk(){
        System.out.println("In Cat-Walk");
    }
    void meow(){
        System.out.println("Meow");
    }
    
}


