/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class WordGame {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // creating method to take input 
        Scanner sc= new Scanner(System.in);
        // Method to get random letter
        Random r = new Random();
        String user_ans = "";  // variable to store user answer to continue game or no
        

// using a do while loop to restart game if user answer is Y/y
       do{
        char letter = (char)(r.nextInt(26) + 'a');
        System.out.println("_______________________________________________________");
        System.out.println ("Your letter is : " + letter);  //print the random letter
        System.out.println ("Enter a word that starts with the letter given: ");
        String user_input= sc.nextLine();                   // store user input for the letter given
        System.out.println ("You have entered: "+user_input);
        int sum = 0; // variable for User scores
       
       
        // For loop- Matching the first letter of user input with random genrated letter

        for(int j = 0; j < user_input.length(); j++){        
                sum++; 
            } 
        // Checking if the letters are in alphabetical order
        boolean sorted = true;
         for(int i = 0; i < user_input.length()-1; i++){
             if(user_input.charAt(i) >= user_input.charAt(i+1)){
                    sorted = false;
     
    }}
    // if-else conditions to base the scores off
        if (sorted && user_input.charAt(0)== letter){    

                  System.out.println("Your total score is: " + sum*3);
        }
        
        else if (!sorted &&user_input.charAt(0)== letter){
        System.out.println("Your total score is: " + sum);       
    }
        else
            System.out.println("The first letter of your word did not match the letter given");  
       
       // Prompting User to play again
       System.out.print("Do you want to play again ([Y] / [N])? ");
            user_ans = sc.nextLine();
            System.out.println(user_ans);}
        while (user_ans.equals("Y") || user_ans.equals("y"));

        //If user choose not to play again, Ending off with Thanks
       System.out.println("Thanks for playing!");
       System.out.println("Made By- Umar Rahim");
    sc.close();
    }
}
    

    


            
                     
  

