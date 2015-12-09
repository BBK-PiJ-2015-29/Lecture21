import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class EchoClientLauncher {
	public static void main(String[] args) {
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
		System.setSecurityManager(new SecurityManager());
		}
		try {
			//create the registry if there is not one
			Registry registry = LocateRegistry.getRegistry("localhost");
			
			//create the server object
	
			EchoService echoService = (EchoService) registry.lookup("Echo");
			
			//register (bind) the server object on the registry
			//The registry may be on a different machine
			String receivedEcho  = echoService.echo(args[0]);
				
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}