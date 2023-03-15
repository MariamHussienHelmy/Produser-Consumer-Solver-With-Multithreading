package final1;

public class Consumer implements Runnable{
    private Buffer mybuffer;
    public Consumer(Buffer mybuffer){
        this.mybuffer = mybuffer;
    }
    public void run(){
        while(true){
            try {
                mybuffer.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}