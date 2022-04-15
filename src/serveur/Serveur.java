package serveur;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*; 
public class Serveur { 
	public static void main(String[] args) 
	{ 
		 try { 
			 System.out.println("Serveur : Construction de l’implémentation"); 
			 //Compte cpt= new Compte(15.50); 
			 IBanqueMetierImpl objet = new IBanqueMetierImpl(15.50);
			 System.out.println(objet.toString());
			 System.out.println("Objet Compte enregistré dans RMIregistry"); 
			 //demarrage de l'annuaire
			 Registry registry = LocateRegistry.createRegistry(1099);
			 
			 //publication de la reference ds l'annuaire
			 //Naming.rebind("rmi://localhost:1099/compte", objet);
			 registry.rebind("compte", objet);
			 System.out.println("Attente des invocations des clients "); 
		 } 
		 catch (Exception e) { 
			 System.out.println("Erreur de liaison de l'objet Compte"); 
			 System.out.println(e.toString()); 
		 }
	}
}
