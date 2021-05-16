package behavioral.state;

public class MarioInvencivel implements State{
	@Override
	public State pegarCogumelo() {
		System.out.println("pegou um cogumelo: ainda tá sinistro");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("pegou uma estrela: tá sinistro!");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("pegou uma flor: agora cospe fogo e ainda tá invencível!");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("bateu de frente com um alemão: deitou o maluco!");
		return new SuperMario();
	}

	@Override
	public String retornarTipo() {
		return "mario invencivel";
	}
}
