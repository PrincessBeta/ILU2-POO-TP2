package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		System.out.println("Quel produit voulez vous acheter ?");
		String produit = scan.next();
		Gaulois[] vendeurs = controlAcheterProduit.TrouverVendeurs(produit);
		if (vendeurs == null) {
			System.out.println("il n'y'a aucun vendeur de ce produit !");
			return;
		}
		System.out.println("Les vendeurs de "+produit+" sont :");
		for (int i = 0; i < vendeurs.length; i++) {
			System.out.println(i+1 + ": " + vendeurs[i].getNom());
		}
		int v;
		do {
			v = Clavier.entrerEntier("A quel vendeurs voulez vous acheter le produit ?")-1;
		} while (v >= vendeurs.length);
		
		int nbAchetes = controlAcheterProduit.acheterProduit(vendeurs[v], Clavier.entrerEntier("Combien voulez vous en acheter ?"));
		System.out.println(nomAcheteur + " a acheté " + nbAchetes+ produit+ " a "+vendeurs[v].getNom());
		
	}
}
