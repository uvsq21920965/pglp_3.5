package uvsq21920965;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AffichageMetier implements Affichage{

	public void AffichageDebut() {
		 Logger logger = LoggerFactory.getLogger(AffichageMetier.class);
		    logger.info(LocalDateTime.now() + " : Début  de  uneMethodeMetier " );

    
	}

	public void AffichageFin() {
		 Logger logger = LoggerFactory.getLogger(AffichageMetier.class);
		    logger.info(LocalDateTime.now() + " : fin  de  uneMethodeMetier " );

	}
	

}
