package behavioral.state;

public class Principal {
	public static void main(String[] args) {
		State mario = new Mario();
		
		mario = mario.pegarCogumelo();
		mario = mario.pegarFlorDeFogo();
		mario = mario.pegarCogumelo();
		
		//mario = mario.colidirComInimigo();
		//mario = mario.colidirComInimigo();
		//mario = mario.colidirComInimigo();
		
		System.out.println();
		System.out.println("Estado final: " + mario.retornarTipo());
	}
}