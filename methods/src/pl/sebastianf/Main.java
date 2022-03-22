package pl.sebastianf;

public class Main {

    public static void main(String[] args) {


        int Highscore = calculateScore(true,800,5,100);
        System.out.println("Your final score was " + Highscore);

        Highscore=calculateScore(true,10_000,8,200);
        System.out.println("Your final score was " + Highscore +"\n\n");

        displayHighScorePosition("Player_1",calculateHighScorePosition(1500));
        displayHighScorePosition("Player_2",calculateHighScorePosition(900));
        displayHighScorePosition("Player_3",calculateHighScorePosition(400));
        displayHighScorePosition("Player_4",calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore>=1000)      return 1;
//        if (playerScore>=500)  return 2;
//        if (playerScore>=100)  return 3;
//        return 4;

        int position =4;
        if (playerScore>=1000)      position= 1;
        else if (playerScore>=500)  position= 2;
        else if (playerScore>=100)  position= 3;

        return  position;
    }

}
