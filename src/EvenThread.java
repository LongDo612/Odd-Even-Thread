public class EvenThread extends Thread{
    synchronized public void run() {
        for (int i=1;i<=10;i++) {
            if (i%2==0) {
                try {
                    System.out.println(i);
                    Thread.sleep(15);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
