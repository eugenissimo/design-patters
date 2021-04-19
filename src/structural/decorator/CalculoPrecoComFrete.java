package structural.decorator;

import java.math.BigDecimal;

import creational.builder.Produto;

public class CalculoPrecoComFrete implements CalculoPreco{

	private CalculoPreco calculo;
	
	public CalculoPrecoComFrete(CalculoPreco calculo) {
		this.calculo = calculo;
	}
	
	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal valorFinal = calculo.valorFinal(produto);
		BigDecimal frete;
		
		if(produto.getQuantidade() > 3 ) {
			frete = new BigDecimal("11.00");
			valorFinal = valorFinal.add(frete);
			return valorFinal;
		} else {
			frete = new BigDecimal("17.00");
			valorFinal = valorFinal.add(frete);
			return valorFinal;
		}
	}
}