package target_solucoes;
import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar uma string
        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine();

        // Conta as ocorrências da letra 'a' e 'A'
        int contagem = contarA(palavra);

        // Verifica a existência da letra 'a' ou 'A' e exibe a contagem
        if (contagem > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contagem + " vez(es) na string " + palavra + ".");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string "  + palavra + ".");
        }

        scanner.close();
    }

    // Função para contar a quantidade de vezes que 'a' ou 'A' aparece na string
    public static int contarA(String str) {
        int contagem = 0;

        String strLower = str.toLowerCase();

        // Percorrendo cada caractere da String
        for (char c : strLower.toCharArray()) {
            // Incrementando a contagem se o caractere for 'a'
            if (c == 'a') {
                contagem++;
            }
        }

        return contagem;
    }
}
