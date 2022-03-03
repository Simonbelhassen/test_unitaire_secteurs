/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetiers;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacqu
 */
public class SecteurTest {
    
    public SecteurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AjouterLiaison method, of class Secteur.
     */
    @Test
    public void testAjouterLiaison() {
        System.out.println("AjouterLiaison");
        Port portDestination1 = new Port(1, "Quiberon");
        Port portDepart1 = new Port(2, "Le palais");
        Liaison liaison1 = new Liaison(1, "Liaison 1", "03/02/2021", "09:15", portDestination1, portDepart1);
        
        Port portDestination2 = new Port(3, "Molène");
        Port portDepart2 = new Port(4, "Brest");
        Liaison liaison2 = new Liaison(2, "Liaison 2", "03/02/2021", "09:15", portDestination2, portDepart2);
        
        Secteur unSecteur = new Secteur(1, "Ouessant");
        unSecteur.AjouterLiaison(liaison1);
        unSecteur.AjouterLiaison(liaison2);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(2,unSecteur.getLesLiaisons().size());
    }

    /**
     * Test of LesLiaisonsDunPortDeDepart method, of class Secteur.
     */
    @Test
    public void testLesLiaisonsDunPortDeDepart() {
        System.out.println("LesLiaisonsDunPortDeDepart");
        
        Secteur unSecteur = new Secteur(1, "Ouessant");
        
        Port portDepart1 = new Port(2, "Quiberon");
        Port portDestination1 = new Port(1, "Le Palais");
        Liaison liaison1 = new Liaison(1, "Liaison 1", "03/02/2021", "09:15", portDestination1, portDepart1);
        unSecteur.AjouterLiaison(liaison1);
        
        portDepart1 = new Port(2, "Quiberon");
        Port portDestination2 = new Port(3, "Brest");
        Liaison liaison2 = new Liaison(2, "Liaison 2", "03/02/2021", "09:15", portDestination2, portDepart1);
        unSecteur.AjouterLiaison(liaison2);
        
        Port portDepart3 = new Port(5, "Molène");
        Port portDestination3 = new Port(4, "Belle île en mer");
        Liaison liaison3 = new Liaison(3, "Liaison 2", "03/02/2021", "09:15", portDestination3, portDepart3);
        unSecteur.AjouterLiaison(liaison3);
        
        portDepart1 = new Port(2, "Quiberon");
        Port portDestination4 = new Port(6, "Belle île en mer");
        Liaison liaison4 = new Liaison(4, "Liaison 2", "03/02/2021", "09:15", portDestination4, portDepart1);
        unSecteur.AjouterLiaison(liaison4);
        
        Port portDepart5 = new Port(9, "Molène");
        Port portDestination5 = new Port(8, "Quiberon");
        Liaison liaison5 = new Liaison(5, "Liaison 2", "03/02/2021", "09:15", portDestination5, portDepart5);
        unSecteur.AjouterLiaison(liaison5);
        
        ArrayList<Liaison> expected = unSecteur.LesLiaisonsDunPortDeDepart(portDepart1);

        // Liste dans laquelle il n'y a que des "QUIBERON"
        ArrayList<Liaison> actual = new ArrayList();
        actual.add(liaison1);
        actual.add(liaison2);
        actual.add(liaison4);
        
        assertEquals(actual.size(),expected.size());
    }

