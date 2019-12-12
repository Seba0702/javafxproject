package com.mycompany.foodwaste_project.domain;


public class Characters {
    public int health;
    public int hunger;
    public int damage;
    public int minHealth;
    
    public Characters() {
        health = 10;
        hunger = 10;
        damage = 5;
        minHealth = 0;
    }
    
    public boolean alive() {
        return health > 0;
    }
    
    public boolean dead() {
        if(health <= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getHunger() {
        return hunger;
    }
    
    public void subHealth() {
        health = health - damage;
        
    }

    public void subHunger() {
        hunger = hunger - damage;
    }
    
    public void setHealth(int damage)
    {
        health = health - damage;
    }
    
}
