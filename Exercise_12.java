// tictactoe 
import java.util.Scanner; 
public class Exercise_12 { 
  public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in); 
    int x = 0; 
    int row , col , line= 0; 
    String[][] board = { 
      {" ", " ", " "}, 
      {" ", " ", " "}, 
      {" ", " ", " "} 
    }; 
    //ask 9 time if no win yet 
    for(int i = 0 ; i < 9 ; i++){ 
      //accessing board to put 
      if(x == 0){ 
        System.out.println("Player X turn !!"); 
      } 
      else{ 
        System.out.println("Player O turn !!"); 
      } 
      System.out.print("Row : "); 
      row = scan.nextInt(); 
      System.out.print("Col : "); 
      col = scan.nextInt(); 
      if(x == 0){ 
        board[row][col] = "X"; 
      } 
      else{ 
        board[row][col] = "O"; 
      } 
      for(int v = 0 ; v < board.length ; v++){ 
        for(int z = 0 ; z < board.length ; z++){ 
          System.out.print("|" + board[v][z] + "|"); 
          line++; 
        } 
        if(line == 3){ 
          System.out.println(); 
          System.out.println("---------"); 
          line = 0; 
        } 
      } 
      if(board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X"  
        || board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X" 
        || board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X" 
        //diagonally 
        || board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X" 
        || board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X" 
        //row 
        || board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X" 
        || board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X" 
        || board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X"){ 
        System.out.print("Player X win !!"); 
        break; 
      } 
      else if(board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O"  
        || board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O" 
        || board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O" 
        //diagonally 
        || board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O" 
        || board[2][0] == "O" && board[1][1] == "O" && board[0][2] == "O" 
        //row 
        || board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O" 
        || board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O" 
        || board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O"){ 
        System.out.print("Player O win !!"); 
        break; 
      } 
      if(x == 0){ 
        x = 1; 
      } 
      else{ 
        x = 0; 
      } 
    } 
    scan.close(); 
  } 
}