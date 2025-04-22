import java.util.Scanner;

public class Player {
    /* your code here - attributes */

  private Player player1;
  private Player player2;
  private Board game;
  private Boolean solved;
  private int score;
  private String name;
  /* your code here - constructor(s) */
  public Player(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    name = sc.nextLine();
    score = 0;
  } 
  public Player(String n){
    name = n;
    score = 0;
  }

  
  /* your code here - accessor(s) */ 
  public int getScore(){
    return score;
  }
  public String getName(){
    return name;
  }
  /* your code here - mutator(s) */ 
  public void updateScore(int s){
    score += s;
  }
  public void setName(String n){
    name = n;
  }
}
