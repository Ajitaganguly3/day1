import Thread.Thread1;
import Thread.Thread2;

public class App {
    public static void main(String[] args) throws Exception {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();

    t1.start();
    t2.start();
    }

}
