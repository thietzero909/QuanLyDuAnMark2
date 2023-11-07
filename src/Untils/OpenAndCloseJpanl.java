/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untils;

import UI.Home;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author thiet
 */
public class OpenAndCloseJpanl {
    int widthMenu = 160;
    int heightMenu = 660;
    
    int widthForm = 925;
    int heightform = 660;
    
    public void openMenu(JPanel p){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < widthMenu; i++){
                    p.setSize(i,heightMenu);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    public void CloseMenu(JPanel p){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = widthMenu; i > 0; i--){
                    p.setSize(i,heightMenu);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
     public void openForm(JPanel main){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < widthForm; i++){
                    
                    main.setSize(i,heightform);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    public void CloseForm(JPanel main){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = widthForm; i > 0; i--){
                    main.setSize(i,heightform);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    
}
