
import java.util.Scanner;

public class Circulo_Esfera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo ou espera: ");
        double raio = scanner.nextDouble();
        System.out.println("Agora escolha entre as opções de 1 a 3: \n1: calcular e imprimir o perímetro do círculo. \n2: calcular e imprimir a área do círculo. \n3: calcular e imprimir o volume da esfera.");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1 -> {
                double perimetro = 2 * Math.PI * raio;
                System.out.printf("O perímetro do círculo de raio %.2f é igual a: %.2f", raio, perimetro);
            }
            case 2 -> {
                double area = Math.PI * (Math.pow(raio, 2));
                System.out.printf("A área do círculo de raio %.2f é igual a: %.2f", raio, area);
            }
            case 3 -> {
                double volume = 4 / 3 * Math.PI * Math.pow(raio, 3);
                System.out.printf("O volume da esfera de raio %.2f é igual a: %.2f", raio, volume);
            }
            default -> {
                System.out.println("Você escolheu uma opção invalida: ");
            }
        }
        scanner.close();
    }
}
