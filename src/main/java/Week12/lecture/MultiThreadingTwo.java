package Week12.lecture;

public class MultiThreadingTwo implements Runnable{
    private int threadNum;
    public MultiThreadingTwo(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<=2; i++){
            MultriThreading myThing = new MultriThreading(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
