/*
 * Classe Aposta 
Contindrà les dades d’una aposta: bàsicament, el nom de l’apostant i la quantitat apostada. 
— Atributs: nom de l’apostant i diners apostats (en euros). Només es podran apostar quantitats 
que siguin múltiples de 20. 
— Constructor: parametritzat, amb tots els atributs. 
— Getters: tots 
— Setters: Només el corresponent a l’atribut que conté els diners apostats. 
— Mètode equals: Només compararà el nom de l’apostant. 
— Mètode toString: Retornarà un string que contindrà el nom de l’apostant i la quantitat 
apostada.
 */
package principal;

import java.util.Objects;

/**
 *
 * @author cep
 */
public class Aposta {
    
    String nomApostant;
    int dinersApostats;
    
    public Aposta(String nomApostant, int dinersApostats)
    {
        this.nomApostant = nomApostant;
        this.dinersApostats = dinersApostats;
    }

    public String getNomApostant() 
    {
        return nomApostant;
    }

    public int getDinersApostats() 
    {
        return dinersApostats;
    }

    public void setDinersApostats(int dinersApostats) 
    {
        this.dinersApostats = dinersApostats;
    }
    
    public boolean equals (String nomApostant)
    {
        return nomApostant.equals(this.nomApostant);
    }
    
    @Override
    public String toString()
    {
        return this.nomApostant + " " + this.dinersApostats;
    }
}
