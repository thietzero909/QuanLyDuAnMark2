/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untils;

public class UserLogin {

    private static UserLogin userLogin;
    private  String nameLogin ;
    private String pass;
    
    public static UserLogin getUserLogin() {
        if (userLogin == null) {
            userLogin = new UserLogin();
        }
        return userLogin;
    }

    public UserLogin() {
    }

    public String getNameLogin() {
        return nameLogin;
    }

    public void setNameLogin(String nameLogin) {
        this.nameLogin = nameLogin;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    

    

    
    
    

    
    
    
}
