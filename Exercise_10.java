import java.util.*;   // Import for Call Class Scanner 
public class Exercise_10 { 
    public static void main(String[] args){ 
        Scanner Input = new Scanner(System.in);  // Create Obj for Class Scanner 
        int student = 1;  // for Count Student  
        int[][][] Score = new int[2][4][3];  // Create Empty Arrays 2 arrays Row 4 Col 3 
        String[] Subject = {"Math" , "Physics" , "Chemistry"};  // Create Arrays for Store Subject 
        int[] TotalScore = new int[2];   // Create Empty Arrays for store Total Score 
        for (int i = 0 ; i < Score.length ; i ++){ 
            for (int j = 0 ; j < Score[0].length ; j++){ 
                for (int x = 0 ; x < Score[0][0].length ; x++){ 
                    System.out.print("Input Score Group " + (i+1) + "  Student "+(student) +" " + Subject[x] + " : "); 
                    Score[i][j][x] = Input.nextInt(); 
                } 
                student++; 
            } 
        } 
         
        for (int i = 0 ; i < Score.length ; i++){ 
            for (int j = 0 ; j < Score[0].length ; j++){ 
                TotalScore[i] += (Score[i][j][0]+Score[i][j][1] + Score[i][j][2]); 
            } 
        } 
 
        student = 1; 
        for (int i = 0 ; i < Score.length ; i ++){ 
            System.out.println("Group " + (i+1) + " :"); 
            System.out.println("==========================================================="); 
            System.out.println("Name         Math     Physics      Chemistry          Total"); 
            System.out.println("==========================================================="); 
            for (int j = 0 ; j < Score[0].length ; j++){ 
               System.out.println("Student " + (student) + "    " + Score[i][j][0] + "            " + Score[i][j][1] + "           " + Score[i][j][2] +"              " + (Score[i][j][0]+Score[i][j][1] + Score[i][j][2])); 
                for (int x = 0 ; x < Score[0][0].length ; x++){ 
                } 
                student++; 
            } 
            System.out.println("==========================================================="); 
            System.out.println("                                      Total Score : " + TotalScore[i]); 
        } 
        Input.close(); 
    } 
}