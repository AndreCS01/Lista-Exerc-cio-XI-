import java.util.Scanner;

public class Calculadora01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /, ^, √): ");
        char operacao = scanner.next().charAt(0);

        double resultado = executarOperacao(num1, num2, operacao);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    private static double executarOperacao(double num1, double num2, char operacao) {
        Operacao op;
        switch (operacao) {
            case '+':
                op = new Soma();
                break;
            case '-':
                op = new Subtracao();
                break;
            case '*':
                op = new Multiplicacao();
                break;
            case '/':
                op = new Divisao();
                break;
            case '^':
                op = new Potenciacao();
                break;
            case '√':
                op = new RaizQuadrada();
                break;
            default:
                throw new IllegalArgumentException("Operação inválida!");
        }
        return op.calcular(num1, num2);
        }
        
    }
