package videoGamePoker;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Component;


public class GameMenu extends JFrame implements WindowStateListener{

	JPanel Middle = new JPanel();
	/**
	 * 
	 */
	private static final long serialVersionUID = -2568059708929308574L;
	private JPanel contentPane;
	public static int gameChoice = 0; // 0 is Jacks or Better, 1 is TensOrBetter, 2 is Bally's All American
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private JTextField textField;
	private JTextField txtPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMenu frame = new GameMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameMenu() {
		setSize(new Dimension(533, 300));
		setPreferredSize(new Dimension(533, 300));
		setMinimumSize(new Dimension(533, 300));
		setMaximumSize(new Dimension(1600, 900));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new BackgroundPanel(new ImageIcon(GameMenu.class.getResource("/background.jpg")).getImage());
		contentPane.setPreferredSize(new Dimension(533, 300));
		contentPane.setMinimumSize(new Dimension(533, 300));
		contentPane.setMaximumSize(new Dimension(1600, 900));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel topBanner = new JPanel();
		topBanner.setBackground(new Color(0, 0, 128));
		
		
		Middle.setBounds(new Rectangle(0, 100, 533, 200));
		Middle.setPreferredSize(new Dimension(533, 300));
		Middle.setMaximumSize(new Dimension(1900, 700));
		Middle.setOpaque(false);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				gameChoice = 0;
				GameScreen secondGUI = new GameScreen();
				secondGUI.setVisible(true);
			}
		});
		btnNewButton_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setIcon(new ImageIcon(GameMenu.class.getResource("/jacks.png")));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				gameChoice = 1;
				GameScreen secondGUI = new GameScreen();
				secondGUI.setVisible(true);
			}
		});
		btnNewButton_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setIcon(new ImageIcon(GameMenu.class.getResource("/free_video_poker_tens_or_better.png")));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				gameChoice = 2;
				GameScreen secondGUI = new GameScreen();
				secondGUI.setVisible(true);
			}
		});
		btnNewButton_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setIcon(new ImageIcon(GameMenu.class.getResource("/Ballys-all-american.png")));
		Middle.setLayout(new GridLayout(0, 3, 0, 0));
		Middle.add(btnNewButton_2);
		Middle.add(btnNewButton_3);
		Middle.add(btnNewButton_4);
		
		JPanel Bottom = new JPanel();
		Bottom.setOpaque(false);
		
		JPanel UserInfo = new JPanel();
		UserInfo.setBackground(Color.GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Middle, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
						.addComponent(topBanner, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(UserInfo, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(Bottom, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(UserInfo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(topBanner, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Middle, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Bottom, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(0))
		);
		
		JButton button = new JButton("Log-in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				AfterLogin secondGUI = new AfterLogin();
				secondGUI.setVisible(true);
			}
		});
		
		passwordField = new JPasswordField();
		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setOpaque(false);
		txtUsername.setText("USERNAME:");
		txtUsername.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setBorder(null);
		txtPassword.setOpaque(false);
		txtPassword.setText("PASSWORD:");
		txtPassword.setColumns(10);
		GroupLayout gl_UserInfo = new GroupLayout(UserInfo);
		gl_UserInfo.setHorizontalGroup(
			gl_UserInfo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_UserInfo.createSequentialGroup()
					.addContainerGap(467, Short.MAX_VALUE)
					.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(button)
					.addContainerGap())
		);
		gl_UserInfo.setVerticalGroup(
			gl_UserInfo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_UserInfo.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_UserInfo.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		UserInfo.setLayout(gl_UserInfo);
		
		JTextArea txtrRefe = new JTextArea();
		txtrRefe.setEditable(false);
		txtrRefe.setForeground(Color.WHITE);
		txtrRefe.setBackground(Color.BLACK);
		
		JButton btnNewButton_1 = new JButton("Contact");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnAbout = new JButton("About");
		GroupLayout gl_Bottom = new GroupLayout(Bottom);
		gl_Bottom.setHorizontalGroup(
			gl_Bottom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Bottom.createSequentialGroup()
					.addComponent(txtrRefe, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
					.addComponent(btnAbout)
					.addGap(18)
					.addComponent(btnHelp)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(20))
		);
		gl_Bottom.setVerticalGroup(
			gl_Bottom.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Bottom.createSequentialGroup()
					.addGroup(gl_Bottom.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Bottom.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_1)
							.addComponent(btnHelp)
							.addComponent(btnAbout))
						.addGroup(gl_Bottom.createSequentialGroup()
							.addGap(46)
							.addComponent(txtrRefe, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
					.addContainerGap())
		);
		Bottom.setLayout(gl_Bottom);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(GameMenu.class.getResource("/l.png")));
		GroupLayout gl_topBanner = new GroupLayout(topBanner);
		gl_topBanner.setHorizontalGroup(
			gl_topBanner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topBanner.createSequentialGroup()
					.addGap(322)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
					.addGap(306))
		);
		gl_topBanner.setVerticalGroup(
			gl_topBanner.createParallelGroup(Alignment.LEADING)
				.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
		);
		topBanner.setLayout(gl_topBanner);
		contentPane.setLayout(gl_contentPane);
	
	
		addWindowStateListener(new WindowStateListener()
		{
			public void windowStateChanged(WindowEvent e) {
				if ((e.getNewState() & MAXIMIZED_BOTH) == MAXIMIZED_BOTH)
					Middle.setBounds(new Rectangle(0, 100, 1900, 600));
			}
		});
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		if ((e.getNewState() & MAXIMIZED_BOTH) == MAXIMIZED_BOTH)
			Middle.setBounds(new Rectangle(0, 100, 1900, 600));
	}
}


