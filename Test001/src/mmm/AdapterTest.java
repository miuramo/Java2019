package mmm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AdapterTest {

	public static void main(String[] args) {
		int r = JOptionPane.showConfirmDialog(null, "Confirm?");
		if (r == JOptionPane.YES_OPTION){
			System.out.println("YES");
		}
		String s = JOptionPane.showInputDialog("Input txt");
		System.out.println(s);
		
		JButton jb = new JButton("Button");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

}

class MA implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
