package lander;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	private LanderView mLanderView;
	
	public static void main(String[] args) {
		new Main();
	}

	Main() {
		super("Lander");
		setLayout(new FlowLayout());
		mLanderView = new LanderView();
		add(mLanderView);
		add(mLanderView.panel);
		setSize(800, 580);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
