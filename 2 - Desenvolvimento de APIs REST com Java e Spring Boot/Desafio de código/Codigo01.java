import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando = scanner.nextLine();

        if (comando.equals("GET_STATUS")) {
            System.out.println("API OK");
        } else if (comando.equals("GET_VERSION")) {
            System.out.println("v1.0.0");
        } else if (comando.equals("RESTART")) {
            System.out.println("RESTARTING");
        }   else {
            System.out.println("INVALID COMMAND");
        }
        // TODO: Imprima a resposta correta de acordo com o comando recebido
        // Dica: Use estrutura condicional para comparar o comando e imprimir a resposta esperada
    }
}