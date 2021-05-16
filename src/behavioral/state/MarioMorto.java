package behavioral.state;

public class MarioMorto implements State{

	@Override
	public State pegarCogumelo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State pegarEstrela() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State colidirComInimigo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String retornarTipo() {
		// TODO Auto-generated method stub
		return "to morto";
	}

}
