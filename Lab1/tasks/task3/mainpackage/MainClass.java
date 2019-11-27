package tasks.task3.mainpackage;
import tasks.task3.packagea.Main;

//import tasks.task3.packageb.Main; //ar da eroare pt ca au ac nume

public class MainClass {            //de asemenea am schimbat si aici numele ca sa nu fie main main
    public static void main(String[] args) {
        showPackage();
    }
    public static void showPackage() {
        Main.showPackage();
        tasks.task3.packageb.Main.showPackage();
    }
}
