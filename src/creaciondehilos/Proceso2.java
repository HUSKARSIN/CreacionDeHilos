package creaciondehilos;

public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("PROCESO 2");
        }
    }
}
