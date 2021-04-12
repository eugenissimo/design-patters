package creational.builder;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
	private String numeroPedido;
	private List<Produto> produtos;
	private Cliente cliente;
	private Vendedor vendedor;

	public BigDecimal getValorTotal() {
		BigDecimal total = BigDecimal.ZERO;

		for (Produto produto : produtos) {
			total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
		}
		return total;
	}

	public int getTotalProdutos() {
		int total = 0;
		for (Produto produto : produtos) {
			total += produto.getQuantidade();
		}
		return total;
	}
	
	public void informacoes(){
		System.out.println("Número pedido: " + this.numeroPedido);
		for (Produto produto : produtos) {
			System.out.println("Produto[" + produtos.indexOf(produto)+ "]: " + produto.getNome());
		}
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Vendedor: " + this.vendedor.getNome());
		System.out.println("Valor total: " + getValorTotal());
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
