public class OddThread extends Thread{
    synchronized public void run() {
        for (int i=1;i<=10;i++) {
            if (i%2==1) {
                try {
                    System.out.println(i);
                    Thread.sleep(10);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
