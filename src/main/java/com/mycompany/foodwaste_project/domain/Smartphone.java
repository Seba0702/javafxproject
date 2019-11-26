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

import java.util.Scanner;

public class Smartphone {
    
    Scanner phoneinput = new Scanner(System.in);
    
    
    public boolean phoneMode;
    public boolean frontScreen;
    public boolean smsMode;
    public int notifications;
    private String notification = "null";
    
    
    private static String SMS = "1";
    private static String EXIT = "2";
    private static String BACK = "3";
    
    public Smartphone() {
        
    }
    
    public void setNotifications(String notification) 
    {
        this.notification = notification;
        notifications = 1;
    }
    

    public void onPhone() {
        frontScreen = true;
        while(frontScreen == true) {
            System.out.println("\t\nYou are currently on your phone (phone mode) what would you like to do?");
            System.out.println("\t1. Enter SMS"); 
            System.out.println("\t2. Exit"); 
            String maininput = phoneinput.nextLine();
            
            if(maininput.equals(SMS)) {
                frontScreen = false;
                smsMode = true;
                while(smsMode == true) {
                    System.out.println("You are in SMS mode");
                    System.out.println("You have " + notifications + " notifications");
                   
                    
                    if ( notification != "null")
                    {
                      System.out.println("\t\n" + notification);
                    }
                    
                    System.out.println("\t\nWhat would you like to do?");

                    System.out.println("\n\t3. Go back");
                    String smsinput = phoneinput.nextLine();
                    
                    if (smsinput.equals(BACK)) {
                        smsMode = false;
                        frontScreen = true;
                    }
                    
                }
            } else if (maininput.equals(EXIT)) {
                break;
            }
            
        }
    }
}
