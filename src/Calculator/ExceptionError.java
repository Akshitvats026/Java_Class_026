package Calculator;

import java.util.Scanner;

public class ExceptionError {
    public static void main(String[] args) {
    int z =0;

        try {
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Two Integer: ");
            a = sc.nextInt();
            b = sc.nextInt();
            z = a / b;
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(z);
        }
    }
}
