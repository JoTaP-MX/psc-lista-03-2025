
import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o valor de a: ");
        a = scanner.nextInt();
        System.out.println("Digite o valor de b: ");
        b = scanner.nextInt();
        System.out.println("Digite o valor de c: ");
        c = scanner.nextInt();
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau");
            double x = -c / b;
            System.out.printf("O resultado da equação de 1°grau é: %.2f", x);
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raiz = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("As raizes da equação do 2°grau são: %2f", raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("As raizes da equação do 2°grau são: %.2f e %.2f", raiz, raiz2);
            }
        }
        scanner.close();
    }
}
