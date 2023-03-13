/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.role;
import java.io.Serializable;

/**
 *
 * @author Roubeen Chaudhry
 */
public class user implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private role role;

    
    public user() {
    }
    
    public user(String email, String firstName, String lastName, String password, role role) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public role getRole() {
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(role role) {
        this.role = role;
    }
  }
    