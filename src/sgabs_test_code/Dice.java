/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgabs_test_code;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * The class Dice implements an application that 
 * simply checks which player is more 
 * likely to win a game of dice
 * in our case just two players : Emma and Gunnar
 * each player has two dice with different sides 
 * The player with a larger sum won
 * 
 * 
 * @java_version=8
 * @author ISMAIL_BOUADDI
 */
public class Dice {
    
    
    
    /*
        This function helps to fill the sides of the
        dice  with numbers in order
        it takes two args both are integers 
        @max desing the largest number of sides ,in our case max=100 sides
        @min desing the smallest number of sides , in our cas min =4 sides
        returns an array of integers as the full dice of each player 
    */
    public static int[] fillTheDice(int max,int min){
        Random rnd=new Random();
        int diceSides=rnd.nextInt(max+1-min)+min;//generate how many side will be in this dice
        int [] diceNumbers=new int[diceSides];
        for(int i=diceNumbers.length-1;i>=0;i--){//fill the sides of dice with appropiate value 
            diceNumbers[i]=diceSides--;
        }
        return diceNumbers;
    }
    public static void main(String[] args) throws InterruptedException {
        
        int max=100,min=4;
        
        /// fill first dice of gunnar
        
        int [] GunnarFirstDice; 
        GunnarFirstDice = fillTheDice( max, min);
        
        
        //fill second dice of gunnar
        
        int [] GunnarSecondDice; 
        GunnarSecondDice = fillTheDice( max, min);
       
        
        //fill first dice of emma
       
        int [] EmmaFirstDice; 
        EmmaFirstDice = fillTheDice( max, min);
        
        
        //fill second dice of emma
        
        int [] EmmaSecondDice; 
        EmmaSecondDice = fillTheDice( max, min);
       
        
        //print Gunnar's two dices description
        System.out.println("Gunnar list");
        System.out.println(GunnarFirstDice[0]+" "+GunnarFirstDice[GunnarFirstDice.length-1]+" "+GunnarSecondDice[0]+" "+GunnarSecondDice[GunnarSecondDice.length-1]);
        
        //print Emma's two dices description
        System.out.println("Gunnar list");
        System.out.println(EmmaFirstDice[0]+" "+EmmaFirstDice[EmmaFirstDice.length-1]+" "+EmmaSecondDice[0]+" "+EmmaSecondDice[EmmaSecondDice.length-1]);
   
        
        int sumOfGunnarsDice=0,sumOfEmmasDice=0;
        ///sum the values of Gunnar's description
        sumOfGunnarsDice=GunnarFirstDice[0]+GunnarFirstDice[GunnarFirstDice.length-1]+GunnarSecondDice[0]+GunnarSecondDice[GunnarSecondDice.length-1];
        ///sum the values of Emma's description
        sumOfEmmasDice  =EmmaFirstDice[0]+EmmaFirstDice[EmmaFirstDice.length-1]+EmmaSecondDice[0]+EmmaSecondDice[EmmaSecondDice.length-1];
        
        if(sumOfEmmasDice>sumOfGunnarsDice){
            System.out.println("The winner is : Emma");
        }else if(sumOfEmmasDice<sumOfGunnarsDice){
            System.out.println("The winner is : Gunnar");
        }else{
            System.out.println("Tie");
        }
        
    }
}
