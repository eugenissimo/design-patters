package behavioral.state;

public class Mario implements State{

	@Override
	public State pegarCogumelo() {
		System.out.println("pegou um cogumelo: virou super!");
		return new SuperMario();
	}

	@Override
	public State pegarEstrela() {
		System.out.println("pegou uma estrela: tá sinistro!");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("pegou uma flor: agora cospe fogo!");
		return new FireMario();
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("bateu de frente com um alemão: deitou");
		return new MarioMorto();
	}

	@Override
	public String retornarTipo() {
		return "Mario normalzão";
	}
}