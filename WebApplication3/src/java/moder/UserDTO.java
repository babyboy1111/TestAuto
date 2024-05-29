/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moder;

/**
 *
 * @author ADMIN
 */
public class UserDTO {
    private String id , fullname,pass;
    private int role;

    public UserDTO(String id, String fullname, String pass, int role) {
        this.id = id;
        this.fullname = fullname;
        this.pass = pass;
        this.role = role;
    }

    public UserDTO() {
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
