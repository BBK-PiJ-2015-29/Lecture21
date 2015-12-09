import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TAndDServerLauncher {
	public static void main(String[] args) {
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
		System.setSecurityManager(new SecurityManager());
		}
		try {
			//create the registry if there is not one
			Registry registry = LocateRegistry.getRegistry();
			//create the server object
			TAndDServer server = new TAndDServer();
			//register (bind) the server object on the registry
			//The registry may be on a different machine
			registry.rebind("TAndD", server);
		} catch (RemoteException ex) {
			ex.printStackTrace();
		
		}
	}
}