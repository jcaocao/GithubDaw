/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author cep
 */
class ExcepcioApostaInexistent extends Exception 
{ 
     ExcepcioApostaInexistent(String nomApostant) {
        super("La aposta al nom de " + nomApostant+ " no existeix");
     }
} 

    
        