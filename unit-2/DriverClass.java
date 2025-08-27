class DriverClass {
    public static void main(String[] args) {
        // getting hold of the main thread reference
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread starts: " + mainThread);

        MyThread childThread1 = new MyThread();
        childThread1.setName("Rahul");
        childThread1.setPriority(Thread.MIN_PRIORITY);
        childThread1.start(); // start the child thread

        MyThread childThread2 = new MyThread();
        childThread2.setName("Rohan");
        childThread2.setPriority(Thread.MAX_PRIORITY);
        childThread2.start(); // start the child thread

        MyThread childThread3 = new MyThread("Simran");
        childThread3.setPriority(Thread.NORM_PRIORITY);
        childThread3.start(); // start the child thread

        for(int i=1; i<=5; i++){
            System.out.println("Main thread: " + i);
            try{
                Thread.sleep(2000); // sleep for 2 seconds
            }
            catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread ends: " + mainThread);
    }
}