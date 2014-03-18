/*
 * Classe GestioArrayApostes 
Totes les operacions que es facin sobre l’arrai d’apostes es faran en aquesta classe. 
— Atributs: Contindrà només un atribut, que serà l’ArrayList amb les apostes. 
— Constructor: Parametritzat. Rebrà com a paràmetre l’arrai d’apostes i el guardarà al 
paràmetre corresponent. 
— Getters i setters: Només hi haurà un getter per l’atribut que conté les apostes. No hi hauran 
setters. 




 */
package principal;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author cep
 */
public class GestioArraiApostes {
    
    public static ArrayList<Aposta> arrayApostes = new ArrayList<Aposta>();
    
    public GestioArraiApostes(ArrayList arrayApostes)
    {
        this.arrayApostes = arrayApostes;
    }

    public static ArrayList<Aposta> getArrayApostes() {
        return arrayApostes;
    }
    
   /* — afegirAposta(Aposta aposta): Rebrà com a paràmetre una aposta i, si no hi ha a l’arrai 
    cap aposta del mateix apostant (s’utilitzarà el mètode estaEnArrai), l’afegirà a l‘arrai. Si 
    l’apostant ja hagués estat introduït, llençarà una excepció del tipus ExcepcioApostaExistent 
    amb un missatge adequat. */
    
    public void afegirApostes(Aposta aposta) throws ExcepcioApostaExistent
    {
        if(!estaArrai(aposta))
        {
            arrayApostes.add(aposta);
        }
        else
        {
            throw new ExcepcioApostaExistent();
        }
    }
    
    /*— eliminarAposta(String nomApostant): Rebrà com a paràmetre el nom d’un apostant, 
    recuperarà l’aposta d’aquest apostant (utilitzant el mètode recuperarAposta) i l’eliminarà de 
    l’arrai d’apostes. Si l’aposta no fos a l’arrai, es rellançarà l’objecte del tipus 
    ExcepcioApostaInexistent capturat. */
    
    public void eliminarApostes(String nomApostant) throws ExcepcioApostaInexistent
    {
        Aposta apostaEliminar = recuperarAposta(nomApostant);
        if(apostaEliminar != null)
        {
            arrayApostes.remove(apostaEliminar);
            System.out.println("La teva aposta ha estat eliminada correctament");
        }
    }
    
   /* — recuperarAposta(String nomApostant): Cercarà una aposta corresponent a l’apostant 
    rebut com a paràmetre. Si es troba l’aposta, es retornarà. Si no es troba, es llançarà una 
    excepció del tipus ExcepcioApostaInexistent amb el missatge adient. */
    
    public Aposta recuperarAposta(String nomApostant) throws ExcepcioApostaInexistent
    {
        
        Iterator<Aposta> iterador = arrayApostes.iterator();
        Aposta aposta;
        try
        {
            while(iterador.hasNext())
            {
                aposta = iterador.next();
                if(aposta.nomApostant.equals(nomApostant))
                {
                    return aposta;
                }              
            }
            throw new ExcepcioApostaInexistent(nomApostant);
        }
        catch(ExcepcioApostaInexistent ex)
        {
            System.err.println(ex);
        }
        return null;
    }
    
    /*— estaEnArrai(Aposta aposta): Cerca en l’arrai d’apostes l’aposta rebuda com a paràmetre. 
    Retorna un valor booleà, que serà true si s’ha trobat l’aposta a l’arrai, i false en cas contrari.*/
    
    public boolean estaArrai(Aposta aposta)
    {
        if(arrayApostes.contains(aposta))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
