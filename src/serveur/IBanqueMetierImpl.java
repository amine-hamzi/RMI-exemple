package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IBanqueMetierImpl extends UnicastRemoteObject implements IBanqueMEtier  {
	
	private double solde;

	public IBanqueMetierImpl(double solde) throws RemoteException {
		super();
		this.solde = solde;
	}

	protected IBanqueMetierImpl() throws RemoteException {
		super();
	}

	@Override
	public void debiter(double montant) throws RemoteException {
		this.solde = solde + montant;
	}

	@Override
	public void crediter(double montant)throws RemoteException {
		this.solde = solde - montant;
	}

	@Override
	public double lire_solde() throws RemoteException{
		return solde;
	}

}
