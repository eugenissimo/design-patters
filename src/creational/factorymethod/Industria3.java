package creational.factorymethod;

public class Industria3 extends IndustriaMateriaPrima {
	public Industria3(String uf, String descricao) {
		this.uf = uf;
		this.descricao = descricao;
		System.out.println("Pedido de " + descricao + " cadastrado na Industria 3\nRegiao de entrega: " + uf + "\n");
	}
}