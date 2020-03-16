package uvsq21920965;
/**
 * uneClassMetier Class.
 * @author oem
 *
 */
public class UneClasseMetier {
/**
 * attribut de type affichage.
 */
private Affichage affichage;

  /**
   * Constructeur.
   * @param affichageAtt 
   */
  public UneClasseMetier(Affichage affichageAtt) {
    this.affichage = affichageAtt;
  }
  /**
   * methode qui affiche les log messeages.
   */
  public void uneMethodeMetier() {
    affichage.AffichageDebut();
	affichage.AffichageFin();
	}
}
