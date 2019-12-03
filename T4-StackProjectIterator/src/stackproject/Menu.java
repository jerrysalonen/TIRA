/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: </p>
 *
 * <p>Company: Stadia</p>
 *
 * @author JPK
 * @version 1.0
 */
package stackproject;

import java.util.EmptyStackException;

public class Menu {
    //main alkaa-----------------------------------------------------------------------------
    public static void main(String[] args) {

        printMenu();

    }
    //main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
    private static void printMenu() {
        char select;
        System.out.println("Pinon koko:");
        int size = Lue.kluku();
        Stack s = new Stack(size); // pino-olio
        String data; // Pinon data-kenttä
        do {

            System.out.println("\n\t\t\t1. Alkion lisääminen.");
            System.out.println("\t\t\t2. Alkion poistaminen.");
            System.out.println("\t\t\t3. Pinon sisältö.");
            System.out.println("\t\t\t4. Alkioiden lukumäärä.");
            System.out.println("\t\t\t5. lopetus ");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
                case '1':
                    try {
                        System.out.println("Anna alkion sisältö (merkkijono)");
                        data = new String(Lue.rivi());
                        s.push(data);
                    } catch (StackOverflowError e) {
                        System.out.println(e);
                    }
                    break;
                case '2':
                    try {
                        ListItem item = s.pop();
                        System.out.println("Poistettu alkio: "+item.getmData());
                    } catch (EmptyStackException e) {
                        System.out.println(e);
                    }
                    break;
                case '3':
                    StackIterator si = s.iterator();
                    while (si.hasNext()) {
                        System.out.println(si.next().getmData());
                    }
                    break;
                case '4':
                    System.out.println("Lukumäärä = "+s.getmSize());
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
//printMenu loppuu ----------------------------------------------------------------
}
