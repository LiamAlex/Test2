/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17comp1030test2section3;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17COMP1030Test2Section3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**
          * This is test #2 for the Programming Fundamentals course (COMP1030).
          * 
          * For this test, insert the code under each comment.  If code is not
          * directly under the comment, it will not be marked.  For this test,
          * you are allowed to use anything that you bring into the test, but you 
          * are not allowed any communication with others or online research.
          */
         
         /**
          * Question 1 - Print your name to the screen followed by the phrase 
          * "-I'm going to do great on this test"
          * 1 Mark
          */
         System.out.println("Liam Daley -I'm going to do great on this test");
         
         
         /**
          * Question 2 - using the flow chart provided in class, build the program
          * here.  For the method, define it below (after the main method)                     
          * 4 Marks
          */
         Scanner keyboard =new Scanner (System.in);
         System.out.println("Enter meal cost:");
         double meal=keyboard.nextDouble();
         double tax=0.13*meal;
         double total=tax + meal + getTip(meal);
         System.out.printf("total=", total);
         
         
         
         
         
         /**
          * Question 3 - Prompt the user to enter a whole number.  Based on 
          * the number entered by the user, create the pattern below.
          *
            Enter the number of rows: 5
            *****
            ****
            ***
            **
            *
          * 3 Marks
          */
         int rows=keyboard.nextInt();
         for( int col=1;col<= rows; col++){
             for (int i=1; i<= col; i++){
             System.out.print("*");
             }
             System.out.printf("/n");
         }
         
         
         /**
          * Question 4 - Continously ask the user to enter a number.  When
          * they enter a number that is evenly divisible by 7, end the loop and 
          * print "aced it" to the screen. 
          * 3 Marks 
          */
         int x=10;
        while (x%7 !=0){
            System.out.println("Enter a  number:");
            x=keyboard.nextInt();
        }
        System.out.println("aced it");
    }
    
    /**
     * Question 2 - Put the method header here
     */
    public static double getTip(double Meal){
        Scanner keyboard =new Scanner (System.in);
        System.out.println("Enter tip percentage:");
        double tipPercent=keyboard.nextDouble();
        return tipPercent*Meal;
    }
    
}

