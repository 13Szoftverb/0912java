/*Kell importálni a java.util.Scanner osztályt ahoz, hogy a felhasználó által beírt dolgokat tudjuk használni*/
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        /* A mai órán a scanner és Random osztályokkal foglalkoztunk.

        Ezekkel a felhasználót be tudjuk vonni a programba, és véletlenszerű számot tudunk generálni

        */
        //szintaktika az scanner név = new Scanner(system.in).
        // A scanner az egy osztály, így a new szóval új objektumot hozunk létre
        Scanner felhasznaloInput = new Scanner(System.in);

        //ezekután nevén nevezve tudjuk hívni ezt.
        int Szam = felhasznaloInput.nextInt();//a nextInt() csak annyit tesz,
                                              // hogy int-vé alakítja a beírt stringet.
                                              // ugyanez igaz az összes többire, nextDouble(), és next()-re is

        System.out.println("Ezt írtad be "+Szam);

        //hogy a felhasználó tudja, hogy mi a rosz sebet kérünk tőle, érdemes egy printtel elmondani.
        //Próbáljuk meg újra


        System.out.println("");
        System.out.println("");

        System.out.print("Kérem adjin meg egy számot! >>>");


        Szam = felhasznaloInput.nextInt();
        System.out.println("Ezt írtad be "+Szam);
        System.out.println("");
        System.out.println("");
        /*
        Int mellett double-t és stringet is be lehet kérni.
        */

        System.out.print("írjon be egy tizedes számot! >>>");
        double tizedes = felhasznaloInput.nextDouble();
        System.out.println("Ezt írtad be "+tizedes);
        System.out.println("");
        System.out.println("");

        //ha itt input mismatch hibát kapsz, az azért van, mert a gép a pontot(.) veszi tizedesvesszőnek
        //nem a vesszőt

        /*
        Ha stringet akarunk bevenni, az picit másabb, mert ha csak simán a next()-et hasznéljuk, akkor a szóköznél
        abbahagyja az inputot. ezért kell a useDelimiter()-t használni. A useDelimiter() arra jó, hogy megváltoztatja azt
        hogy hol hagyja abba a program az inputot.
        */

        System.out.print("Hogy Hívják? >>>");
        felhasznaloInput.useDelimiter("\n");
        String szoveg = felhasznaloInput.next();

        System.out.println(szoveg);

        System.out.println("");
        System.out.println("");


        //Érdekességképp lehet több delimitert is beletenni ha "|\\n" elé írjuk amit akarunk
    }
}