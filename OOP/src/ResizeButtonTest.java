import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ResizeButtonTest implements ActionListener {
	public static JFrame jf;
	JPanel jp;
	ArrayList<JButton> btns;

	public static void main(String[] args) {
		new ResizeButtonTest();
	}
	public ResizeButtonTest(){
		jf = new JFrame("Title");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp = new JPanel();
		jf.getContentPane().add(jp);
		JButton b1;
		jp.add(b1 = new JButton("Button"));
		b1.addActionListener(this);
		btns = new ArrayList<JButton>();
		jp.add(new ResizeButton("B1", 60, 20));
		jp.add(new ResizeButton("B2", 60, 20));
		jp.add(new ResizeButton("B3", 70, 20));
		for(Component c: jp.getComponents()){
			JButton jb = (JButton) c;
			System.out.println(jb.getText());
			btns.add(jb);
		}
		jf.pack();
//		jf.setSize(300,300);
		jf.setLocation(800, 50);
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for(JButton jb: btns){
			System.out.print(jb.getClass().getName()+" "+jb.getText()+"  ");
			if (jb instanceof ResizeButton){
				ResizeButton rb = (ResizeButton)jb;
				System.out.println(rb.width+" "+rb.height);
			} else {
				System.out.println("");
			}
		}
	}
}

//@SuppressWarnings("serial")
class ResizeButton extends JButton
             implements ActionListener {
	private static final long serialVersionUID = -7441703374517555838L;
	int width, height;
	ResizeButton(String label, int w, int h){
		super(label);
		width = w ; height = h ;
		addActionListener(this);
	}
	public Dimension getPreferredSize(){
		return new Dimension(width, height);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		width+=50; height+=10;
//		invalidate();
		ResizeButtonTest.jf.pack();
	}
}
