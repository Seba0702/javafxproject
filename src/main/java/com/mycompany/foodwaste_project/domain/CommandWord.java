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
public enum CommandWord
{
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), PICKUP("pickup"), BALANCE("balance"),
    DROP("drop"), INVENTORY("inventory"), SLEEP("sleep"), STATS("stats"), BUY("buy"), THROWOUT("throwout"),
    DONATE("donate"), EAT("eat"), DRINK("drink"), USE("use"), PHONE("phone");
    
    private String commandString;
    
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    public String toString()
    {
        return commandString;
    }
}