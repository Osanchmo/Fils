import java.util.Random;

public class Fils extends Thread {

    //inicialitzem Random per a generar numeros aleatoris
    Random rd = new Random();
    //inicialitzem l'array per a poder escriure sobre ell
    ArrayThreads arr= null;

    /**
     * Constructor amb el nom del thread y l'objecte array
     * @param arr
     * @param name
     */
    public Fils(ArrayThreads arr, String name) {
        this.arr = arr;
        this.setName(name);
    }

    /**
     * Cuan iniciem el fil iniciará les següents accions
     */
    public void run() {
        //Genera un enter random y l'escriu emmagatzemant el Thread que ho ha fet
        for (int i = 0;i<100;i++){
            int temp = rd.nextInt(10);
            //ens ajudarem amb una variable global perque no torni el contador a 0
            arr.omplirArray(this.getName(),temp,ArrayThreads.finalPos);
            ArrayThreads.finalPos++;
        }
    }
}
