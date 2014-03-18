/*
Classe AplicacioApostes 
Aquesta classe serà la que realitzi la interacció amb l’usuari. Mostrarà els menús, els missatges 
informatius a l’usuari i li demanarà dades per teclat. 
— Atributs: Només contindrà un atribut, que serà un objecte de la classe GestioArraiApostes. 
— Constructor: Rebrà com a paràmetre un ArrayList amb les apostes, i crearà un objecte de la 
classe GestioArrayApostes, passant-li com a paràmetre l’ArrayList. Aquest objecte de la 
classe GestioArrayApostes serà guardat a l’atribut. 

 */
package principal;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cep
 */
public class AplicacioApostes {
    
    GestioArraiApostes gAA;
    
    AplicacioApostes(ArrayList arrai)
    {
        gAA = new GestioArraiApostes(arrai);
    }
    /*— iniciar(): Aquest mètode iniciarà l’aplicació: cridarà al mètode menu i, en funció de l’opció 
    escollida, anirà a cadascuna de les opcions. Si l’usuari introdueix una opció incorrecta,  
    mostrarà el missatge adequat. No sortirem del mètode iniciar mentre l’usuari no esculli 
    l’opcio de “Sortir”, la qual cosa significarà la sortida de l’aplicació. */
    
    public void iniciar() throws ExcepcioApostaInexistent, ExcepcioApostaExistent
    {
        int opcio;
        do {
            opcio = menu();
            switch(opcio)
            {
                case 1: opcioMostrarApostes();
                    break;
                case 2: opcioMostrarAposta();
                    break;
                case 3: opcioAfegirAposta();
                    break;
                case 4: opcioEliminarAposta();
                    break;
                case 5: opcioModificarAposta();
                    break;
                case 6: calcularTotalApostes();
                    break;
                case -1: System.out.println("Opcio incorrecte!");
                    break;
                case 0:
                    break;
            }
        }while (opcio!=0);
    }
    
    /*— menu(): Aquest mètode mostrarà a l’usuari les opcions de menú, demanarà a l’usuari quina 
opció vol i la retornarà. Si l’usuari escull una opció incorrecta o introdueix un valor 
incorrecte, retornarà -1. */
    private static int menu()
    {
        int opcio; 
        
        System.out.println("Menu:");
        System.out.println("1-Mostrar totes les apostes");
        System.out.println("2-Mostrar una aposta");
        System.out.println("3-Afegir una aposta");
        System.out.println("4-Eliminar una aposta");
        System.out.println("5-Modificar una aposta");
        System.out.println("6-Calcular total apostes");
        System.out.println("0-Sortir");
        opcio = Teclat.getInt("Quina opcio vols");

        if (opcio<0 || opcio >7)
        {
            opcio = -1;
        }
        return opcio;
    }
    
    /*— opcioMostrarApostes(): Es mostrarà un llistat amb tots els apostants i la quantitat 
apostada (un apostant per línia). Es cridarà al mètode getApostes de la classe 
GestioArraiApostes per recuperar l’ArrayList d’apostes. Si no hi ha cap aposta a l’arrai 
d’apostes, haurem d’informar a l’usuari. */
    
    public void opcioMostrarApostes()
    {
        ArrayList<Aposta> arrayApostes = new ArrayList<Aposta>();
        arrayApostes = gAA.getArrayApostes();
        if (arrayApostes.isEmpty())
        {
            System.out.println("No hi ha apostes disponibles");
        }
        else
        {
            Iterator<Aposta> iterador = arrayApostes.iterator();

            while(iterador.hasNext())
            {
                Aposta aposta = iterador.next();
                System.out.println("Nom: " + aposta.getNomApostant()+", Quantitat: "+aposta.getDinersApostats());
            }
        }
    }
    
