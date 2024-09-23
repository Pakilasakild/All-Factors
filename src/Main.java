import java.util.Scanner;

public class Main {
    public static void printFactors(int a) {
        if (a < 1) {
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        printFactors(a);
    }
}