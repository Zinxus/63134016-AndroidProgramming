package ntu_63134016_Cau1_Calculator;


import java.awt.Color;
import java.awt.Font;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




import java.awt.event.*;

public class Cau1_AppCalculator implements ActionListener {
	
	double num1=0, num2=0,result=0;
	int calculation;
			
	
	JFrame frame = new JFrame("Calculator");
	JLabel Label = new JLabel();
	JTextField textField = new JTextField();
	JButton logocalculationButton = new JButton("calculation");
	JButton buttonZero = new JButton("0");
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton("2");
	JButton buttonThree = new JButton("3");
	JButton buttonFour = new JButton("4");
	JButton buttonFive = new JButton("5");
	JButton buttonSix = new JButton("6");
	JButton buttonSeven = new JButton("7");
	JButton buttonEight = new JButton("8");
	JButton buttonNine = new JButton("9");
	JButton buttonDot = new JButton(".");
	JButton buttonClear = new JButton("C");
	JButton buttonDelete = new JButton("DEL");
	JButton buttonEqual = new JButton("=");
	JButton buttonMul = new JButton("X");
	JButton buttonDiv = new JButton("/");
	JButton buttonPlus = new JButton("+");
	JButton buttonMinus = new JButton("-");
	JButton buttonSquare = new JButton("x\u00B2");
	JButton buttonReciprocal = new JButton("1/x");
	JButton buttonSqrt = new JButton("\u221A");
	
	
	public Cau1_AppCalculator() {
		prepareGui();
		addComponenets();
		
	}
	
	public void prepareGui() {
		frame.setSize(305,510);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void addComponenets() {
		Label.setBounds(250,0,50,50);
		Label.setForeground(Color.white);
		frame.add(Label);
		
		textField.setBounds(10,40,270,40);
		textField.setFont(new Font("Arial",Font.BOLD,20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textField);
		
		logocalculationButton.setBounds(10,95,60,60);
		logocalculationButton.setSelected(true);
		logocalculationButton.setFont(new Font("Arial",Font.BOLD,14));
		logocalculationButton.setBackground(Color.black);
		logocalculationButton.setForeground(Color.white);
		logocalculationButton.setFocusable(false);
		logocalculationButton.setEnabled(false);
		frame.add(logocalculationButton);
		
		buttonSeven.setBounds(10,230,60,40);
		buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
		buttonSeven.setFocusable(false);
		frame.add(buttonSeven);
		
		buttonEight.setBounds(80,230,60,40);
		buttonEight.setFont(new Font("Arial",Font.BOLD,20));
		buttonEight.setFocusable(false);
		frame.add(buttonEight);
		
		buttonNine.setBounds(150,230,60,40);
		buttonNine.setFont(new Font("Arial",Font.BOLD,20));
		buttonNine.setFocusable(false);
		frame.add(buttonNine);
		
		buttonFour.setBounds(10,290,60,40);
		buttonFour.setFont(new Font("Arial",Font.BOLD,20));
		buttonFour.setFocusable(false);
		frame.add(buttonFour);
		
		buttonFive.setBounds(80,290,60,40);
		buttonFive.setFont(new Font("Arial",Font.BOLD,20));
		buttonFive.setFocusable(false);
		frame.add(buttonFive);
		
		buttonSix.setBounds(150,290,60,40);
		buttonSix.setFont(new Font("Arial",Font.BOLD,20));
		buttonSix.setFocusable(false);
		frame.add(buttonSix);
		
		buttonOne.setBounds(10,350,60,40);
		buttonOne.setFont(new Font("Arial",Font.BOLD,20));
		buttonOne.setFocusable(false);
		frame.add(buttonOne);
		
		buttonTwo.setBounds(80,350,60,40);
		buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
		buttonTwo.setFocusable(false);
		frame.add(buttonTwo);
		
		buttonThree.setBounds(150,350,60,40);
		buttonThree.setFont(new Font("Arial",Font.BOLD,20));
		buttonThree.setFocusable(false);
		frame.add(buttonThree);
		
		buttonDot.setBounds(150,410,60,40);
		buttonDot.setFont(new Font("Arial",Font.BOLD,20));
		buttonDot.setFocusable(false);
		frame.add(buttonDot);
		
		buttonZero.setBounds(10,410,130,40);
		buttonZero.setFont(new Font("Arial",Font.BOLD,20));
		buttonZero.setFocusable(false);
		frame.add(buttonZero);
		
		buttonEqual.setBounds(220,350,60,100);
		buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
		buttonEqual.setBackground(new Color(239,188,20));
		buttonEqual.setFocusable(false);
		frame.add(buttonEqual);
		
		buttonDiv.setBounds(220,110,60,40);
		buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
		buttonDiv.setBackground(new Color(239,188,20));
		buttonDiv.setFocusable(false);
		frame.add(buttonDiv);
		
		buttonSqrt.setBounds(10,170,60,40);
		buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
		buttonSqrt.setFocusable(false);
		frame.add(buttonSqrt);
		
		buttonMul.setBounds(220,230,60,40);
		buttonMul.setFont(new Font("Arial",Font.BOLD,20));
		buttonMul.setBackground(new Color(239,188,20));
		buttonMul.setFocusable(false);
		frame.add(buttonMul);
		
		buttonMinus.setBounds(220,170,60,40);
		buttonMinus.setFont(new Font("Arial",Font.BOLD,20));
		buttonMinus.setBackground(new Color(239,188,20));
		buttonMinus.setFocusable(false);
		frame.add(buttonMinus);
		
		buttonPlus.setBounds(220,290,60,40);
		buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
		buttonPlus.setBackground(new Color(239,188,20));
		buttonPlus.setFocusable(false);
		frame.add(buttonPlus);
		
		buttonSquare.setBounds(80,170,60,40);
		buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
		buttonSquare.setFocusable(false);
		frame.add(buttonSquare);
		
		buttonReciprocal.setBounds(150,170,60,40);
		buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
		buttonReciprocal.setFocusable(false);
		frame.add(buttonReciprocal);
		
		buttonDelete.setBounds(150,110,60,40);
		buttonDelete.setFont(new Font("Arial",Font.BOLD,12));
		buttonDelete.setBackground(Color.red);
		buttonDelete.setForeground(Color.white);
		buttonDelete.setFocusable(false);
		frame.add(buttonDelete);
		
		buttonClear.setBounds(80,110,60,40);
		buttonClear.setFont(new Font("Arial",Font.BOLD,12));
		buttonClear.setBackground(Color.red);
		buttonClear.setForeground(Color.white);
		buttonClear.setFocusable(false);
		frame.add(buttonClear);
	}
	
	public void addActionEvent() {
		
	}
	
	public static void main(String[] args) {
		Cau1_AppCalculator calculator = new Cau1_AppCalculator();
	}

	
	
}