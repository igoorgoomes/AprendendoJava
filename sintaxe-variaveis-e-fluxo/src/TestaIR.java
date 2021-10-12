
public class TestaIR {
	public static void main(String[] args) {
		double salario = 4500.5;

		if (salario >= 0 && salario <= 1900.0) {
			System.out.println("Isento do IR");
		} else if (salario >= 1900.1 && salario <= 2800.0) {
			System.out.println("O seu alíquota é de 7,5% e pode deduzir na declaração o valor de R$142,00 reais");
		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("O seu alíquota é de 15% e pode deduzir na declaração o valor de R$350,00 reais");
		} else if (salario >= 3751.1 && salario <= 4664.0) {
			System.out.println("O seu alíquota é de 22,5% e pode deduzir na declaração o valor de R$636,00 reais");
		}
	}
}
