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

public class Conversation {
    
    //Fields
    private Scanner reader;
    int progress;
    
    //Constructor
    public Conversation() {
        reader = new Scanner(System.in);
        progress = 0;
    }
    
    //Asks player a question and to give an input value
    public String askQuestionInput (String question) {
        System.out.println(question);
        System.out.println("> ");
        String questionAnswer = reader.nextLine().trim();
        return questionAnswer;
    }
    
    //Asks player to input a value
    public String askInput() {
        System.out.println("> ");
        String questionAnswer = reader.nextLine().trim();
        return questionAnswer;
    }
    

}
