import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum integer to check: ");
        int maxInteger = scanner.nextInt();

        boolean[] isComposite = new boolean[maxInteger + 1];
        for (int i = 2; i * i <= maxInteger; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= maxInteger; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        System.out.println("Prime numbers up to " + maxInteger + ":");
        for (int i = 2; i <= maxInteger; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
