import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define Intervals For A");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        System.out.println("Define Intervals For B");
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println("Define The Number To Check");
        int x = scanner.nextInt();
        //  K1 -- x belongs to A
        boolean K1 = (x >= a1 && x <= a2);
        //  K2 -- x belongs to B
        boolean K2 = (x >= b1 && x <= b2);
        //  K3 --  x belongs to A\B
        boolean K3 = ((x >= a1 && x <= a2) && (!(x >= b1 && x <= b2)));
        // K4 -- x belongs to B\A
        boolean K4 = ((x >= b1 && x <= b2) && (!(x >= a1 && x <= a2)));
        //K5 -- x in intersection of A and B
        boolean K5 = ((x >= a1 && x <= a2) && ((x >= b1 && x <= b2)));
        //K6 x in union of A and B:
        boolean K6 = ((x >= a1 && x <= a2) || ((x >= b1 && x <= b2)));
        //K7 x in symm. diff. of A and B
        boolean K7 = ((((x >= a1) && (x <= a2)) || ((x >= b1) && (x <= b2))) && (!((x >= a1 && x <= a2) && (x >= b1 && x <= b2))));
        System.out.println("Interval A = [" + a1 + "," + a2 + "]");
        System.out.println("Interval B = [" + b1 + "," + b2 + "]");
        System.out.println("Enter x" + x);
        System.out.println("x in A:" + "                    " + K1);
        System.out.println("x in B:" + "                    " + K2);
        System.out.println("x in A-B:" + "                  " + K3);
        System.out.println("x in B-A:" + "                  " + K4);
        System.out.println("x  intersection of A and B:" + "                  " + K5);
        System.out.println("x in union of A and B:" + "                       " + K6);
        System.out.println("x in symm. diff. of A and B:" + "                 " + K7);
    }
}