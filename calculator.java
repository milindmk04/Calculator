import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        int b;
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        addition(a, b);
        subtraction(a, b);
        division(a, b);
        multiplication(a, b);
    }

    public static void addition(int a, int b) {
        System.out.println("Addition:"+(a+b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Substraction:"+(a-b));
    }

    public static void division(int a, int b) {
        System.out.println("Division:"+(a/b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("Multiplication:"+(a*b));
    }
}
