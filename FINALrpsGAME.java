import java.util.*;

public class FINALrpsGAME 
{   
    
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[]) throws InterruptedException 
    {
      int pscore = 0;
      int cscore = 0;
      Scanner input = new Scanner(System.in);

      System.out.print("Game is Starting" + "\n");
      Thread.sleep(3000);
      System.out.println("Loading.");
      Thread.sleep(1000);
      System.out.println("Loading..");
      Thread.sleep(2000);
      System.out.println("Loading..." + "\n");
      Thread.sleep(1000);
      
      while (true) {
        
        System.out.println("Enter any one of the following inputs:  ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println();
          
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 

      //Rules of the Game Applied Below:
      /*if both playerMove and computerMove
        produces the same formation, then 
        Game is a tie*/

        if (playerMove.equals(computerMove))
        System.out.println("Game is Tie !!");
  // if playerMove is ROCK         
  else if (playerMove.equals(FINALrpsGAME.ROCK))
    System.out.println(computerMove.equals(FINALrpsGAME.PAPER) ? "Computer Wins": "Player wins");   
  // if playerMove is PAPER
  else if (playerMove.equals(FINALrpsGAME.PAPER))
    System.out.println(computerMove.equals(FINALrpsGAME.SCISSORS) ? "Computer Wins": "Player wins");   
  // if playerMove is SCISSORS    
  else
    System.out.println(computerMove.equals(FINALrpsGAME.ROCK) ? "Computer Wins": "Player wins");   


    while (true) {  //LOOP THE COUNT SCORE  //TIED //PLAYER WINS //COMPUTER WINS
      if(playerMove.equals(computerMove)){
          break;
      }if (playerMove.equals(FINALrpsGAME.ROCK)) {
          pscore++;
          cscore++;
          System.out.println(computerMove.equals(FINALrpsGAME.PAPER) ? "COMPUTER SCORE: " + cscore :"YOUR SCORE: " + pscore); 
          break;
      }if (playerMove.equals(FINALrpsGAME.PAPER)) {
          cscore++;
          pscore++;
          System.out.println(computerMove.equals(FINALrpsGAME.SCISSORS) ? "COMPUTER SCORE: " + cscore :"YOUR SCORE: " + pscore); 
          break;
      }if (playerMove.equals(FINALrpsGAME.SCISSORS)) {
        cscore++;
        pscore++;
        System.out.println(computerMove.equals(FINALrpsGAME.ROCK) ? "COMPUTER SCORE: " + cscore :"YOUR SCORE: " + pscore); 
        break;
      }
    }

/* ASK THE USER TO CONTINUE OR EXIT THE GAME */
    System.out.println("Do you want to continue? yes or no"); 
    String inputUSER = input.nextLine();
    String caps = inputUSER.toUpperCase();

    switch (caps) {
      case "YES":
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
        break;
    
      default:
      System.out.println("closing the program");
      System.exit(0);
        break;
    }
  }

}

    
    /* Get Computer's move using Random 
       class nextInt() method */   
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = FINALrpsGAME.ROCK;
        else if(input == 2)
            computermove = FINALrpsGAME.PAPER;
        else
            computermove = FINALrpsGAME.SCISSORS;
            
        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;    
    }
    
    /* Get Player's move using Scanner
       class */
    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("Player move is: "+ playermove);

/*FORCE THE PLAYER TO INPUT A SPECIFIC CHOICES GIVEN*/
        switch (playermove) {
          case "ROCK":

            break;
            case "PAPER":

            break;
            case "SCISSORS":
            
            break;
            
          default:
          System.out.println("YOU INPUTTED WRONG CHOICES");
          System.exit(0);
            break;
        }
        return playermove;
    }    

    
}