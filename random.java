import java.util.Random;

public class random {

    public static void main(String[] args) {

        /*
        A random is hasonló a Scannerhez, itt a Random osztályt kell behúzni*/
        Random rand = new Random();
        int veletlenEgytőlTiz = rand.nextInt(10-1+1)+1;//a nextInt()-be bekerük egy képlet.
                                                     //(felső-alsó+1)+alsó
        System.out.println(veletlenEgytőlTiz);

        //ha mondjuk száz és 200 között akarunk generálni, akkor az így néz majd ki
        int szaztolketszaz = rand.nextInt(200-100+1)+100;

        System.out.println(szaztolketszaz);

        //igazából csak erről volt szó ezzel kapcsolatban.
    }

}
