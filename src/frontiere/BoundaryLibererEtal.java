package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if (!controlLibererEtal.isVendeur(nomVendeur)) System.out.println("Vous n'etes pas inscrit sur le marché aujourd'hui");
		else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			if (donneesEtal[0].equals("true")) {
				System.out.println("vous avez vendu "
						+ donneesEtal[4] + " sur " +
						donneesEtal[3] + " " + donneesEtal[2]);
				System.out.println("En revoir "+ nomVendeur);
			}
		}
	}

}
