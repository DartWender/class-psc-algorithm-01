import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pontosAlegria = 0;
        int pontosTristeza = 0;

        // Amizades
        System.out.print("Quantas amizades Riley fez na nova cidade? ");
        int amizades = sc.nextInt();

        if (amizades > 0) {
            pontosAlegria += amizades * 10;
        } else {
            pontosTristeza += 30;
        }

        // Provas
        System.out.print("Digite a nota da prova A1 (0 a 10): ");
        double A1 = sc.nextDouble();
        System.out.print("Digite a nota da prova A2 (0 a 10): ");
        double A2 = sc.nextDouble();
        System.out.print("Digite a nota da prova A3 (0 a 10): ");
        double A3 = sc.nextDouble();

        double media = (A1 + A2 + A3) / 3.0;

        if (media >= 7) {
            pontosAlegria += 50;
        } else {
            pontosTristeza += 50;
        }

        // Exercícios de programação
        System.out.print("Quantos dos 10 exercícios Riley conseguiu resolver? ");
        int exerciciosFeitos = sc.nextInt();
        int exerciciosNaoFeitos = 10 - exerciciosFeitos;

        pontosAlegria += exerciciosFeitos * 10;
        pontosTristeza += exerciciosNaoFeitos * 10;

        // Resultado final
        if (pontosAlegria > pontosTristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        sc.close();
    }
}
