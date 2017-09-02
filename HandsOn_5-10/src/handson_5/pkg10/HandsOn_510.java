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
public class HandsOn_510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal a = new animal();
        a.walk();
        System.out.println("Variable in a : "+a.var);
        animal a1 = new dog();
        System.out.println("Variable in dog using animal : "+a1.var);
        a1.walk();
        mammal m = new cat();
        m.walk();
        dog d1=null;
        try{
        d1 = (dog)new mammal();
        }
        catch(ClassCastException c){
            System.out.println(c.toString());
            try{
            d1=(dog)m;
            }
            catch(ClassCastException c1){
                System.out.println(c1.toString());
                mammal m1 = new dog();
                //m1.bark();
                d1 = (dog)m1;
            }
        }
        d1.walk();
        d1.bark();
        dog d = (dog)a1;
        d.bark();
        d.walk();
        animal ac = new cat();
        cat c = (cat) ac;
        c.walk();
        c.meow();
    }
    
}
