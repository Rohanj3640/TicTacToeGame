package com.BridgeLabz;

public class TicTacToe {
    public static void main(String[] args) {
               //Printing welcome message
        System.out.println("Welcome to Tic Tac Toe Game");
             //calling method to initialise the board
        createBoard();
    }
          //Created a method createBoard and also defined array named "i" of size 1
         //Initializing the index of array starting from 1 to assign the empty space
         //Creating method for empty board
        //0th index is ignored

    private static char[] createBoard() {
        char[] board = new char[10];
        for(int index = 0; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }
}