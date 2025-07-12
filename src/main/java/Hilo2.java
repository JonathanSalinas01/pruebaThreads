public class Hilo2 implements Runnable{
    private String nombre;

    public Hilo2(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void run() {
        try {
            int x = (int) (Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy: " + this.nombre + " (" + x + "). Desde Hilo2");
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
