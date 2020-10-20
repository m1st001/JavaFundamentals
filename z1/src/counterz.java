import java.util.Scanner;

public class counterz {
    public static void main(String args[]){
        System.out.println("Input:");
        Scanner in = new Scanner(System.in);
        System.out.println("a");
        int a = in.nextInt();
        System.out.println("b");
        int b = in.nextInt();
        System.out.println("c");
        int c = in.nextInt();
        double z;
        z = ((a-3)*b/2)+c;
        System.out.print("Output "); System.out.print(z);
    }
}
