package behavioral.state;

public class FireMario implements State{
	@Override
	public State pegarCogumelo() {
		System.out.println("pegou um cogumelo: agora tem 2!");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("pegou uma estrela: tá sinistro!");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("pegou uma flor: agora cospe fogo!");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("bateu de frente com um alemão: voltou a ser o super mario");
		return new SuperMario();
	}

	@Override
	public String retornarTipo() {
		return "fire mario";
	}
}
