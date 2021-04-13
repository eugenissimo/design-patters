package creational.factory.factorymethod;

import javax.swing.JOptionPane;

public class SMS implements Mensagem {

	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "SMS: " + mensagem);
	}
}