package uvsq21920965;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AffichageMetier implements Affichage{
	Logger logger = LoggerFactory.getLogger(AffichageMetier.class);
	public void AffichageDebut() {
		 
		    logger.info("Début  de  uneMethodeMetier" );
	}

	public void AffichageFin() {
		 
		    logger.info("fin  de  uneMethodeMetier" );

	}
	

}
