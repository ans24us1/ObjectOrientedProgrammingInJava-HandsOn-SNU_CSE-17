/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidsem;
import java.util.ArrayList;
/**
 *
 * @author anuradha.ravi
 */
public class Wireless {
        transceiver t;
    static ArrayList<transceiver> tr = new ArrayList<transceiver>();
        static int count;
        Wireless()
        {
            t=new transceiver();
        }
    
}
class transceiver{
        transceiver()
        {
            Wireless.count++;
        }
        ArrayList<transceiver> antenna(Wireless w)
        {
            Wireless.tr.add(w.t);
            return Wireless.tr;
        }
    }