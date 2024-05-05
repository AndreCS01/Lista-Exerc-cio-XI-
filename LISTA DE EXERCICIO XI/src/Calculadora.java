import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /, ^, √): ");
        char operacao = scanner.next().charAt(0);

        double resultado = calcular(num1, num2, operacao);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    private static double calcular(double num1, double num2, char operacao) {
        switch (operacao) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("Divisão por zero!");
                }
                return num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            case '√':
                if (num1 < 0) {
                    throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo!");
                }
                return Math.sqrt(num1);
            default:
                throw new IllegalArgumentException("Operação inválida!");
        }
    }
}
