import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela2 {
	
	public Tela2(String texto) {
		
		JFrame frame = new JFrame("Título Tela 2");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel(texto);
		frame.add(label);
		
	}

}
