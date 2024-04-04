import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1038 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double valor = 0;
   	int codigo = scanner.nextInt();
    int quantidade = scanner.nextInt();

    if (codigo == 1) {
      valor = 4 * quantidade;
      System.out.printf("Total: R$ %.2f\n", valor);

    } else if (codigo == 2) {
      valor = 4.5 * quantidade;
      System.out.printf("Total: R$ %.2f\n", valor);

    } else if (codigo == 3) {
      valor = 5 * quantidade;
      System.out.printf("Total: R$ %.2f\n", valor);

    } else if (codigo == 4) {
      valor = 2 * quantidade;
      System.out.printf("Total: R$ %.2f\n", valor);

    } else if (codigo == 5) {
      valor = 1.5 * quantidade;
      System.out.printf("Total: R$ %.2f\n", valor);
    }
  }
}
