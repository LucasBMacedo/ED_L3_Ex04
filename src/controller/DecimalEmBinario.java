package controller;

public class DecimalEmBinario {

	public DecimalEmBinario() {
		super();
	}
	public String DecEmBin(int n) {
		if (n == 0) {
			return "0"; // Condicao de parada quando n for igual a 0 nao sera possivel dividir.
		}
		if (n == 1) {
			return "1"; // Pra evitar 0 a esquerda.
		}
		else {
			return DecEmBin(n/2) + (n % 2); /* Ira dividir n por 2 e ir concatenando os restos 
			de trás pra frete. */
		}
	}
}