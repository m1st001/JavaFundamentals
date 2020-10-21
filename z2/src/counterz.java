import java.util.Scanner;

public class counterz {
    public static void main(String args[]) {
        System.out.print("Input:");
        Scanner in = new Scanner(System.in);
        System.out.println("a");
        int a = in.nextInt();
        System.out.println("b");
        int b = in.nextInt();
        System.out.println("c");
        int c = in.nextInt();
        System.out.println("Input complete");
        double res;
        res = (b+Math.sqrt(b*b+4*a*c))/(2*a)-(a^3*c+b^-2);
        System.out.println("Result: "); System.out.print(res);
    }
}
