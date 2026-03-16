import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projeto = scanner.nextLine();
        
        if (projeto.equals("Apollo")) {
            System.out.println("Em andamento");
        } else if (projeto.equals("Orion")) {
            System.out.println("Concluido");
        } else if (projeto.equals("Zeus")) {
            System.out.println("Pendente");
        } else if (projeto.equals("Hermes")) {
            System.out.println("Cancelado");
        } else {
            System.out.println("Projeto nao encontrado");
        }

        // TODO: Imprima o status correto do projeto consultado, conforme a tabela do enunciado.
        // Dica: Use condicionais para comparar o nome do projeto e definir a resposta.
    }
}