package creational.simplefactory;

public class EmpresaFornecedora {
	public IndustriaMateriaPrima escolherIndustria(String estado, String descricao) {
		if(estado.equals("RJ") && descricao.equals("agua")) {
			return new Industria1();
		}else if(estado.equals("RJ") && descricao.equals("malte")) {
			return new Industria4();
		}else if(estado.equals("SP") && descricao.equals("agua")) {
			return new Industria3();
		}else if(estado.equals("SP") && descricao.equals("malte")) {
			return new Industria2();
		}
		return null;
	}
}