
public class ThreadDemo {
    public static void main(String[] args) {
        // int [] arr = {5, 3, 8, 1, 2};
        // System.out.println("Element at index 5: " + arr[5]);

        // get the name of the current thread
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread: " + threadName);

        // // get a reference to main thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread: " + mainThread);

        mainThread.setName("John");
        System.out.println("After name change: " + mainThread);

        try{
            mainThread.sleep(5000); // sleep for 5 seconds
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("After 5 seconds sleep");
    }    
}
