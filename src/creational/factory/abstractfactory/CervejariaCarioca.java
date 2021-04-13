package creational.factory.abstractfactory;

public class CervejariaCarioca implements VendaFactory {

	@Override
	public NFE criarNFE() {
		NFE notaFiscal = new NotaCarioca();
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoItau();
		return boleto;
	}

}
