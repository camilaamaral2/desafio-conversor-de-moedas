import java.io.IOException;
import java.util.Scanner;

public class Escolha {
    public Api conversor;
    Scanner leitura = new Scanner(System.in);
    public Escolha() {
        this.conversor = new Api();
    }

    public void exibirMenu() throws IOException, InterruptedException {
        boolean sair = false;

        while (!sair) {
            imprimirOpcoes();
            int opcao = leitura.nextInt();

            System.out.println("Digite o valor que deseja converter: ");
            double valorDigitado = leitura.nextDouble();

            switch (opcao) {
                case 1:
                    conversor.api("USD", "ARS", valorDigitado);
                    break;
                case 2:
                    conversor.api("ARS", "USD", valorDigitado);
                    break;
                case 3:
                    conversor.api("USD", "BRL", valorDigitado);
                    break;
                case 4:
                    conversor.api("BRL", "USD", valorDigitado);
                    break;
                case 5:
                    conversor.api("USD", "COP", valorDigitado);
                    break;
                case 6:
                    conversor.api("COP", "USD", valorDigitado);
                    break;
                case 7:
                    conversor.api("USD", "CLP", valorDigitado);
                    break;
                case 8:
                    conversor.api("CLP", "USD", valorDigitado);
                    break;
                case 9:
                    sair = true;
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void imprimirOpcoes() {
        System.out.println("*********************************");
        System.out.println("Escolha alguma conversão:");
        System.out.println("1) Dólar -> Peso argentino");
        System.out.println("2) Peso argentino -> Dólar");
        System.out.println("3) Dólar -> Real brasileiro");
        System.out.println("4) Real brasileiro -> Dólar");
        System.out.println("5) Dólar -> Peso colombiano");
        System.out.println("6) Peso colombiano -> Dólar");
        System.out.println("7) Dolár -> Peso chileno");
        System.out.println("8) Peso chileno -> Dólar");
        System.out.println("9) Sair");
        System.out.println("*********************************");
    }
}