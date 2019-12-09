package com.mycompany.foodwaste_project.domain;


public class Item {

    
    private final String name, description;
    private boolean spoiled, buyable;
    private final int price, nutrition;
    private final boolean isFood;
 
    private double hoursToRot = 15;



    public Item() {
        this.name = null;
        this.description = null;
        this.price = 0;
        this.nutrition = 0;
        this.isFood = false;
    }

    
    
    public Item(String name, String description, int price, boolean buyable, boolean isFood, int nutrition)
    {
    
       this.description = description;
       this.name = name;      
       this.price = price;
       this.buyable = buyable;
       this.isFood = isFood;
       this.nutrition = nutrition;
       
    }

    @Override
    public String toString() {
        return name;
    }

    
    public boolean isBuyable()
    {
        return buyable;
    }
    
    public void setBuyable(boolean status)
    {
        buyable = status;
    }
    
    public boolean isFood()
    {
        return isFood;
    }
    

    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public boolean getSpoiledStatus()
    {
        return spoiled;
    }
    
    
    public void setSpoilStatus(boolean status)
    {
        this.spoiled = status;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public double getHoursToRot() 
    {
        return hoursToRot;
    }

    public void setRotHoursMinus(double value) 
    {
        hoursToRot -= value;
    }
    
    public int getNutrition()
    {
        return nutrition;
    }
    
}
