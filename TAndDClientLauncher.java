import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.Calendar;

public class TAndDClientLauncher {
	public static void main(String[] args) {
	
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
		System.setSecurityManager(new SecurityManager());
		}
		try {
			//create the registry if there is not one
			Registry registry = LocateRegistry.getRegistry("localhost");
			
			//create the server object
	
			TAndDService tAndDService = (TAndDService) registry.lookup("TAndD");			
			
			Calendar myCal = tAndDService.getTAndD();
			
			System.out.println(myCal.getTime());
			
				
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}