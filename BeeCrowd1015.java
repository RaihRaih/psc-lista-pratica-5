import java.util.Scanner;
public class BeeCrowd1015 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double x1,x2,y1,y2,distancia;

x1 = scanner.nextDouble();
y1 = scanner.nextDouble();
x2 = scanner.nextDouble();
y2 = scanner.nextDouble();
distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
System.out.printf("%.4f\n", distancia);
    }
    
}
