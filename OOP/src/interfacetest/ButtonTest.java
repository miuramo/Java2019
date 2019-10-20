package interfacetest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest implements ActionListener {

	public static void main(String[] args) {
		JFrame f = new JFrame("Test");
		f.setSize(300,300);
		f.setVisible(true);
		JButton b = new JButton("Button");
		f.getContentPane().add(b);
		b.addActionListener(new ButtonTest());

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(arg0.getActionCommand()+" pressed");
	}
}
