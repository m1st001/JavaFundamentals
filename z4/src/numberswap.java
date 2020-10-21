import java.util.Scanner;

public class numberswap {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        float inp;
        double res;
        inp = scan.nextFloat();
        double a;
        a = Math.floor(inp);
        double b;
        System.out.println(a);
        b = Math.floor((inp - a)*1000);
        System.out.println(b);
        res = b+(a/1000);
        System.out.println("Result- ");System.out.print(res);
    }
}
