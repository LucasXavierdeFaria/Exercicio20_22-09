public class Main {
    public static void main(String[] args) {
        // Criando um novo jogo de adivinhação com números entre 1 e 100
        JogoAdivinhacao jogo = new JogoAdivinhacao(100);

        // Criando a interação do jogo
        JogoInteracao interacao = new JogoInteracao(jogo);

        // Iniciando o jogo
        interacao.iniciarJogo();
    }
}
