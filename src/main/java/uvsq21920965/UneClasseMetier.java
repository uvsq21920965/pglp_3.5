package uvsq21920965;

public class UneClasseMetier {
	
	private Affichage affichage;
	
	public UneClasseMetier(Affichage affichageAtt) {
	  this.affichage = affichageAtt;
	}

	public void uneMethodeMetier() {
		affichage.AffichageDebut();
		affichage.AffichageFin();
	}
	

}
