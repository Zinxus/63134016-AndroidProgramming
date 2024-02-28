package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeJrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public HomeJrame() {
		setTitle("Hệ Thống Quản Lý Bán Hàng ABC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
