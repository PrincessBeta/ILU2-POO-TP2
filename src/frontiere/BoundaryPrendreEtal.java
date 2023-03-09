package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désolé" + nomVendeur + "je vais voir si je peux vous trouver un etal");
		} else {
			System.out.println("Je vais regarder si je peux vous trouver un etal");
			if(!controlPrendreEtal.resteEtals()) {
				System.out.println("Desolé il y'a plus de place");
			} else {
				System.out.println("C'est parfait, il me reste un étal pour vous, il me faudra quelques informations");
				System.out.println("quel produit allez vous vendre ?");
				int nEtal = controlPrendreEtal.prendreEtal(nomVendeur, 
						scan.next(),
						Clavier.entrerEntier("Combien de produits allez vous vendre ?")
						);
				System.out.println("le vendeur " + nomVendeur + " s'est installé a l'étal" + nEtal);
				
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
