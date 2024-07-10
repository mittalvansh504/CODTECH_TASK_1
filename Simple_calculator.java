import java.util.*;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double a = sc.nextDouble();
        System.out.print("Enter second number:- ");
        double b = sc.nextDouble();
        System.out.print("Enter the operation which you want to do from (+, -, *, /):- ");
        char o = sc.next().charAt(0);
        double op=0;
        switch (o) {
            case '+':
                op = a+b;
                break;
            case '-':
                op = a-b;
                break;
            case '*':
                op = a*b;
                break;
            case '/':
                op = a/b;
                break;
            default:
                System.out.println("You enter the wrong value");
                break;
            }
        System.out.println("Answer is:- " + op);
    }

}
