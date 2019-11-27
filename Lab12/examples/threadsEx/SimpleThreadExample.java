package examples.threadsEx;

public class SimpleThreadExample extends Thread{
    public void run(){
        System.out.println("Thread"+ this.getName() +" is running");
    }
}
