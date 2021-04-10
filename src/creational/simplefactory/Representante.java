package creational.simplefactory;

public class Representante {
	public static void main(String[] args) {
		EmpresaFornecedora pedido1 = new EmpresaFornecedora();
		EmpresaFornecedora pedido2 = new EmpresaFornecedora();
		
		pedido1.escolherIndustria("RJ", "malte").criarIndustria();
		pedido2.escolherIndustria("RJ", "agua").criarIndustria();
		
	}
}