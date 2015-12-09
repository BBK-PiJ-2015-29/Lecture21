import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.lang.NumberFormatException;
import java.lang.NullPointerException;


public class CalcClientLauncher {
	public static void main(String[] args) {
		CalcClientLauncher myCL = new CalcClientLauncher();
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
		System.setSecurityManager(new SecurityManager());
		}
		try {
			//create the registry if there is not one
			Registry registry = LocateRegistry.getRegistry("localhost");
			
			//create the server object
	
			CalcService calcService = (CalcService) registry.lookup("Calculator");			
			
			myCL.launchCalc(calcService);
			
			
				
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
	
	public void launchCalc(CalcService calcService) {
		System.out.println("Enter equation in form: x (+-*/) y (with spaces)");
		System.out.print("> ");
		String input1 = System.console().readLine();
		String[] input = null;
		if (input1.contains(" ")) {
			input = input1.split(" ");
		} else {
			System.out.println("Please remember to use spaces"
				+ " between operators and operands");
			System.exit(0);
		}
		
		double d1 = 0;
		double d2 = 0;
		try {
			d1 = Double.parseDouble(input[0]);
			d2 = Double.parseDouble(input[2]);
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			System.out.println("Not a valid input");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Not a valid input");
		}
		
		try {
			if (input[1].equals("+")) {
				System.out.print(" = " + calcService.add(d1, d2));
			} else if (input[1].equals("-")) {
				System.out.print(" = " + calcService.subtract(d1, d2));
			} else if (input[1].equals("*")) {
				System.out.print(" = " + calcService.multiply(d1, d2));
			} else if (input[1].equals("/")) {
				System.out.print(" = " + calcService.divide(d1, d2));
			} else {
				System.out.println("Not a valid input");
			}
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}