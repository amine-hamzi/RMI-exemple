package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import serveur.IBanqueMEtier;

public class Client {

	public static void main(String[] args) throws Exception {
		//IBanqueMEtier objet = (IBanqueMEtier) Naming.lookup("rmi://localhost:1099/compte"); 
		Registry registry = LocateRegistry.getRegistry(1099);
		IBanqueMEtier objet = (IBanqueMEtier) registry.lookup("compte");
		System.out.println(objet.lire_solde());

	}

}
