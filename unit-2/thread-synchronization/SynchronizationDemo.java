public class SynchronizationDemo extends Thread{
    private String threadName;
    private CounterDemo counter;

    // default constructor
    // public SynchronizationDemo(){
    //     this.threadName = Thread.currentThread().getName();
    //     this.counter = new CounterDemo();
    // }
    // parameterized constructor
    public SynchronizationDemo(String threadName, CounterDemo counter){
        this.threadName = threadName;
        this.counter = counter;
    }

    // overridden run method from Thread class
    @Override
    public void run(){
        // perform some task here
        for(int i=1; i<=5; i++){
            // increment the count in a synchronized manner
            synchronized(counter) {
                counter.incrementCount();
                System.out.println(this.threadName+" incremented count to: " + counter.getCount());
            }

            // this results in incosistent count value
            // counter.incrementCount();
            // System.out.println(this.threadName+" incremented count to: " + counter.getCount());
            try{
                Thread.sleep(1000); // sleep for 1 second
            }
            catch(InterruptedException e){
                System.out.println("Child thread interrupted");
            }
        }
        System.out.println("Child thread: "+threadName+ " finished execution");
    }
    
}
