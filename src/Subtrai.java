public class Subtrai {
	// Declaração das propriedades / atributos
	public Double numero1;
	public Double numero2;

	// Constroi o objeto quando for instanciado
	public Subtrai(Double numero1, Double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Metodo que retorna a subtração de dois numeros
	public Double calculaSubtracao(Double num1, Double num2) {
		return num1 - num2;
	}
}