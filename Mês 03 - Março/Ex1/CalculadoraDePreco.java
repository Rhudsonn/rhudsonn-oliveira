
/**
 * 1)<br>
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.<br>
 * 
 * Violação do princípio aberto/fechado.<br>
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco {

	// Constante que define a alíquota do imposto federal
	private static final double IMPOSTO_FEDERAL = 0.10;

	public static double calcular(double preco) {
		double resultado = preco;
		// Calcula e adiciona o imposto federal ao preço original
		resultado = resultado + (preco * IMPOSTO_FEDERAL);
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(calcular(100));
	}
}
