package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBanqueMEtier extends Remote{

	void debiter(double montant) throws RemoteException;
	void crediter(double montant) throws RemoteException ;
	double lire_solde() throws RemoteException;
}
