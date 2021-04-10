package creational.factorymethod;

public class Industria2 extends IndustriaMateriaPrima {
	public Industria2(String uf, String descricao) {
		this.uf = uf;
		this.descricao = descricao;
		System.out.println("Pedido de " + descricao + " cadastrado na Industria 2\nRegiao de entrega: " + uf + "\n");
	}
}