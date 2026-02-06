import java.time.Year;
import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Questão 1: ");
        q1(s);

        System.out.println("Questão 2: ");
        q2(s);

        System.out.println("Questão 3: ");
        q3(s);

        System.out.println("Questão 4: ");
        q4(s);
        s.close();
    }

    public static void q1(Scanner s) {
        var baseYear = Year.now().getValue();
        System.out.println("Digite seu nome: ");
        var a = s.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        var b = s.nextInt();
        s.nextLine();
        System.out.printf("Olá %s, você tem %d anos (se você já tiver feito aniversário esse ano). \n", a, baseYear-b);
    }

    public static void q2(Scanner s) {
        System.out.println("Qual o tamanho do lado do quadrado?");
        var a = s.nextInt();
        s.nextLine();
        System.out.printf("A área do quadrado é de %d \n", a*a);
    }

    public static void q3(Scanner s) {
        System.out.println("Qual o tamanho da base do retângulo?");
        var a = s.nextInt();
        s.nextLine();
        System.out.println("Qual o tamanho da altura do retângulo?");
        var b = s.nextInt();
        s.nextLine();
        System.out.printf("A área do quadrado é de %d \n", a*b);
    }

    public static void q4(Scanner s) {
        System.out.println("Digite seu nome, usuário 1: ");
        var a = s.nextLine();
        System.out.printf("Digite sua idade, %s: ", a);
        var b = s.nextInt();
        s.nextLine();
        System.out.println("Digite seu nome, usuário 2: ");
        var c = s.nextLine();
        System.out.printf("Digite sua idade, %s: ", c);
        var d = s.nextInt();
        s.nextLine();
        var e = b-d;
        if (e < 0) {
            System.out.printf("Olá %s e %s, a diferença de idade entre vocês dois é de %s anos \n", a, c, -e);
        } else {
            System.out.printf("Olá %s e %s, a diferença de idade entre vocês dois é de %s anos \n", a, c, e);
        }
    }
}