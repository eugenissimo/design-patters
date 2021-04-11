package creational.factorymethod;

public class MensagemFactory {
	public static Mensagem getMensagem(int i) {
		if(i == 1) {
			return new SMS();
		} else if (i == 2) {
			return new Email();
		}
		return null;
	}
}
