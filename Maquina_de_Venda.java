
import java.util.Scanner;

public class Maquina_de_Venda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua compra: ");
        int preco = scanner.nextInt();
        System.out.println("Digite o valor pago: ");
        int valor = scanner.nextInt();

        if (valor < preco) {
            System.out.println("vai levar não, bicho");
        } else {
            // %= faz troco receber o resto da divisao
            int troco = valor - preco;
            System.out.printf("o seu troco e de %d reais", troco);
            int troco50 = troco / 50;
            troco %= 50;
            int troco20 = troco / 20;
            troco %= 20;
            int troco10 = troco / 10;
            troco %= 10;
            int troco5 = troco / 5;
            troco %= 5;
            int troco2 = troco / 2;
            troco %= 2;
            int troco1 = troco;

            if (troco50 > 0) {
                System.out.printf("\nnotas de 50: %d", troco50);
            }
            if (troco20 > 0) {
                System.out.printf("\nnotas de 20: %d", troco20);
            }
            if (troco10 > 0) {
                System.out.printf("\nnotas de 10: %d", troco10);
            }
            if (troco5 > 0) {
                System.out.printf("\nnotas de 5: %d", troco5);
            }
            if (troco2 > 0) {
                System.out.printf("\nnotas de 2: %d", troco2);
            }
            if (troco1 > 0) {
                System.out.printf("\nnotas de 1: %d", troco1);
            }

        }

    }
}
