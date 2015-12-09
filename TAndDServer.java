import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TAndDServer extends UnicastRemoteObject implements TAndDService {
	public TAndDServer() throws RemoteException {
		// nothing to initialise for this server
		//(must have a constructor that throws RemoteException)
	}
	
	@Override
	public Calendar getTAndD() throws RemoteException {
		Calendar currentTAndD = new GregorianCalendar();
		System.out.println("Replied to a client request for : Current time and date");
		return currentTAndD;
	}
	

}
