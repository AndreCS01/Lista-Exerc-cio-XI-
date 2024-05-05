public class RaizQuadrada extends Operacao {

    @Override
    public double calcular(double num1, double num2) {
        if (num1 < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo!");
        }
        return Math.sqrt(num1);
    }
}