    /*— opcioMostrarAposta(): Es demanarà a l’usuari el nom d’un apostant, es recuperarà la seva 
aposta (amb el mètode recuperarAposta de la classe GestioArraiApostes) i es mostrarà la 
quantitat apostada per l’apostant. */
    public void opcioMostrarAposta() throws ExcepcioApostaInexistent
    {
        Aposta apostaMostrada;
        String apostaMostrar = Teclat.getString("Quina aposta vols mostrar? ");
        apostaMostrada = gAA.recuperarAposta(apostaMostrar);
        if(apostaMostrada != null)
        {
            System.out.println("La aposta es de: "+ apostaMostrada.dinersApostats);
        }
        
    }
    
    /*— opcioAfegirAposta(): Demanarà a l’usuari el nom d’un apostant i la quantitat apostada, 
crearà un objecte de la classe Aposta i afegirà l’aposta en l’arrai d’apostes cridant al mètode 
afegirAposta de la classe GestioArraiApostes. Finalment, es mostrarà a l’usuari un missatge 
confirmat que l’aposta ha estat afegida. */
    
    public void opcioAfegirAposta() throws ExcepcioApostaExistent
    {
        String nomAfegirAposta = Teclat.getString("A nom de qui vols fer l'aposta? ");
        int dinersApostats = Teclat.getInt("Quina aposta vols fer? ");
        Aposta novaAposta = new Aposta(nomAfegirAposta,dinersApostats);
        gAA.afegirApostes(novaAposta);
        System.out.println("La teva aposta ha estat correctament afegida");
    }    
    
    /*— opcioEliminarAposta(): Demanarà a l’usuari el nom d’un apostant i cridarà al mètode 
    eliminarAposta de la classe GestioArraiApostes. Finalment, es mostrarà a l’usuari un 
    missatge confirmat que l’aposta ha estat eliminada. */
    
    public void opcioEliminarAposta() throws ExcepcioApostaInexistent
    {
        String nomEliminarAposta = Teclat.getString("Quin es el nom de l'aposta que vols eliminar ");
        gAA.eliminarApostes(nomEliminarAposta);
        
    } 
    
    /*— opcioModificarAposta(): Demanarà a l’usuari el nom d’un apostant i recuperarà l’aposta 
    realitzada per ell cridant al mètode recuperarAposta de la classe GestioArraiApostes. A 
    continuació, mostrarà a l’usuari la quantitat actual apostada, i demanarà a l’usuari la nova 
    quantitat de l’aposta. Si la quantitat apostada és diferent de 0 (si és 0 se suposarà que no la 
    vol modificar), es modificarà la quantitat a l’objecte de la classe Aposta i es mostrarà a 
    l’usuari un missatge de confirmació de la modificació de l’aposta. */
    
    public void opcioModificarAposta() throws ExcepcioApostaInexistent
    {
        String nomRecuperarAposta = Teclat.getString("Quin es el nom de l'aposta que vols modificar? ");
        Aposta apostaRecuperada = gAA.recuperarAposta(nomRecuperarAposta);
        if(apostaRecuperada != null){
            System.out.println("L'aposta actual es de "+apostaRecuperada.dinersApostats);
            int dinersModificats = Teclat.getInt("Quina aposta vols fer ara? (0[zero] per no fer res)");
            apostaRecuperada.setDinersApostats(dinersModificats);
            if(dinersModificats!=0)
            {
                System.out.println("La vostra aposta ha estat modificada amb èxit.");
            }
        }

    }
    
    /*— calcularTotalApostes(): Recuperarà l’arrai d’apostes (cridant al mètode getApostes de la 
classe GestioArraiApostes), calcularà la quantitat total, en euros, corresponent a totes les 
apostes, i la mostrarà per pantalla. */
    
    public void calcularTotalApostes()
    {
        ArrayList<Aposta> apostes = gAA.getArrayApostes();
        Iterator<Aposta> iterador = apostes.iterator();
        int totalApostes = 0;
            while(iterador.hasNext())
            {
                Aposta aposta = iterador.next();
                totalApostes += aposta.getDinersApostats();
                 
            }
        System.out.println("La quantitat total de diners es de "+totalApostes);
    }
}
