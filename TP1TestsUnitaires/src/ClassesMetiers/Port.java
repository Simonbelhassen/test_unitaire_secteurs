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
public class Port
{
    private int idPort;
    private String nomPort;
    
    public Port(int unId, String unNom)
    {
        idPort = unId;
        nomPort = unNom;
    }

    public int getIdPort() {
        return idPort;
    }

    public String getNomPort() {
        return nomPort;
    }
}
