/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untils;

/**
 *
 * @author thiet
 */
public class ActionThongKe {
    private int numBer;
    private static ActionThongKe ac;
    public ActionThongKe() {
    }
    
    public static ActionThongKe getAC(){
        if(ac == null){
            ac = new ActionThongKe();
        }
        return ac;
    }
    
    public int getNumBer() {
        return numBer;
    }

    public void setNumBer(int numBer) {
        this.numBer = numBer;
    }
    
}
