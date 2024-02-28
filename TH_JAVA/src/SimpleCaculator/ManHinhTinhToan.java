package SimpleCaculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txA;
	private JTextField txB;
	private JTextField txKetQua;

	public ManHinhTinhToan() {
		setTitle("Chương Trinh Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 25, 156, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số thứ hai (b):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 85, 156, 34);
		contentPane.add(lblNewLabel_1);
		
		txA = new JTextField();
		txA.setBounds(176, 32, 384, 26);
		contentPane.add(txA);
		txA.setColumns(10);
		
		txB = new JTextField();
		txB.setBounds(176, 92, 384, 26);
		contentPane.add(txB);
		txB.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(24, 217, 85, 34);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý
				//Viết lệnh ở một thủ tục/hàm, rồi gọi ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(151, 219, 91, 32);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(288, 219, 85, 34);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(412, 219, 85, 32);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết Quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKtQu.setBounds(10, 302, 78, 34);
		contentPane.add(lblKtQu);
		
		txKetQua = new JTextField();
		txKetQua.setEditable(false);
		txKetQua.setColumns(10);
		txKetQua.setBounds(117, 302, 443, 34);
		contentPane.add(txKetQua);
	}//kết hàm tạo
	void HamXuLyCong() {
		//Lay du lieu tu dieu khien
		String str_soA = txA.getText();
		String str_soB = txB.getText();
		//CHuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh Toan
		double tong =soA+soB;
		//Dua ra ket qua hien thi
		txKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lay du lieu tu dieu khien
		String str_soA = txA.getText();
		String str_soB = txB.getText();
		//CHuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh Toan
		double tong =soA-soB;
		//Dua ra ket qua hien thi
		txKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		//Lay du lieu tu dieu khien
		String str_soA = txA.getText();
		String str_soB = txB.getText();
		//CHuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh Toan
		double tong =soA*soB;
		//Dua ra ket qua hien thi
		txKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		//Lay du lieu tu dieu khien
		String str_soA = txA.getText();
		String str_soB = txB.getText();
		//CHuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh Toan
		double tong =soA/soB;
		//Dua ra ket qua hien thi
		txKetQua.setText(String.valueOf(tong));
	}
}
