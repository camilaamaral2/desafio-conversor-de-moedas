public class Moeda {

    String moedaEscolhida;
    String moedaConvertida;
    double valor;
    double resultado;

    public Moeda(String moedaEscolhida, String moedaConvertida) {
        this.moedaEscolhida = moedaEscolhida;
        this.moedaConvertida = moedaConvertida;
    }


    public void calcularConversao(double valor, double convertidaRate) {
        this.valor = valor;
        this.resultado = this.valor  * convertidaRate;
    }

    @Override
    public String toString() {
        return "Valor " + this.valor + " [" + this.moedaEscolhida + "] corresponde ao valor final de -> " + this.resultado + " [" + this.moedaConvertida + "]";
    }
}
