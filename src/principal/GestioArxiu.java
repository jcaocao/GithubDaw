/*
 * Classe GestioArxiu 
Contindrà els mètodes que permeten accedir a l’arxiu. Només es podrà accedir a l’arxiu a 
través dels mètodes d’aquesta classe. L’arxiu a llegir/gravar haurà de contenir en la seva 
primera línia el número de registres que conté l’arxiu, i en les següents línies, cadascun dels  
camps (nom de l’apostant i quantitat apostada) dels registres, un camp per línia. La classe 
GestioArxiu no tindrà atributs ni constructor i només contindrà dos mètodes estàtics: 
 */
package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author cep
 */
public class GestioArxiu {
    
    public static ArrayList<Aposta> array = new ArrayList<Aposta>();
    public static Aposta a;
    
   /* — llegirArxiu: No rebrà paràmetres i retornarà un objecte de la classe ArrayList amb les 
    apostes llegides des de l’arxiu. Si l’arxiu existeix, llegirà les dades de l’arxiu en un ArrayList 
    d’apostes i el retornarà; si l’arxiu no existeix, es mostrarà un missatge informatiu a l’usuari i 
    es retornarà el mateix objecte de la classe ArrayList, però sense cap element. */
    public static ArrayList llegirArxiu()
    {
        String nom;
        int quantitat;
        String quantitatStr;
        String longitudArrayStr;
        int i =0;
        
        try{
            BufferedReader entrada = new BufferedReader(
                                     new FileReader ("apostes.txt"));
            
        longitudArrayStr = entrada.readLine();
        int longitudArray = Integer.parseInt(longitudArrayStr);
        while( i < longitudArray){
            
            nom=entrada.readLine();
            quantitatStr = entrada.readLine();
            quantitat=Integer.parseInt(quantitatStr);
            
            //Pasar campos al objeto a
            a = new Aposta(nom, quantitat);
            array.add(a);
            i++;
            //Imprmir a
            //System.out.println(a);
        }
            
        System.out.println("Imprimiendo ArrayList");
        ListIterator it = array.listIterator();
        while(it.hasNext()){
             System.out.println(it.next());
        }
        
        //Cerrar el fichero
        if(entrada!=null){
            entrada.close();
        }
        }
        catch(FileNotFoundException ex){
            System.err.println("No existe el fichero");
            ex.printStackTrace();
        }
        catch(IOException ex){
            System.err.println("Error de E/S");
            ex.printStackTrace();
        }
        
           
        return array;
    }
    
    /*— guardarArxiu: Rebrà com a paràmetre un ArrayList amb les dades de les apostes i no 
    retornarà res. El mètode guardarà les dades de l’ArrayList en l’arxiu. Si no es pot gravar, es 
    mostrarà a l’usuari un missatge informatiu. */
    public static void guardarArxiu(ArrayList array)
    {
        
        File f;
        f = new File("apostes.txt");
        int longitudArray = array.size();
        String longitudArrayStr = Integer.toString(longitudArray);

            //Escribir con buffer para hacerlo linea a linea
            FileWriter flujoSalida = null;
            BufferedWriter salida = null;
            try{
                flujoSalida = new FileWriter(f);
                salida = new BufferedWriter(flujoSalida);
                
                salida.write(longitudArrayStr);
                salida.newLine();
                Iterator<Aposta> iterador = array.iterator();
                while(iterador.hasNext())
                {
                    a = iterador.next();
                    salida.write(a.nomApostant);
                    salida.newLine();
                    salida.write(Integer.toString(a.dinersApostats));
                    salida.newLine();
                }
                salida.close();
                flujoSalida.close();
            }
            catch(IOException ex){
            System.err.println("Error de E/S");
            ex.printStackTrace();
            }
            finally{
                try{                                    
                    salida.close();
                    flujoSalida.close();
                }
                catch(IOException ex){
                    System.out.println("Error de E/S");
                    ex.printStackTrace();
                }
            }
        
    }
}
