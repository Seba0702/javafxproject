/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.foodwaste_project.domain;

/**
 *
 * @author mathi
 */
public class monetarySystem {
    public double balance;
    
    public monetarySystem() {
        balance = 8000;
    }
    
    public void Buy (double price) { 
        balance = balance-price;
    }
        
    public double getBalance() {
        return balance;
    }
    
}
