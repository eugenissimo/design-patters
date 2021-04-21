package structural.adapter;

public class CotacaoAdapter extends Cotacao {

	@Override
	public void setValor(double valor) {
		super.setValor(valor / 6.00);
	}

	@Override
	public double getValor() {
		return (super.getValor() * 6.00);
	}

	public double getValorDolar() {
		return super.getValor();
	}
}
