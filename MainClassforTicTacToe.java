/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclassfortictactoe;
import java.io.*;
import java.util.Scanner;        
/**
 *
 * @author misttar17
 */
public class MainClassforTicTacToe {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        char player='x'; 
        int row ,column; 
        Scanner k = new Scanner (System.in); 
        Game g = new Game ();
        
        g.initizateGame(); 
        System.out.println ("Welcome to a Tic-Tac-Toe Game!\n")      
        
while(truth)
    }
    Player= g.ChangePlayer (Player); 
    System.out.print("\n + player +". choose your location (row, column:");
    row=k.nextInt();  
    column=k.nextInt();
    {
    
while("\n + player 2". chosse your location (row. column:");
    g.displayboard();
    row=k.nextInt();
    column=k.nextInt();
    
while (g.checkIfLegal(row,column))
    {
    System.out.println("This place already has a X or O in it, choose a different spot, (row, column).");
    g.displayBoard();
    row=k.nextInt();
    column=k.nextInt();
    }
g.changeBoard(player,row,column );
g.displayBoard();

if(g.checkIfWinner())
    {
    System.out.println("\nThe winner is "+ player+" !");
    break;

    }
if(g.checkIfTie())
    {
        System.out.println("\nThe game is a tie !");
        break;
    }
}

