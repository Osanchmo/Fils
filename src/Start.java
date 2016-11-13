/**
 * Created by 21753725a on 09/11/16.
 */
public class Start {

    public static void main(String[] args) throws InterruptedException {
        //numero de fils que volem iniciar
        int longitud = 10;
        //l'objecte que conté els arrays per inicialitzar els fils
        ArrayThreads aux = new ArrayThreads();
        Thread fil[] = new Fils[longitud];


        for(int i = 0; i < longitud; i++){
            //generem un nom per el fil
            String nom = "Thread: " + i;
            //iniciem el fil
            fil[i] = new Fils(aux, nom);
            //inicia el fill (l'override de run)
            fil[i].start();
            //obliga al següent thread a esperar a aquest fil acabi
            fil[i].join();
        }
        //imprimim l'array
        aux.imprimirArray();
    }

}
