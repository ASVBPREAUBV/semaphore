/**
 * Created by paul on 29/01/2018.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Main main called");

        Semaphore Drehtüre = new Semaphore(1, "Drehtüre");
        Semaphore Barhocker = new Semaphore(5, "Barhocker");
        Semaphore Bestell_Wunsch = new Semaphore(0, "Bestell_Wunsch");
        Semaphore Getränk_fertig = new Semaphore(0, "Getränk_fertig");

        Barkeeper bar_keeper = new Barkeeper(Bestell_Wunsch, Getränk_fertig);
        Gast gast = new Gast(Drehtüre, Barhocker, Bestell_Wunsch, Getränk_fertig);
       /* Gast Gast2 = new Gast(Drehtüre, Barhocker);
        Gast Gast3 = new Gast(Drehtüre, Barhocker);
        Gast Gast4 = new Gast(Drehtüre, Barhocker);
        Gast Gast5 = new Gast(Drehtüre, Barhocker);
        Gast Gast6 = new Gast(Drehtüre, Barhocker);*/

    }
}
