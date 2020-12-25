import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for a ");
        int a = sc.nextInt();
        System.out.println("Enter a number for b ");
        int b = sc.nextInt();
        System.out.println("Enter a number for c ");
        int c = sc.nextInt();

        if (a == b && b != c) {
            System.out.println("OK");
        } else if (a == c && a != b) {
            System.out.println("OK");
        } else if (b == c && b != a) {
            System.out.println("OK");
        } else
            System.out.println("NOT OK");
    }
}

