package com.GusserGame;

import  java.util.Scanner;
// Here first class which is used to guss the number
 class Gusser {
     int GussNum;
     public int gusingNumber(){
         System.out.println("Gusser ! Please guss the number ");
         Scanner sc = new Scanner(System.in);
         GussNum = sc.nextInt();
         return GussNum;
     }
 }
// Here second class which is a Player class who play the game
class Player {
     int pGussNum ;
     public int pGusingNumber(){
         System.out.println("player ! Kindly guss the any number ");
         Scanner sc = new Scanner(System.in);
         pGussNum = sc.nextInt();
         return pGussNum;
     }
}
// Here Third class is used . This is my umpire class . all activity done here
class Umpire {
     int numFromGusser;
     int numFromP1;
     int numFromP2;
     int numFromP3;

     void collectNumFromGusser(){
         Gusser g = new Gusser();
         numFromGusser = g.gusingNumber();
     }
     void collectNumFromPlayer(){
         Player p1 = new Player();
         Player p2 = new Player();
         Player p3 = new Player();

             numFromP1 = p1.pGusingNumber();
             numFromP2 = p2.pGusingNumber();
             numFromP3 = p3.pGusingNumber();
     }
    void Compare(){
         if (numFromGusser == numFromP1){
             if(numFromGusser==numFromP2 && numFromGusser==numFromP3)
             {
                 System.out.println("Game tied all three players guessed correctly");
             }
             else if(numFromGusser==numFromP2)
             {
                 System.out.println("Player 1 and Player2 won the game");
             }
             else if(numFromGusser==numFromP3)
             {
                 System.out.println("Player 1 and Player3 won ");
             }
             else
             {

                 System.out.println("Player 1 won the game");
             }

         } else if (numFromGusser == numFromP2) {
             if(numFromGusser==numFromP3)
             {
                 System.out.println("Player 2 and Player3 won the game");
             }
             else
             {
                 System.out.println("Player 2 won the game");
             }
             System.out.println(" Player 2 Won the Match");
         } else if (numFromGusser == numFromP3) {
             System.out.println(" Player 3 Won the Match ");
         }else {
             System.out.println(" Nobody !  Won the match ... Please restart the Game ");
         }

    }
}

public class GusserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();

           u.collectNumFromGusser();
           u.collectNumFromPlayer();
           u.Compare();

    }
}
