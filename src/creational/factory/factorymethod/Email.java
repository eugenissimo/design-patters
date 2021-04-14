package creational.factory.factorymethod;

import javax.swing.JOptionPane;

public class Email implements Mensagem{
	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "Email: " + mensagem);
	}
}