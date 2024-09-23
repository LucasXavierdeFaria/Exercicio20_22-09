import java.util.Scanner;

public class JogoInteracao {

    private JogoAdivinhacao jogo;
    private Scanner scanner;

    // Construtor
    public JogoInteracao(JogoAdivinhacao jogo) {
        this.jogo = jogo;
        this.scanner = new Scanner(System.in);
    }

    // Método para começar o jogo e lidar com a interação do usuário
    public void iniciarJogo() {
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        boolean acertou = false;

        while (!acertou) {
            System.out.print("Faça seu palpite: ");
            int palpite = scanner.nextInt();
            String resultado = jogo.fazerPalpite(palpite);
            System.out.println(resultado);
            if (resultado.contains("Parabéns")) {
                acertou = true;
            }
        }

        System.out.println("Fim de jogo. Você acertou após " + jogo.getTentativas() + " tentativas.");
    }
}
