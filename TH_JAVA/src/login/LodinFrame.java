package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LodinFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnamelogin;
	private JTextField txtpasslogin;

	public LodinFrame() {
		setTitle("Đăng nhập hệ thông quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên Đăng Nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 27, 113, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMtKhu.setBounds(10, 86, 113, 49);
		contentPane.add(lblMtKhu);
		
		txtnamelogin = new JTextField();
		txtnamelogin.setBounds(133, 38, 300, 32);
		contentPane.add(txtnamelogin);
		txtnamelogin.setColumns(10);
		
		txtpasslogin = new JTextField();
		txtpasslogin.setColumns(10);
		txtpasslogin.setBounds(133, 90, 300, 32);
		contentPane.add(txtpasslogin);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XulyDangNhap();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(149, 148, 214, 49);
		contentPane.add(btnLogin);
	}
	void XulyDangNhap() {
		//Lay ve ten DN va mat khau
		String strTen = txtnamelogin.getText();
		String strMK = txtpasslogin.getText();
		//Xu ly
		if(strTen.equals("63CNTT")&& strMK.equals("123")) {
			//hien trang home
			HomeJrame homePage = new HomeJrame();
			homePage.setVisible(true);
			this.setVisible(false);
		}else {// bao loi
			//Xóa dữ liệu đăng nhập
			txtnamelogin.setText("");
			txtpasslogin.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this,"Đăng nhập thất bại");
		}
	}
}
