import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count = 0;
        double sum = 0;

        System.out.print("Enter a positive integer: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i +" ");
                count++;
                sum += i;
            }
        }

        if (count > 0) {
            System.out.println("\nThe average of numbers that are divisible by 3 and 4 between 0 and " + n + " is: " + (sum / count));
        } else {
            System.out.println("There are no numbers divisible by both 3 and 4 between 0 and " + n);
        }

    }
}

