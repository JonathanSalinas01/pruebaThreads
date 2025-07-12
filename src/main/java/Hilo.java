public class Hilo extends Thread{
    private String nombre;

    public Hilo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            int x = (int) (Math.random() * 5000); //en esta variable se almacenara el tiempo en que el hilo "dormirá"
            Thread.sleep(x);
            System.out.println("Soy: " + this.nombre + "(" + x + ")"); //Luego de ese tiempo se ejecutará esta acción
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
