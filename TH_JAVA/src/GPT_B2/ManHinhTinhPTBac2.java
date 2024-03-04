package GPT_B2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhPTBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtprint;
	private JTextField txtX1;
	private JTextField txtX2;

	public ManHinhTinhPTBac2() {
		setTitle("Màn hình Chương Trình Giải Phương Trình Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 24, 69, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNhpB.setBounds(10, 66, 69, 32);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNhpC.setBounds(10, 116, 69, 32);
		contentPane.add(lblNhpC);
		
		txtA = new JTextField();
		txtA.setBounds(158, 24, 160, 28);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(158, 66, 160, 28);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(158, 116, 160, 28);
		contentPane.add(txtC);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamTinhPT2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 170, 85, 32);
		contentPane.add(btnNewButton);
		
		txtprint = new JTextField();
		txtprint.setEditable(false);
		txtprint.setColumns(10);
		txtprint.setBounds(158, 175, 216, 28);
		contentPane.add(txtprint);
		
		txtX1 = new JTextField();
		txtX1.setEditable(false);
		txtX1.setColumns(10);
		txtX1.setBounds(158, 228, 160, 28);
		contentPane.add(txtX1);
		
		txtX2 = new JTextField();
		txtX2.setEditable(false);
		txtX2.setColumns(10);
		txtX2.setBounds(158, 274, 160, 28);
		contentPane.add(txtX2);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblX.setBounds(26, 223, 69, 32);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("X2:");
		lblX_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblX_1.setBounds(26, 269, 69, 32);
		contentPane.add(lblX_1);
	}
	void HamTinhPT2() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		String str_soC = txtC.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double soC = Double.parseDouble(str_soC);
		
		double delta = Math.pow(soB, 2) - 4 * soA * soC;
		
		if (soA == 0) {
			giaiPTB1(soB, soC);
        } else {
            if (delta < 0) {
            	txtprint.setText("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                double x = -soB / (2 * soA);
                txtprint.setText("Phương trình có nghiệm kép");
                txtX1.setText(String.valueOf(x));
            } else {
                double x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
                double x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
                txtprint.setText("Phương trình có hai nghiệm phân biệt");
                txtX1.setText(String.valueOf(x1));
                txtX2.setText(String.valueOf(x2));
            }
        }
	}
	void giaiPTB1(double soB, double soC) {
		if (soB == 0) {
            if (soC == 0) {
            	txtprint.setText("Phương trình có vô số nghiệm!");
            } else {
            	txtprint.setText("Phương trình vô nghiệm!");
            }
        } else {
            double x = -soC / soB;
            txtprint.setText("Phương trình có nghiệm duy nhất:");
            txtX1.setText(String.valueOf(x));
        }
	}
}
