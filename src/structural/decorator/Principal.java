package structural.decorator;

import java.math.BigDecimal;

import creational.builder.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Lapso de Memória");
		produto.setQuantidade(4);
		produto.setValor(new BigDecimal("40.00"));
		
		CalculoPreco calculo = new CalculoPrecoComFrete(new CalculoPrecoComum()	);
		
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("R$ " + preco.doubleValue());
	}
}
