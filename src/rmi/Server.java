/**
 * 
 */
package rmi;

import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public class Server {
	private static Registry registry;
	
	public static void quickSetup(String policy){
		setUpSecurity(policy);
		setUpRegistry();
	}
	
	private static void setUpSecurity(String policy){
        System.setProperty("java.security.policy", policy);

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }    			
	}
	
	private static void setUpRegistry(){
    	try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT); //RMI-Port 1099
			registry = LocateRegistry.getRegistry();
		} catch (RemoteException re) {
			re.printStackTrace();
		} 
	}
}
