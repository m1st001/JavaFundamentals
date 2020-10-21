import java.util.Scanner;

public class squarecoords {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean res;
        System.out.println("Input coordinates: ");
        System.out.println("x"); int x = scan.nextInt();
        System.out.println("y"); int y = scan.nextInt();
        //
        if (y>=-3 && y<=4 && Math.abs(x)<=4){
            if (y>=0 && Math.abs(x)>=2){
                res = false;

            }
            else{
                if (y==0 && x==-1){
                    res = false;
                }
                else{
                    res = true;
                }
            }

        }
        else{
            res = false;
        }
        System.out.println(res);

    }
}
