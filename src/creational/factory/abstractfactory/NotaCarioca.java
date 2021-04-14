package creational.factory.abstractfactory;

import java.math.BigDecimal;

public class NotaCarioca implements NFE {

	@Override
	public double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.16");
		imposto = imposto.multiply(produto.getValorUnitario());
		return imposto.doubleValue();
	}
}