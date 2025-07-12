public class Main{
    public static void main(String[] args) throws InterruptedException {
       /* Hilo hilo1 = new Hilo("HILO1");
        Hilo hilo2 = new Hilo("HILO2");
        Hilo hilo3 = new Hilo("HILO3");
        Thread hilo4 = new Thread(new Hilo2("HILO4"));
        Thread hilo5 = new Thread(new Hilo2("HILO5"));
        Thread hilo6 = new Thread(new Hilo2("HILO6"));



        hilo1.start(); //El método start invoca al método run de la clase Thread. La cual sobreescribimos en la clase Hilo
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();

        hilo1.join(); //Con el método join esperamos que todos los hilos finalicen
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();

        System.out.println("Final del programa!!!");
        */
        Thread t1 = new Thread(new Hilo3("POMPON"));
        Thread t2 = new Thread(new Hilo3("GATA"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
