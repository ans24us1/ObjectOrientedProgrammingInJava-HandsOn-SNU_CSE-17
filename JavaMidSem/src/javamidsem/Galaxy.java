/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidsem;

/**
 *
 * @author anuradha.ravi
 */
abstract public class Galaxy {
    
    public void initialise()
    {
        Shapes();
        Gases();
        Dust();
        Stars();    
    }
    abstract void Gases();
    abstract void Shapes();
    abstract void Dust();
    abstract void Stars();

}

class MilkyWay extends Galaxy{
    
}

class Andromeda extends Galaxy{
    
}