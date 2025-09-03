public class SyncDriverClass {
    public static void main(String[] args) {
        CounterDemo counter = new CounterDemo();

        SynchronizationDemo thread1 = new SynchronizationDemo("Thread-1", counter);
        SynchronizationDemo thread2 = new SynchronizationDemo("Thread-2", counter);

        thread1.start();
        thread2.start();


        // to ensure main thread waits for child threads to finish
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
