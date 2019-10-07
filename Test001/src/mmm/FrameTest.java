package mmm;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest extends JFrame {

	private static final long serialVersionUID = 1351695700232442659L;


	public FrameTest(String title) throws HeadlessException {
		super(title);
		getContentPane().add(new JPanel());
		setSize(400,400);
		setLocation(400,200);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FrameTest ft = new FrameTest("Hoge");
		ft.setVisible(true);

	}

}
