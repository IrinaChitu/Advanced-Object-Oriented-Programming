package examples.InterStatic;

public class Bunny implements Hop{
    public void printDetails(){
        System.out.println(Hop.getJumpHeight());
//        getJumpHeight(); // THIS WILL NOT COMPILE
    }
}
