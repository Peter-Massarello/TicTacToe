import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TicTacToe {

	JFrame window;
	Container con;
	JPanel titleName, startButtonPanel, mainBoxPanel;
	JLabel titleText;
	Font titleFont = new Font("MingLiU-ExtB", Font.PLAIN, 90);
	Font defaultFont = new Font("MingLiU-ExtB", Font.PLAIN, 30);
	JButton startButton;
	
	
	
	public TicTacToe(){
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleName = new JPanel();
		titleName.setBounds(100, 100, 600, 150);
		titleName.setBackground(Color.black);
		titleText = new JLabel("TIC TAC TOE");
		titleText.setForeground(Color.white);
		titleText.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,200,100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setFocusPainted(false);
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(defaultFont);
	
		
		
		titleName.add(titleText);
		startButtonPanel.add(startButton);
		
		con.add(titleName);
		con.add(startButtonPanel);
	}
	public static void main(String[] args) {
		
		new TicTacToe();
	}

}
