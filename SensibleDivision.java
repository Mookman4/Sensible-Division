import java.util.Scanner;

public class SensibleDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("This number is divisible by 2");
        } else if (n % 3 == 0) {
            System.out.println("This number is divisible by 3");

        } else if (n % 5 == 0) {
            System.out.println("This number is divisible by 5");
        } else {
            System.out.println("This number is undetermined");
        }
    }
}

