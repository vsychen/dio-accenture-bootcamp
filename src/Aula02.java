import java.util.Scanner;

public class Aula02 {
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
    }

    public static void q1(Scanner s) {
        System.out.println("Digite um número: ");
        var a = s.nextInt();
        s.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d = %d \n", a, i, a*i);
        }
    }

    public static void q2(Scanner s) {
        System.out.println("Digite sua altura, em metros: ");
        var a = s.nextFloat();
        s.nextLine();
        System.out.println("Digite seu peso, em quilogramas: ");
        var b = s.nextFloat();
        s.nextLine();
        var imc = b/(a*a);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }

    public static void q3(Scanner s) {
        System.out.println("Digite um número: ");
        var a = s.nextInt();
        s.nextLine();
        System.out.println("Digite um segundo número, de valor maior que o primeiro: ");
        int b;
        do {
            b = s.nextInt();
            s.nextLine();
        } while (b < a);
        System.out.println("Você quer números pares ou ímpares?");
        var c = s.nextLine();
        var p = (c.equalsIgnoreCase("par") || c.equalsIgnoreCase("pares"));
        for (int i = b; i >= a; i--) {
            if ((p && i%2==0) || (!p && i%2==1)) {
                System.out.println(i);
            }
        }
    }
    public static void q4(Scanner s) {
        System.out.println("Digite um número: ");
        var a = s.nextInt();
        s.nextLine();
        int b;
        do {
            System.out.println("Digite um outro número, maior que o primeiro número. (Continua até que o segundo número, dividido pelo primeiro, tenha resto diferente de 0).");
            b = s.nextInt();
            s.nextLine();
        } while (b<a || b%a==0);
        s.close();
    }
}
