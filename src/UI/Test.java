/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author thiet
 */
public class Test {
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Panel Slide Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        frame.add(panel);

        // Bắt đầu luồng con để di chuyển panel
        Timer timer = new Timer(10, new ActionListener() {
            int x = 400; // Vị trí ban đầu của panel

            @Override
            public void actionPerformed(ActionEvent e) {
                x--; // Di chuyển panel sang trái (giảm giá trị x)
                panel.setLocation(x, 0);
                if (x < -200) { // Khi panel ra khỏi khung, dừng luồng
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        frame.setVisible(true);
        timer.start(); // Bắt đầu di chuyển panel
    }
}
