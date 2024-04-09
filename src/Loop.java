import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a avaliação do filme: ");
            nota = scan.nextDouble();
            mediaAvaliacao += + nota;
        }

        System.out.printf("Média de avaliações " + mediaAvaliacao/3);
    }
}
