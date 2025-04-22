import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    Scanner input = new Scanner(System.in);
    // Constructors

    public void setFirstPlayer(){
        Player currentPlayer;
        if (Math.random() > .5){
          currentPlayer = player1;
        } else {
          currentPlayer = player2;
        }
    }
    

    public void endGame(){
        if (player1.getScore() > player2.getScore()){
            System.out.println("Congrats " + player1.getName() + "\nYou didn't fail");
          } else if (player2.getScore() > player1.getScore()){
            System.out.println("Congrats " + player2.getName() + "\nYou didn't fail");
          } else {
            System.out.println("How did you both make it a draw?");
          }
    }

    public Game(){
        player1 = new Player();
        player2 = new Player();
    }

    public void switchPlayer(){
         if (currentPlayer == player1){
            currentPlayer = player2;
         } else {
                currentPlayer = player1;
        }
         
    }

    public void play(){
        setFirstPlayer();

        while(Board.getPileSize()> 1){
          System.out.println("Pieces: " + Board.getPileSize());

          Board.takePieces();
          switchPlayer();
        }
        if(currentPlayer == player1){
          player1.updateScore(1);
          System.out.println(player1.getName() + ", you win!");
        } else {
        player2.updateScore(1);
        System.out.println(player2.getName() + ", you win!");
        }
      switchPlayer();

      if(currentPlayer == player2){
        System.out.println(player2.getName() + ", you lost!");
      } else
      System.out.println(player1.getName() + ", you lost!");

      System.out.println("Do you want to player again?");
      String playAgain = input.nextLine();
      if (playAgain.equals("y") || playAgain.equals("yes")){
        Board.populate();;
        play();
      }else{
        endGame();
      }

        


    }
    
}
