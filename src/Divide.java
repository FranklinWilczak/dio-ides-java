public class Divide {
	// Declaração das propriedades / atributos
	public Double numero1;
	public Double numero2;

	// Constroi o objeto quando for instanciado
	public Divide(Double numero1, Double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Metodo que retorna a divisão de dois numeros
	public Double calculaDivisao(Double num1, Double num2) {
		return num1 / num2;
	}
}