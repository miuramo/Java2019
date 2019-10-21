import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceTest implements ActionListener, Runnable {

	public static void main(String[] args) {
		new InterfaceTest();
	}
	InterfaceTest(){
		JFrame jf = new JFrame("Title");
		jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		jf.getContentPane().add(jp);
		JButton b1 = new JButton("Button1");
		jp.add(b1);  b1.addActionListener(this);
		JButton b2 = new JButton("Button2");
		jp.add(b2);  // b2.addActionListener(this);
		ActionListener al;
		b2.addActionListener(al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				th = null;
				System.out.println("Anonymous Class ActionListener");
			}
		});
		//b1.addActionListener(al);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(arg0.getActionCommand()+" pressed");
		th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		while(th != null){
			System.out.println(count+" sec"); count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	int count = 0;
	Thread th;
}
