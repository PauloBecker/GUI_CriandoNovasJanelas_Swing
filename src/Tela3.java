import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela3 extends JFrame{
	
	JLabel label;
	
	public Tela3() {
		
		setTitle("Título Tela 3");
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		label = new JLabel("");
		add(label);
		
	}
	
	public void setComponents(String texto) {
		
		label.setText(texto);
		
	}

}
