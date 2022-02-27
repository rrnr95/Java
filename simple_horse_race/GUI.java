package semana2.corridaCavalos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI {

	JFrame frame;
	JPanel panel;

	JTextField leftTF = new JTextField("30");
	JTextField midTF = new JTextField("30");
	JTextField rightTF = new JTextField("30");
	JButton iniciaBtt;

	public GUI() {

		frame = new JFrame("Corrida");	

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());

		frame.setResizable(true);

		frame.setSize(225,100);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((int)(dimension.getWidth()/2) - frame.getWidth()/2, 
				(int)(dimension.getHeight()/2) - frame.getHeight()/2);

		addFrameContent();

		frame.setVisible(true);

	}

	private void addFrameContent() {

		panel = new JPanel();

		panel.add(leftTF);

		panel.add(midTF);

		panel.add(rightTF);

		panel.setVisible(true);

		frame.add(panel, BorderLayout.NORTH);

		iniciaBtt = new JButton("Update");

		frame.add(iniciaBtt, BorderLayout.SOUTH);	
	}

	public void bttActivation(Race race) {
		iniciaBtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				race.start();
			}
		});
	}

	public void setDistances(int d1, int d2, int d3) {

		leftTF.setText(Integer.toString(d1));
		midTF.setText(Integer.toString(d2));
		rightTF.setText(Integer.toString(d3));

	}
}
