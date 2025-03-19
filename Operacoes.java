import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: " + "\n");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite um segundo número: " + "\n");
        double numero2 = scanner.nextDouble();
        System.out.println("Digite um dos símbolos a seguir para realizar uma operação matemática (+, -, *, / ou ^): " + "\n");
        String operador = scanner.next();
        switch (operador) {
                case "+" -> {
                double resultado = numero1 + numero2;
                    System.out.printf("O resultado da operação é: %.2f", resultado);
                }
                case "-" -> {
                double resultado = numero1 - numero2;    
                    System.out.printf("O resultado da operação é: %.2f", resultado);
                }
                case "*" -> {
                double resultado = numero1 * numero2;
                    System.out.printf("O resultado da operação é: %.2f", resultado);
                }
                case "/" -> {
                double resultado = numero1 / numero2;
                    System.out.printf("O resultado da operação é: %.2f", resultado);
                }
                case "^" -> {
                double resultado = (double) Math.pow(numero1, numero2);
                    System.out.printf("O resultado da operação é: %.2f", resultado);
                }
            
                default -> {
                    System.out.println("O símbolo da operação é inválido, tente novamente.");
                }
            }
        
 }
}