/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;

/**
 *
 * @author Roubeen Chaudhry
 */
public class role implements Serializable {
    private int roleID;
    private String name;

    public role() {
    }

    public role(int roleID, String name) {
        this.roleID = roleID;
        this.name = name;
    }

    public int getRoleID() {
        return roleID;
    }

    public String getName() {
        return name;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
}
