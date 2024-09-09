package target_solucoes;
import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número ao usuário
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        // Verificando se o número pertence a sequência de Fibonnaci
        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        //Fechando o leitor
        scanner.close();
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        // Caso o número seja menor que 0, não pode pertencer à sequência de Fibonacci
        if (num < 0) {
            return false;
        }
        
        //Inicializando os dois primeiros números da sequências
        int a = 0;
        int b = 1;
        
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        // Verifica se o número é um dos primeiros dois números da sequência
        if (num == a || num == b) {
            return true;
        }
        
        // Gera a sequência de Fibonacci e verifica se o número pertence à sequência
        while (b <= num) {
            int proximo = a + b;
            System.out.print(proximo + ", ");
            a = b;
            b = proximo;
            
            if (b == num) {
            	System.out.println();
                return true;
            }
        }
        
        // Se o número não foi encontrado, não pertence à sequência
        return false;
    }
}
