import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

public class DiceGameImpl extends UnicastRemoteObject implements
DiceGame, Serializable {
 public DiceGameImpl() throws RemoteException {
 super();
 }
 public int rollDice() throws RemoteException {

 // Generate a random number between 1 and 6

 return (int) (Math.random() * 6) + 1;

 }
 public int compareRolls(int roll1, int roll2) throws
RemoteException {

 // Compare the two rolls and return the higher one

 return Math.max(roll1, roll2);

 }

} 