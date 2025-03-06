import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Insira um operador (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        int resultado;
        boolean operacaoValida = true;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Não é possivel dividir por zero!");
                    resultado = 0;
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação invalida, digite um operador valido!");
                operacaoValida = false;
                resultado = 0;
        }
        if(operacaoValida) {
            System.out.println("O resultado de " + num1 + " " + op + " " + num2 + " = " + resultado);
        }
    }
}