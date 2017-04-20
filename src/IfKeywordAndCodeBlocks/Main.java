package IfKeywordAndCodeBlocks;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*// if-statement without brackets. For single-line code.
        if (score == 5000)
            System.out.println("Your score was 5000");

        // if - else if - else
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here");
        }*/

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }

        // Challenge: Print a new final score result with new values
        boolean gameOver1 = true;
        int score1 = 10000;
        int levelCompleted1 = 8;
        int bonus1 = 200;

        System.out.println("New score: " + score1 + "\n" +
                "New Level:" + levelCompleted1 + "\n" +
                "New Bonus: " + bonus1);

        if (gameOver1) {
            int finalScore1 = score1 + (levelCompleted1 * bonus1);
            System.out.println("Final score is: " + finalScore1);
        }

    }
}
