package final1;
public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Buffer myQueue = new Buffer();
        Producer producer0 = new Producer(myQueue);
        Consumer consumer0 = new Consumer(myQueue);
        Producer producer1 = new Producer(myQueue);
        Consumer consumer1 = new Consumer(myQueue);
        Producer producer2 = new Producer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer3 = new Producer(myQueue);
        Consumer consumer3 = new Consumer(myQueue);


        Thread Producer0Thread = new Thread(producer0);
        Producer0Thread.start();

        Thread Consumer0Thread = new Thread(consumer0);
        Consumer0Thread.start();

        Thread Producer1Thread = new Thread(producer1);
        Producer1Thread.start();

        Thread Consumer1Thread = new Thread(consumer1);
        Consumer1Thread.start();

        Thread Producer2Thread = new Thread(producer2);
        Producer2Thread.start();

        Thread Consumer2Thread = new Thread(consumer2);
        Consumer2Thread.start();

        Thread Producer3Thread = new Thread(producer3);
        Producer3Thread.start();

        Thread Consumer3Thread = new Thread(consumer3);
        Consumer3Thread.start();

        Producer0Thread.join();
        Consumer0Thread.join();
        Producer1Thread.join();
        Consumer1Thread.join();
        Producer2Thread.join();
        Consumer2Thread.join();
        Producer3Thread.join();
        Consumer3Thread.join();

    }
}