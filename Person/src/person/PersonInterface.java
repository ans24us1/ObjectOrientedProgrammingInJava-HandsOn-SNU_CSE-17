/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author anuradha.ravi
 */
public interface PersonInterface {
    
    static int EYES = 2;
    static int EARS = 2;
    static int NOSE = 1;
    static int HANDS = 2;
    static int LEGS = 2;
    
    default void walk()
    {
        System.out.println(" Walk");
    }
    default void talk()
    {
        System.out.println(" Talk");
    }
    default void eat()
    {
        System.out.println(" Eat");
    }
    default void drink()
    {
        System.out.println(" Drink");
    }
}
