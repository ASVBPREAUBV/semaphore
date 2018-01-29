/**
 * Created by paul on 29/01/2018.
 */

public class Semaphore {
    int counter;

    public Semaphore(int init_counter) {
        this.counter = init_counter;
    }

    public synchronized void my_wait() {
        counter++;
        notify();
    }


    public synchronized void signal() {
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