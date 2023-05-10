import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class DiceGameClient {
 public static void main(String[] args) throws
RemoteException, NotBoundException {
 // Look up the remote object
 try {

 DiceGame game = (DiceGame)
Naming.lookup("rmi://localhost/DiceGame");

 // Roll the dice

 int roll1 = game.rollDice();

 int roll2 = game.rollDice();



 // Compare the rolls

 int winner = game.compareRolls(roll1, roll2);

 // Print the results

 System.out.println("Player 1 rolled a " + roll1);

 System.out.println("Player 2 rolled a " + roll2);

 System.out.println("The winner is player " + (winner ==
roll1 ? "1" : "2"));

 } catch (MalformedURLException e) {

 e.printStackTrace();

 }
 }
} 