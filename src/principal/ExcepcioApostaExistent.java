/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author cep
 */
class ExcepcioApostaExistent extends Exception 
{ 
    ExcepcioApostaExistent() {
        super("La aposta ja existeix");
     }
} 

