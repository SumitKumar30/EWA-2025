// Custom threads using Thread class
public class MyThread extends Thread{
    private String threadName;

    // default constructor
    public MyThread(){
        this.threadName = Thread.currentThread().getName();
    }
    // parameterized constructor
    public MyThread(String threadName){
        this.threadName = threadName;
    }

    // overridden run method from Thread class
    @Override
    public void run(){
        // perform some task here
        for(int i=1; i<=5; i++){
            // generate some random number from 1 to 100
            int randomNum = (int)(Math.random() * 100) + 1;
            System.out.println(this.threadName+" generates Random number " + i + ": " + randomNum);
            try{
                Thread.sleep(5000); // sleep for 5 second
            }
            catch(InterruptedException e){
                System.out.println("Child thread interrupted");
            }
        }
        System.out.println("Child thread finished execution");
    }   
}
