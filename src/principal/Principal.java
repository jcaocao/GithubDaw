/*
 * Classe Principal 
Contindrà només el mètode main, que realitzarà les següents accions: 
— Cridarà al mètode estàtic llegirArxiu de la classe GestioArxiu, que recuperarà un ArrayList 
amb les dades de les apostes prèviament guardades. 
— Crearà un objecte de la classe AplicacioApostes, passant-li com a paràmetre l’ArrayList 
prèviament llegit. 
— Cridarà al mètode iniciar() de l’objecte de la classe AplicacioApostes, que iniciarà l’aplicació. 
— Cridarà al mètode estàtic gravarArxiu de la classeGestioArxiu, que guardarà les dades de 
l’ArrayList en l’arxiu apostes.txt. 

 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author cep
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcioApostaInexistent, ExcepcioApostaExistent {
        GestioArxiu arxiu = new GestioArxiu();
        ArrayList<Aposta> arrayArxiu = new ArrayList<Aposta>();
        arrayArxiu = arxiu.llegirArxiu();
        AplicacioApostes appAp = new AplicacioApostes(arrayArxiu);
        appAp.iniciar();
        arxiu.guardarArxiu(arrayArxiu);
    }
}
