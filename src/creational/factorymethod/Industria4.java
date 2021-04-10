package creational.factorymethod;

public class Industria4 extends IndustriaMateriaPrima {
	public Industria4(String uf, String descricao) {
		this.uf = uf;
		this.descricao = descricao;
		System.out.println("Pedido de " + descricao + " cadastrado na Industria 4 \nRegiao de entrega: " + uf + "\n");
	}
}