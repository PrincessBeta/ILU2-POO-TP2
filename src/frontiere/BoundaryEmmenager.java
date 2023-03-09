package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					System.out.println("Bienvenue Villageois" + nomVisiteur + "\n");
					controlEmmenager.ajouterGaulois(nomVisiteur, Clavier.entrerEntier("Quelle est votre force ?"));
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		int force = Clavier.entrerEntier("Quelle est votre force ?");
		int potionFaible, potionForte;
		do {
			potionFaible = Clavier.entrerEntier("Quelle est la force de votre potion la plus faible");
			potionForte = Clavier.entrerEntier("Quelle est la force de votre potion la plus forte");
			if (potionFaible > potionForte) System.out.println("Vous vous êtes trompé entre le max et le min");
		} while (potionFaible > potionForte);
		controlEmmenager.ajouterDuide(nomVisiteur, force, potionFaible, potionForte);
	}
}



















