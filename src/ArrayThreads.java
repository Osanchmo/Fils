/**
 * Created by 21753725a on 09/11/16.
 */
public class ArrayThreads {

    private int pos[] = new int[1000];
    private String noms[] = new String[1000];
    //Creem aquesta variable de forma global
    //per que cuan s'ompli un fil continui al següent.
    public static int finalPos = 0;

    /**
     * Omplim els arrays amb els parametres adequats
     * @param nom
     * @param valor
     * @param posic
     */
    public void omplirArray(String nom, int valor,int posic){
        this.pos[posic] = valor;
        this.noms[posic] = nom;
    }

    /**
     * Recorre l'array i el mostra per pantalla
     */
    public void imprimirArray(){
        for(int i = 0; i<1000;i++){
            System.out.println("en la posicio: " + i + " ha escrit el " + this.noms[i] + " el numero " + this.pos[i]);
        }
    }

}
