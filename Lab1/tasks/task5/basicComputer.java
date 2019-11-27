package tasks.task5;
import java.util.Scanner;

public class basicComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = 0;

        switch(operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        if(result == Math.round(result)) {
            System.out.println((int)result);
        }
        else
            System.out.println(result);
    }

}