    /**
     * Test of LesLiaisonsDunPortDeDepartEtDuneDate method, of class Secteur.
     */
    @Test
    public void testLesLiaisonsDunPortDeDepartEtDuneDate() {
        System.out.println("LesLiaisonsDunPortDeDepartEtDuneDate");
        
        Secteur unSecteur = new Secteur(1, "Ouessant");
        
        Port portDepart1 = new Port(2, "Quiberon");
        Port portDestination1 = new Port(1, "Le Palais");
        Liaison liaison1 = new Liaison(1, "Liaison 1", "03/02/2021", "09:15", portDestination1, portDepart1);
        unSecteur.AjouterLiaison(liaison1);
        
        portDepart1 = new Port(2, "Quiberon");
        Port portDestination2 = new Port(3, "Brest");
        Liaison liaison2 = new Liaison(2, "Liaison 2", "03/02/2021", "09:15", portDestination2, portDepart1);
        unSecteur.AjouterLiaison(liaison2);
        
        Port portDepart3 = new Port(5, "Molène");
        Port portDestination3 = new Port(4, "Belle île en mer");
        Liaison liaison3 = new Liaison(3, "Liaison 2", "03/02/2021", "09:15", portDestination3, portDepart3);
        unSecteur.AjouterLiaison(liaison3);
        
        portDepart1 = new Port(2, "Quiberon");
        Port portDestination4 = new Port(6, "Belle île en mer");
        Liaison liaison4 = new Liaison(4, "Liaison 2", "03/02/2021", "09:15", portDestination4, portDepart1);
        unSecteur.AjouterLiaison(liaison4);
        
        Port portDepart5 = new Port(9, "Molène");
        Port portDestination5 = new Port(8, "Quiberon");
        Liaison liaison5 = new Liaison(5, "Liaison 2", "03/02/2021", "09:15", portDestination5, portDepart5);
        unSecteur.AjouterLiaison(liaison5);
        
        ArrayList<Liaison> expected = unSecteur.LesLiaisonsDunPortDeDepartEtDuneDate(portDepart1,"03/02/2021");

        // Liste dans laquelle il n'y a que des "QUIBERON"
        ArrayList<Liaison> actual = new ArrayList();
        actual.add(liaison1);
        actual.add(liaison2);
        actual.add(liaison4);
        
        assertEquals(actual.size(),expected.size());
        
        expected = unSecteur.LesLiaisonsDunPortDeDepartEtDuneDate(portDepart1,"04/02/2021");
        actual = new ArrayList();
        assertEquals(actual.size(),expected.size());
    }

    /**
     * Test of ObtenirHeureDuneLiaison method, of class Secteur.
     */
    @Test
    public void testObtenirHeureDuneLiaison() {
        System.out.println("ObtenirHeureDuneLiaison");
        
        Secteur unSecteur = new Secteur(1, "Ouessant");
        
        Port portDepart1 = new Port(2, "Quiberon");
        Port portDestination1 = new Port(1, "Le Palais");
        Liaison liaison1 = new Liaison(1, "Liaison 1", "03/02/2021", "09:15", portDestination1, portDepart1);
        unSecteur.AjouterLiaison(liaison1);
        
        portDepart1 = new Port(2, "Quiberon");
        Port portDestination2 = new Port(3, "Brest");
        Liaison liaison2 = new Liaison(2, "Liaison 2", "03/02/2021", "09:15", portDestination2, portDepart1);

        String expected = "09:15";
        String actual = unSecteur.ObtenirHeureDuneLiaison(liaison1);
        assertEquals(expected, actual);

        expected = "";
        actual = unSecteur.ObtenirHeureDuneLiaison(liaison2);
        assertEquals(expected, actual);

    }

    /**
     * Test of getIdSecteur method, of class Secteur.
     */
    @Test
    public void testGetIdSecteur() {
        System.out.println("getIdSecteur");
        Secteur unSecteur = new Secteur(1, "Ouessant");
        int expResult = 1;
        int result = unSecteur.getIdSecteur();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNomSecteur method, of class Secteur.
     */
    @Test
    public void testGetNomSecteur() {
        System.out.println("getNomSecteur");
        Secteur unSecteur = new Secteur(1, "Ouessant");
        String expResult = "Ouessant";
        String result = unSecteur.getNomSecteur();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLesLiaisons method, of class Secteur.
     */
    @Test
    public void testGetLesLiaisons() {
        System.out.println("getLesLiaisons");
        Port portDestination1 = new Port(1, "Quiberon");
        Port portDepart1 = new Port(2, "Le palais");
        Liaison liaison1 = new Liaison(1, "Liaison 1", "03/02/2021", "09:15", portDestination1, portDepart1);
        
        Port portDestination2 = new Port(3, "Molène");
        Port portDepart2 = new Port(4, "Brest");
        Liaison liaison2 = new Liaison(2, "Liaison 2", "03/02/2021", "09:15", portDestination2, portDepart2);
        
        Secteur unSecteur = new Secteur(1, "Ouessant");
        unSecteur.AjouterLiaison(liaison1);unSecteur.AjouterLiaison(liaison2);
        ArrayList<Liaison> expResult = new ArrayList();
        expResult.add(liaison1);expResult.add(liaison2);
        ArrayList<Liaison> result = unSecteur.getLesLiaisons();
        assertEquals(expResult, result);
    }
}
