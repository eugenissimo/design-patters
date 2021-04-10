package creational.factorymethod;

public class Fornecedora implements EmpresaFornecedora {
	public IndustriaMateriaPrima criarPedido(String uf, String descricao) {
		if (descricao.equals("malte") && uf.equals("RJ")) {
			return new Industria1(uf, descricao);
		} else if (descricao.equals("agua") && uf.equals("RJ")) {
			return new Industria4(uf, descricao);
		} else if (descricao.equals("malte") && uf.equals("SP")) {
			return new Industria3(uf, descricao);
		} else if (descricao.equals("agua") && uf.equals("SP")) {
			return new Industria2(uf, descricao);
		}
		return null;
	}

}