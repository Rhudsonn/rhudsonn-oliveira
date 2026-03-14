
/**
 * 2)<br>
 * Os atributos titular e saldo não estão encapsulados, violando o
 * encapsulamento.<br>
 * 
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).<br>
 * 
 * Não há validação para valores negativos em depositar e sacar.<br>
 * 
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {

	// Atributos encapsulados
	private String titular;
	private double saldo;

	/**
	 * Realiza um depósito na conta bancária.
	 * 
	 * @param valor O valor a ser depositado. Deve ser maior que zero.
	 * @throws IllegalArgumentException Se o valor for menor ou igual a zero.
	 */
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}

		saldo += valor;
	}

	/**
	 * Realiza um saque da conta bancária.
	 * 
	 * @param valor O valor a ser sacado. Deve ser maior que zero e não exceder o saldo.
	 * @throws IllegalArgumentException Se o valor for menor ou igual a zero ou se houver saldo insuficiente.
	 */
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}

		saldo -= valor;
	}
}