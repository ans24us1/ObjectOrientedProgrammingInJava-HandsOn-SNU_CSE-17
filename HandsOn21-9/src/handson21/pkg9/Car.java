/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson21.pkg9;

/**
 *
 * @author anuradha.ravi
 */
public abstract class Car extends Vehicle{
    static int wheels=4;
    private long RegNo;
    private Stereo s = new Stereo();
    Car(int vid,String vname,long RegNo)
    {
        this.vid=vid;
        this.vname=vname;
        this.RegNo=RegNo;
        s.play();
     }
    Car()
    {
        
    }
    void Print()
    {
        System.out.println(vid+vname);
    }
    void increasevol1()
    {
        s.increasevol();
    }
}
