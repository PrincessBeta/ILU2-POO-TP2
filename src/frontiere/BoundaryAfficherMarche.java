package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infos = controlAfficherMarche.donnerEtatMarche();
		
		if (infos.length == 0) {
			System.out.println("Le marché est vide, allez vous en");
		} else {
			System.out.println(nomAcheteur+", vous trouverez au marché :");
			for (int i = 0; i < infos.length; i++) {
				System.out.println(
						"-" + infos[i++] + " qui vend " + infos[i++] + " " + infos[i]);
			}
		}
	}
}
