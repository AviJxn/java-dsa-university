import java.util.Scanner;

public class Q03_PrintEvenNumbers {
    static void printEven(int current, int n) {
        if (current > n) return;
        System.out.print(current);
        if (current + 2 <= n) System.out.print(" ");
        printEven(current + 2, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(2, n);
        System.out.println();
        sc.close();
    }
}
