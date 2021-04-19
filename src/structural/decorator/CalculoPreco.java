package structural.decorator;

import java.math.BigDecimal;

import creational.builder.Produto;

public interface CalculoPreco {
	public BigDecimal valorFinal(Produto produto);
}
