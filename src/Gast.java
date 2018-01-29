/**
 * Created by paul on 29/01/2018.
 */
public class Gast {
    public Gast(Semaphore Drehtüre, Semaphore Barhocker, Semaphore Bestell_Wunsch, Semaphore Getränk_fertig) {
        //<die Bar betreten >;
        Drehtüre.my_wait();
        Drehtüre.signal();

        //<auf Hocker Platz nehmen>;
        Barhocker.my_wait();
        Barhocker.signal();

        for (int Getränke = 0; Getränke < 3; Getränke++) {
            //Bestellung aufgeben
            //Zubereitung abwarten
            //Bestell_Wunsch.my_wait();
            //Getränk_fertig.my_wait();

        }
        //<die Bar verlassen >;
        Drehtüre.signal();
        Drehtüre.my_wait();
    }
}
