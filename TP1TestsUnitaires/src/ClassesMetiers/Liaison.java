/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetiers;

/**
 *
 * @author jacqu
 */
public class Liaison 
{
    private int idLiaison;
    private String nomLiaison;
    private String dateLiaison;
    private String heureLiaison;
    private Port portDestination;
    private Port portDepart;
    
    public Liaison(int unId, String unNom,String uneDate,
            String uneHeure, Port unPortDestination, 
            Port unPortDepart)
    {
        idLiaison = unId;
        nomLiaison = unNom;
        dateLiaison = uneDate;
        heureLiaison = uneHeure;
        portDestination = unPortDestination;
        portDepart = unPortDepart;
    }

    public int getIdLiaison() {
        return idLiaison;
    }

    public String getNomLiaison() {
        return nomLiaison;
    }

    public String getDateLiaison() {
        return dateLiaison;
    }

    public String getHeureLiaison() {
        return heureLiaison;
    }

    public Port getPortDestination() {
        return portDestination;
    }

    public Port getPortDepart() {
        return portDepart;
    }
}
