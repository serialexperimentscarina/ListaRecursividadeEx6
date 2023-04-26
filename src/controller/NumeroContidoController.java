package controller;

public class NumeroContidoController {

	public NumeroContidoController() {
		super();
	}
	
	public int numContido(int num, int digito) {
		// Condição de parada: Quando o número tiver 0 digitos (número inteiro foi percorrido)
		if (num == 0) {
			return 0;
		}
		// Relação de chamada dos passos: (Digito é igual ao ultimo digito do número?) + (Digito é igual ao ultimo digito do número / 10?) + (Digito é igual ao ultimo digito do número / 100?) + (Digito é igual ao primeiro digito do número?)
		return (num % 10 == digito ? 1 : 0) + numContido((num / 10), digito);
		
	}

}
