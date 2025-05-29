import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int n = sc.nextInt();
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a Leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a Leap year");
        }

        sc.close();
    }
}
