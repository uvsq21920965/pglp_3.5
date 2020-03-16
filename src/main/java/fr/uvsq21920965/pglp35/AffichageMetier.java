package fr.uvsq21920965.pglp35;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AffichageMetier classe.
 * @author Sarrra Belmahdi.
 *
 */

public class AffichageMetier implements Affichage {
/**
 * initilise logger.
 */
private final Logger logger = LoggerFactory.getLogger(
  AffichageMetier.class);

  /**
   * enregistrer un message INFO.
   */
  public void affichageDebut() {
    logger.info("Début  de  uneMethodeMetier");
  }

  /**
   * enregistrer un message INFO.
   */
  public void affichageFin() {
    logger.info("fin  de  uneMethodeMetier");
  }
}
