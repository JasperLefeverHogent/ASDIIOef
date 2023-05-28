package domein;

import java.rmi.Remote;
import java.rmi.RemoteException;

//STAP 1 Remote interface maken
public interface GumballMachineRemote // extends Remote
{
	// throws RemoteException
	int getCount();

	String getLocation();

	String getState();

}
