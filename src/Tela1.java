import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class Tela1 implements ActionListener {
	
	JTextField textField;
	Tela3 tela3;
	
	public Tela1() {
		
		JFrame frame = new JFrame("Título Tela 1");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		textField = new JTextField(20);
		frame.add(textField);
		
		JButton button = new JButton("Tela 2");
		button.addActionListener(this);//addActionListener adiciona ação ao botão
		frame.add(button);
		
		button = new JButton("Tela 3");
		button.addActionListener(this);//addActionListener adiciona ação ao botão
		frame.add(button);
		
		tela3 = new Tela3();
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Tela1();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equalsIgnoreCase("Tela 2")) {
			
			new Tela2(textField.getText());
			
		}else if(e.getActionCommand().equalsIgnoreCase("Tela 3")) { 
			
			tela3.setVisible(true);
			tela3.setComponents(textField.getText());
		}
		
		textField.setText("");
		
	}

}
