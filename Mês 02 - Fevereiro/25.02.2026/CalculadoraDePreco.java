
/**
 * 1)<br>
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.<br>
 * 
 * Violação do princípio aberto/fechado.<br>
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco {

	public static double calcular(double preco) {
		double resultado = preco;
		resultado = resultado + (preco * 0.10);
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(calcular(100));
	}
}
