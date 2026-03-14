
/**
 * 2)<br>
 * Os atributos titular e saldo não estão encapsulados, violando o encapsulamento.<br>
 * 
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).<br>
 * 
 * Não há validação para valores negativos em depositar e sacar.<br>
 * 
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {

	String titular;
	double saldo;

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}
}