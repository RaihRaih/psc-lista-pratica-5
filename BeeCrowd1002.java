import java.util.Scanner;

public class BeeCrowd1002  {
    public static void main(String[] args){
        double R,A;
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextDouble();
        A = 3.14159 * R * R;
        System.out.printf("A=%.4f\n",  A);
   }
}
