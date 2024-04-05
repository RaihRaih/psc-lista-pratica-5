import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < N; i++) {
            int quantidade = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            totalCobaias += quantidade;

            switch (tipo) {
                case 'C':
                    totalCoelhos += quantidade;
                    break;
                case 'R':
                    totalRatos += quantidade;
                    break;
                case 'S':
                    totalSapos += quantidade;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        double percentualCoelhos = (double) totalCoelhos / totalCobaias * 100;
        double percentualRatos = (double) totalRatos / totalCobaias * 100;
        double percentualSapos = (double) totalSapos / totalCobaias * 100;

        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

        scanner.close();
    }
}
