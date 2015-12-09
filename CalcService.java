import java.rmi.Remote;
import java.rmi.RemoteException;
/**
* An implementation of the echo service.
*/
public interface CalcService extends Remote {
	/**
	* Adds two doubles and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the addition
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/
	double add(double d1, double d2) throws RemoteException;
	
	/**
	* Subtracts d2 from d1 and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the subtraction
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/	
	double subtract(double d1, double d2) throws RemoteException;
	
	/**
	* Multiplies two doubles and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the multiplication
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/	
	double multiply(double d1, double d2) throws RemoteException;
	
	/**
	* Divides d1 by d2 and returns result
	* 
	* @param d1 the first double
	* @param d2 the second double
	* 
	* @return the result of the division
	* @throws RemoteException (in case anything goes wrong with the network connectivity)
	*/
	double divide(double d1, double d2) throws RemoteException;
	
	
	
}