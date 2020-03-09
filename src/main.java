public class main {
    public static void main(String[] args) {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();

        t1.start();
        try {
            t1.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
    }
}
