package uvsq21920965;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AffichageMetier classe.
 * @author Sarrra Belmahdi.
 *
 */

public class AffichageMetier implements Affichage{
/**
 * initilise logger.
 */
private static final Logger logger = LoggerFactory.getLogger(AffichageMetier.class);

  /**
   * enregistrer un message INFO.
   */
  public void AffichageDebut() {
    logger.info("Début  de  uneMethodeMetier" );
  }

  /**
   * enregistrer un message INFO.
   */
  public void AffichageFin() {
    logger.info("fin  de  uneMethodeMetier" );
  }
}
