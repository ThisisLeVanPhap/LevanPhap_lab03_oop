import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Error, n has to be bigger than 0");
            return;
        }

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Arr[" + i + "]: ");
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = sum / n;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("After sorting: ");
        for (double i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nSum: " + df.format(sum));
        System.out.print("Average: " + df.format(avg));
    }
}