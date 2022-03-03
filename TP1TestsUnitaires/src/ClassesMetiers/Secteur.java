/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetiers;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Secteur 
{
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Liaison> lesLiaisons;
    
    public Secteur(int unId, String unNom)
    {
        idSecteur = unId;
        nomSecteur = unNom;
        lesLiaisons = new ArrayList<Liaison>();
    }
    // Méthde qui permet d'ajouter une liaison dans la liste
    public void AjouterLiaison(Liaison uneLaison)
    {
        getLesLiaisons().add(uneLaison);
    }

    // Méthode qui permet de récupérer les liaisons d'un port de départ
    public ArrayList<Liaison> LesLiaisonsDunPortDeDepart(Port portDepart)
    {
        ArrayList<Liaison> lstLiaisons = new ArrayList<Liaison>();

        for(Liaison l : getLesLiaisons())
        {
            if(l.getPortDepart().getIdPort() == portDepart.getIdPort())
            {
                lstLiaisons.add(l);
            }
        }
        return lstLiaisons;
    }

    // Méthode qui permet de récupérer les liaisons d'un port de départ à une date
    public ArrayList<Liaison> LesLiaisonsDunPortDeDepartEtDuneDate(Port portDepart, String uneDate)
    {
        ArrayList<Liaison> lstLiaisons = new ArrayList<Liaison>();

        for (Liaison l : getLesLiaisons())
        {
            if (l.getPortDepart().getIdPort() == portDepart.getIdPort() && l.getDateLiaison().compareTo(uneDate) == 0)
            {
                lstLiaisons.add(l);
            }
        }
        return lstLiaisons;
    }

    // Méthode qui permet de récupérer l'heure d'une liaison
    // Si la liaison n'existe pas on retourne une chaîne vide
    public String ObtenirHeureDuneLiaison(Liaison uneLiaison)
    {
        String heure = "";
        for(Liaison l : getLesLiaisons())
        {
            if(l.getIdLiaison() == uneLiaison.getIdLiaison())
            {
                return l.getHeureLiaison();
            }
        }
        return heure;
    }

    public int getIdSecteur() {
        return idSecteur;
    }

    public String getNomSecteur() {
        return nomSecteur;
    }

    public ArrayList<Liaison> getLesLiaisons() {
        return lesLiaisons;
    }
}
