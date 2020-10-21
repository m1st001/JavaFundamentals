import java.util.Scanner;

public class counterz {
    public static void main(String ags[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        System.out.println("x");
        int x = in.nextInt();
        System.out.println("y");
        int y = in.nextInt();
        double res;
        res = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))+Math.log(x*y);
        System.out.println("Result: "); System.out.print(res);

    }
}
