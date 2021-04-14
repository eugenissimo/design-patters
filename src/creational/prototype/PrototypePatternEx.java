package creational.prototype;

public class PrototypePatternEx {

	public static void main(String args[]) throws CloneNotSupportedException {

		Carro chevrolet = new Chevrolet("Cruze Sport v6");
		chevrolet.preco = 100000;

		Carro ford = new Ford("Focus 2.0");
		ford.preco = 500000;

		Carro carro;
		// Clone do Objeto Chevrolet
		carro = chevrolet.clone();

		// Configurando preço que será maior que 100000
		carro.preco = chevrolet.preco + Carro.setPreco();
		System.out.println("Nome do Carro: " + carro.getNomeModelo() + "\n Preço do Carro: " + carro.preco);

		// Clone do Objeto Ford
		carro = ford.clone();

		// Configurando preço que será maior que 500000
		carro.preco = ford.preco + Carro.setPreco();
		System.out.println("Nome do Carro: " + carro.getNomeModelo() + "\n Preço do Carro: " + carro.preco);

	}
}