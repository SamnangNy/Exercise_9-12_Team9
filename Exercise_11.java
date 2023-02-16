/*
Exercise 11
Make a Program
 */ 

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] Item = new String[5]; // to store the Item of each question
        int score = 0;
        for (int i = 0; i < 5; i++) {
            int num1 = rand.nextInt(11) + 10; // generates random number between 10 to 20
            int num2 = rand.nextInt(11) + 10; // generates random number between 10 to 20

            String operator = " ";
            float answer = 0;
            switch (rand.nextInt(4)) {
                case 0:
                    operator = "+";
                    answer = num1 + num2;
                    break;
                case 1:
                    operator = "-";
                    answer = num1 - num2;
                    break;
                case 2:
                    operator = "*";
                    answer = num1 * num2;
                    break;
                case 3:
                    operator = "/";
                    answer = (float) num1 / num2;
                    DecimalFormat df = new DecimalFormat(".00");  
                    answer = Float.valueOf(df.format(answer));
                    break;
            }

            System.out.print("Question " + (i+1) + ": What is " + num1 + " " + operator + " " + num2 + "? ");
            double userAnswer = scanner.nextDouble();

            if (userAnswer == answer) {
                score++;
                Item[i] = "Question " + (i+1) + ": " + num1 + " " + operator + " " + num2 + " = " + answer + " Correct.";
            } else {
                Item[i] = "Question " + (i+1) + ": " + num1 + " " + operator + " " + num2 + " = " + userAnswer + " Incorrect. The correct answer is " + answer;
            }
        }

        System.out.println("You got " + score + " correct answers out of 5. The Item are below:");
        for (String detail : Item) {
            System.out.println(detail);
        }
    
        scanner.close();
    }
}
