/**
 * Created by paul on 29/01/2018.
 */

public class Semaphore {

    int counter;
    String name;

    public Semaphore(int init_counter, String name) {
        this.counter = init_counter;
        this.name = name;
        //log.info("Init");
        //System.out.println("class name is: " + this.toString());
    }

    public synchronized void my_wait() {
        System.out.println(name + "_my_wait");
        counter++;
        notify();
    }


    public synchronized void signal() {
        System.out.println(name + "_signal");

        try {
            while (counter == 0) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter--;
    }

    public void log() {
        System.out.println(this.counter);
    }


}