import java.rmi.*;

public interface DiceGame extends Remote {

 public int rollDice() throws RemoteException;

 public int compareRolls(int roll1, int roll2) throws
RemoteException;

} 