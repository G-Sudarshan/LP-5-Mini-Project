import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class DiceGameServer {

 public static void main(String[] args) throws
RemoteException, MalformedURLException {

 // Create the remote object
 DiceGame game = new DiceGameImpl();

 // Bind the remote object to the registry
 Naming.rebind("rmi://localhost/DiceGame", game);
 System.out.println("Dice game server started");

 }
} 