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
public class HubbleTelescope {
    private String str;
    protected String initialise()
    {
        return str + "Hubble Telescope activated";
    }
    HubbleTelescope(String str)
    {
        this.str=str;
    }
}
