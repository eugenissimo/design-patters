package creational.factorymethod;

public class Industria1 extends IndustriaMateriaPrima {

	public Industria1(String uf, String descricao) {
		this.uf = uf;
		this.descricao = descricao;
		System.out.println("Pedido de " + descricao + " cadastrado na Industria 1\nRegiao de entrega: " + uf + "\n");
	}
}