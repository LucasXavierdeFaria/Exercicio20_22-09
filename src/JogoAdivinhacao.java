import java.util.Random;

public class JogoAdivinhacao {
    private int numeroAleatorio;
    private int tentativas;

    // Construtor que inicializa o número aleatório e as tentativas
    public JogoAdivinhacao(int limite) {
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(limite) + 1; // Número aleatório entre 1 e limite
        this.tentativas = 0;
    }

    // Método para processar o palpite do jogador e dar feedback
    public String fazerPalpite(int palpite) {
        tentativas++;
        if (palpite == numeroAleatorio) {
            return "Parabéns! Você acertou o número em " + tentativas + " tentativas.";
        } else if (palpite < numeroAleatorio) {
            return "O número é maior que " + palpite + ". Tente novamente!";
        } else {
            return "O número é menor que " + palpite + ". Tente novamente!";
        }
    }

    // Método para obter o número de tentativas
    public int getTentativas() {
        return tentativas;
    }
}
