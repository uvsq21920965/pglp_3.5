import org.junit.Test;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import fr.uvsq21920965.pglp35.Affichage;
import fr.uvsq21920965.pglp35.AffichageMetier;
import fr.uvsq21920965.pglp35.UneClasseMetier;

import static org.junit.Assert.assertEquals;


import java.io.IOException;
import java.util.List;

public class UneClasseMetierTest {

   Affichage aff=new AffichageMetier();
	UneClasseMetier cm = new UneClasseMetier(aff);
	
	
	@Test
	public void uneMethodeMetier() throws IOException {
		
		// get Logback Logger 
        Logger cmLogger = (Logger) LoggerFactory.getLogger(AffichageMetier.class);

        // create and start a ListAppender
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();

        // add the appender to the logger
        cmLogger.addAppender(listAppender);

        // call method under test
        cm.uneMethodeMetier();

        // JUnit assertions
        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("Début  de  uneMethodeMetier", logsList.get(0)
                                      .getMessage());
        assertEquals(Level.INFO, logsList.get(0)
                                         .getLevel());

        assertEquals("fin  de  uneMethodeMetier", logsList.get(1)
                                       .getMessage());
        assertEquals(Level.INFO, logsList.get(1)
                                         .getLevel());
		}
	
	
	
}

