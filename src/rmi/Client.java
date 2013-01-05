/**
 * 
 */
package rmi;

import java.rmi.RMISecurityManager;

/**
 * @author Phillipp
 * @version 0.1
 */
public class Client {
	public static void quickSetup(String policy){
		setUpSecurity(policy);
	}
	
	private static void setUpSecurity(String policy){
        System.setProperty("java.security.policy", policy);

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }    			
	}
}
