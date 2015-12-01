package munch_4_guessinggame;

import java.util.Random;
import java.util.Scanner;



public class Munch_4_GuessingGame {

    /**
     * @param args the command line arguments
     */
    static String username;
    static int aguess;
    static int magicnumber;
    static Random random = new Random();
    static int playagain;
    
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Hello, would you like to play a game.");
        System.out.println("What is your name?");
        username = name.nextLine();
        magicnumber = random.nextInt(100);
        playagain = 0;
        System.out.println("Hello " + username + " Please pick a number between 1 and 100");
    while (playagain < 7){
    playthegame();
        
        
        
        }
    System.out.println("Game Over");
    }
    static void playthegame(){
        playagain++;
        
       
        
        Scanner guess = new Scanner(System.in);
        
        aguess = guess.nextInt();
        
        
        
        if (magicnumber == aguess) {
            System.out.println(" You Win!");  
            playagain = 21;
             
        }else if (magicnumber > aguess){
            System.out.println("Too low!");
            System.out.println("Try again"); 
        }else{
            System.out.println("Too High!");
            System.out.println("Try again"); 
        }
        
        
    } 
}   

