public class Hilo3 implements Runnable{
    private String nommbre;

    public Hilo3(String nommbre) {
        this.nommbre = nommbre;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nommbre + " - " + i);
            Thread.yield(); //Permite que el procesador elija que se ejecute otro hilo en estado ready
            //Lo hace de manera uniforme entre todos lo hilos
        }
    }
}
