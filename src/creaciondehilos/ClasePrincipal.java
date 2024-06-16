package creaciondehilos;

/* Sin Hilos */
public class ClasePrincipal {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 5; i++) {
            System.out.println("PROCESO 1");
        }
        System.out.println("");

        for (int i = 0; i <= 5; i++) {
            System.out.println("PROCESO 2");
        }*/
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2());
        
        hilo1.start();
        hilo3.start();
        hilo2.start();
    }
}
