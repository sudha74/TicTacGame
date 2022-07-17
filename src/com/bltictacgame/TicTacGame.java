package com.bltictacgame;

import java.util.Scanner;

public class TicTacGame {

  public enum CurrentPlayer {
      PLAYER, COMPUTER
  }

    static char[] board = new char[10];
    static Scanner scr = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;
    static int position;

    static void createBoard(char[] board) {

        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }
