import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcServer extends UnicastRemoteObject implements CalcService {
	public CalcServer() throws RemoteException {
		// nothing to initialise for this server
		//(must have a constructor that throws RemoteException)
	}
	
	/**
	* Adds two doubles and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the addition
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/
	public double add(double d1, double d2) throws RemoteException {
			return d1 + d2;
	}
	
	/**
	* Subtracts d2 from d1 and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the subtraction
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/	
	public double subtract(double d1, double d2) throws RemoteException {
		return d1 - d2;
	}
	
	/**
	* Multiplies two doubles and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the multiplication
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/	
	public double multiply(double d1, double d2) throws RemoteException {
		return d1 * d2;
	}
	
	/**
	* Divides d1 by d2 and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the division
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/
	public double divide(double d1, double d2) throws RemoteException {
		return d1 / d2;
	}

}
