/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author thiet
 */
public class XImage {
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("/Icon/fpt.png");
        return new ImageIcon(url).getImage();  
    }
    
    public static  boolean  getSave(File src){
        File dst = new File("src\\Icon", src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();//tao thu muc neu chua co
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            
        }
    }
//    
    public static  ImageIcon read(String fileName){
        File path = new  File("src\\Icon",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
