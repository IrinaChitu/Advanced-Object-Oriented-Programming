package examples.threadsEx;

public class ThreadWithRunnable{
    public static void main(String args[]){
        int n = 2; // Number of threads
        for (int i=0; i<n; i++)
        {
            Thread object = new Thread(new RunnableImpl());
            object.start();
        }
    }
}

class RunnableImpl implements Runnable{
    public void run(){
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // Throwing an exception
            System.out.println (e.getCause() + e.getMessage());
        }

    }
}
