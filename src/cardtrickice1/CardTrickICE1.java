/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Harman Sandhu ,May 30th
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
	  System.out.println("THE HAND WAS >");
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(getRandomNumber(1,13));//use a method to generate random *13
            c1.setSuits(Card.SUITS[getRandomNumber(0, 3)]);//random method suit 
            magicHand[i] = c1;
  		System.out.println(magicHand[i].getValue()+" "+magicHand[i].getSuits());
        }
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1-13: \n");
        int num = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter a suit > (diamonds, clubs, spades, hearts): \n");
        String s = input.nextLine();
        //step 3: match with array 
         for( int i=0;i<magicHand.length;i++)
        {
            if(magicHand[i].getValue()==num && magicHand[i].getSuits().equalsIgnoreCase(s)) {
                System.out.println("your card generated");
                return;
            }
        }
         System.out.println("Card not found!");
    }
    
    public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
}
    
}
