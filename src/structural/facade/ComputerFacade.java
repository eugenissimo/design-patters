package structural.facade;

public class ComputerFacade {
	private Acessorios acessorios;
	private CPU cpu;
	private HD hd;
	private Memoria memoria;
	private SO so;
	
	public ComputerFacade() {
		this.acessorios = new Acessorios();
		this.cpu = new CPU();
		this.hd = new HD();
		this.memoria = new Memoria();
		this.so = new SO();
	}
	
	public void montarPC() {
		memoria.adicionarMemoria();
		hd.adicionarHD();
		cpu.adicionarProcessador();
		acessorios.adicionarMouse();
		acessorios.adicionarTeclado();
		acessorios.adicionarMonitor();
		so.instalarSO();
	}
}
