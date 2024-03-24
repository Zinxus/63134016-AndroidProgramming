package ntu_63134016_Cau1_Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Cau1_AppCalculator extends JFrame {
	JFrame frame = new JFrame("Calculator");
	
	public Cau1_AppCalculator() {
		prepareGui();
	}
	
	public void prepareGui() {
		frame.setSize(305,510);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Cau1_AppCalculator calculator = new Cau1_AppCalculator();
	}

}
