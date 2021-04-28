package javaprojectreal;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class javaprojectreal2 {

	private JFrame frame;
	private JTextField IDinput;
	private JPasswordField Passwordinput;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaprojectreal2 window = new javaprojectreal2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public javaprojectreal2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Twh");
		frame.setBounds(100, 100, 420, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
			
			JPanel Chattingpanel = new JPanel();
			Chattingpanel.setBounds(-217, 48, 404, 563);
			frame.getContentPane().add(Chattingpanel);
			Chattingpanel.setLayout(null);
			Chattingpanel.setVisible(false);
			
			textField = new JTextField();
			textField.setBounds(12, 532, 273, 21);
			Chattingpanel.add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("입력");
			btnNewButton.setBounds(295, 531, 97, 23);
			Chattingpanel.add(btnNewButton);
			
			
			JPanel Loginpanel = new JPanel();
			Loginpanel.setBounds(271, 85, 398, 556);
			frame.getContentPane().add(Loginpanel);
			Loginpanel.setLayout(null);
			
						
				
						JButton Loginbutton = new JButton("로그인");//로그인 버튼을 누르면 밑에 있는 오버라이딩 실행
						Loginbutton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String id ="moonhyeonjun";
								String pass = "abc1234";
								
								if(id.equals(IDinput.getText())&&pass.equals(Passwordinput.getText())){//맞는 아이디와 입력한 아이디 그리고 맞는 비밀번호와 입력한 비밀번호 비교
							JOptionPane.showMessageDialog(null, "로그인 성공");//맞다면 로그인 성공 창 띄움
							Loginpanel.setVisible(false);
							Chattingpanel.setVisible(true);
							
								}else {
									JOptionPane.showMessageDialog(null, "다시 입력하세요");//틀리다면 다시 입력하세요 창 띄움
								}
								
							
							}
						});
						Loginbutton.setBounds(262, 463, 91, 23);
						Loginpanel.add(Loginbutton);
						JButton Registerbtn = new JButton("회원가입");
						Registerbtn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
							}
							
						});
						Registerbtn.setBounds(262, 416, 91, 23);
						Loginpanel.add(Registerbtn);
						
						JLabel IDlabel = new JLabel("아이디");
						IDlabel.setFont(new Font("굴림", Font.PLAIN, 20));
						IDlabel.setBounds(64, 220, 63, 41);
						Loginpanel.add(IDlabel);
						
						JLabel TxtPass = new JLabel("비밀번호");//JLabel lblNewLabel_1 = new JLabel("패스워드");
						TxtPass.setFont(new Font("굴림", Font.PLAIN, 20));
						TxtPass.setBounds(43, 286, 84, 29);
						Loginpanel.add(TxtPass);
						
						IDinput = new JTextField();//패널에 ID 입력
						IDinput.setBounds(172, 232, 181, 21);
						Loginpanel.add(IDinput);
						IDinput.setColumns(10);
						
						Passwordinput = new JPasswordField();//패널에 비밀번호 입력
						Passwordinput.setBounds(172, 292, 181, 21);
						Loginpanel.add(Passwordinput);
						Passwordinput.setColumns(10);
						
						JLabel TitleLabel = new JLabel("twh프로그램");
						TitleLabel.setFont(new Font("굴림", Font.PLAIN, 30));
						TitleLabel.setBounds(106, 48, 199, 72);
						Loginpanel.add(TitleLabel);
				
				
		
		
	}
}
