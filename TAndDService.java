import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
* An implementation of the time and date service.
*/
public interface TAndDService extends Remote {
	/**
	* Returns the same string passed as parameter
	*
	* @return the current time and date
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/
	Calendar getTAndD() throws RemoteException;
	
}