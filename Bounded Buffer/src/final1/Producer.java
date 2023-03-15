package final1;
public class Producer implements Runnable{
    private Buffer mybuffer;
    public Producer(Buffer mybuffer){
        this.mybuffer = mybuffer;
    }
    public void run(){
        while(true){
            try {
                mybuffer.put();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}