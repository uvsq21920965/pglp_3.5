package fr.uvsq21920965.pglp35;

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
   * @param affichageAtt attribut de type affichage.
   */
  public UneClasseMetier(final Affichage affichageAtt) {
    this.affichage = affichageAtt;
  }
  /**
   * methode qui affiche les log messeages.
   */
  public void uneMethodeMetier() {
    affichage.affichageDebut();
    affichage.affichageFin();
  }
}
