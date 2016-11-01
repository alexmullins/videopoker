package videoGamePoker;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.ItemEvent;
import videoGamePoker.GameMenu;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import javax.swing.JTable;
import java.awt.ComponentOrientation;


public class GameScreen extends JFrame{

	private JPanel contentPane;
	private JTextField txtPlayerName;
	private JTextField txtStatusBar;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameScreen frame = new GameScreen();
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
	public GameScreen() {
		setSize(new Dimension(1041, 621));
		setPreferredSize(new Dimension(533, 300));
		setMinimumSize(new Dimension(533, 300));
		setMaximumSize(new Dimension(1600, 900));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1148, 700);
		ImageIcon background = new ImageIcon(GameMenu.class.getResource("/background.jpg"));
		contentPane = new BackgroundPanel(background.getImage());
		contentPane.setPreferredSize(new Dimension(533, 300));
		contentPane.setMinimumSize(new Dimension(533, 300));
		contentPane.setMaximumSize(new Dimension(1600, 900));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel Top = new JPanel();
		Top.setBackground(new Color(0, 0, 128));
		DefaultTableModel model = new DefaultTableModel();
		model.setRowCount(10);
		model.setColumnCount(6);
		Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
		        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
		Object columnNames[] = { "Column One", "Column Two", "Column Three", };
		table = new JTable(rowData,columnNames);
		
		if(GameMenu.gameChoice == 0){
			table.setAutoCreateRowSorter(true);
			table.setFont(new Font("Tahoma", Font.BOLD, 13));
			table.setBackground(Color.BLACK);
			table.setForeground(Color.WHITE);
			table.setGridColor(Color.GRAY);
			BoardTableCellRenderer cellRenderer = new BoardTableCellRenderer();
			
			
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"play 1 to 5 coins", "1", "2", "3", "4", "5"},
					{"Royal Flush", "250", "500", "750", "1000", "4000"},
					{"Straight Flush", "50", "100", "150", "200", "250"},
					{"4 of a kind", "25", "50", "75", "200", "125"},
					{"Full House", "9", "18", "27", "36", "45"},
					{"Flush", "6", "12", "18", "24", "30"},
					{"Straight", "4", "8", "12", "16", "20"},
					{"3 of a kind", "3", "6", "9", "12", "15"},
					{"Two Pair", "2", "4", "6", "8", "10"},
					{"Jacks Or Better", "1", "2", "3", "4", "5"},
				},
				new String[] {
					"Column One", "Column Two", "Column Three", "New column", "New column", "New column"
				}
			));
			
			 for (int i = 0; i < 6; i++) {
			     table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
			 }
		}
		 
		if(GameMenu.gameChoice == 1){
			table.setAutoCreateRowSorter(true);
			table.setFont(new Font("Tahoma", Font.BOLD, 13));
			table.setBackground(Color.WHITE);
			table.setForeground(Color.BLACK);
			table.setGridColor(Color.BLACK);
			BoardTableCellRenderer cellRenderer = new BoardTableCellRenderer();
			
			
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"play 1 to 5 coins", "1", "2", "3", "4", "5"},
					{"Royal Flush", "250", "500", "750", "1000", "4000"},
					{"Straight Flush", "50", "100", "150", "200", "250"},
					{"4 of a kind", "25", "50", "75", "200", "125"},
					{"Full House", "9", "18", "27", "36", "45"},
					{"Flush", "6", "12", "18", "24", "30"},
					{"Straight", "4", "8", "12", "16", "20"},
					{"3 of a kind", "3", "6", "9", "12", "15"},
					{"Two Pair", "2", "4", "6", "8", "10"},
					{"Tens Or Better", "1", "2", "3", "4", "5"},
				},
				new String[] {
					"Column One", "Column Two", "Column Three", "Column Four", "Column Five", "Column Six"
				}
			));
			
			 for (int i = 0; i < 6; i++) {
			     table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
			 }
		}
		
		if(GameMenu.gameChoice == 2){
			table.setAutoCreateRowSorter(true);
			table.setFont(new Font("Tahoma", Font.BOLD, 13));
			table.setBackground(Color.BLUE);
			table.setForeground(Color.RED);
			table.setGridColor(Color.BLACK);
			BoardTableCellRenderer cellRenderer = new BoardTableCellRenderer();
			
			
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"play 1 to 5 coins", "1", "2", "3", "4", "5"},
					{"Royal Flush", "250", "500", "750", "1000", "4000"},
					{"Straight Flush", "200", "400", "600", "800", "1000"},
					{"4 of a kind", "40", "80", "120", "160", "200"},
					{"Full House", "9", "18", "27", "36", "45"},
					{"Flush", "9", "18", "27", "36", "45"},
					{"Straight", "9", "18", "27", "36", "45"},
					{"3 of a kind", "3", "6", "9", "12", "15"},
					{"Two Pair", "1", "2", "3", "4", "5"},
					{"Jacks Or Better", "1", "2", "3", "4", "5"},
				},
				new String[] {
					"Column One", "Column Two", "Column Three", "Column Four", "Column Five", "Column Six"
				}
			));
			
			 for (int i = 0; i < 6; i++) {
			     table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
			 }
		}
		JPanel GameModeInfo = new JPanel();
		//JPanel GameModeInfo = new BackgroundPanel(icon2.getImage());
		GameModeInfo.setOpaque(false);
		
		JPanel CardScreen = new JPanel();
		CardScreen.setOpaque(false);
		CardScreen.setSize(new Dimension(1900, 650));
		CardScreen.setPreferredSize(new Dimension(1900, 650));
		CardScreen.setMaximumSize(new Dimension(1900, 650));
		CardScreen.setBounds(new Rectangle(0, 0, 1900, 500));
		
		
		JPanel Bottom = new JPanel();
		Bottom.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Bottom.setOpaque(false);
		Bottom.setPreferredSize(new Dimension(1900, 100));
		Bottom.setBounds(new Rectangle(0, 0, 533, 100));
		Bottom.setMaximumSize(new Dimension(1900, 100));
		
		JPanel cardHeldPanel = new JPanel();
		cardHeldPanel.setOpaque(false);
		
		JPanel UserScreen = new JPanel();
		UserScreen.setBackground(new Color(128, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(UserScreen, GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(GameModeInfo, GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(cardHeldPanel, GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(CardScreen, GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(Bottom, GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(Top, GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(UserScreen, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Top, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(GameModeInfo, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cardHeldPanel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(CardScreen, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
					.addGap(9)
					.addComponent(Bottom, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				GameMenu menu = new GameMenu();
				menu.setVisible(true);
			}
		});
		
		txtPlayerName = new JTextField();
		txtPlayerName.setOpaque(false);
		txtPlayerName.setText("John Smith");
		txtPlayerName.setEditable(false);
		txtPlayerName.setColumns(10);
		
		JTextField playerCredits = new JTextField();
		playerCredits.setOpaque(false);
		playerCredits.setFont(new Font("Tahoma", Font.PLAIN, 11));
		playerCredits.setText("10000 credits");
		playerCredits.setEditable(false);
		GroupLayout gl_UserScreen = new GroupLayout(UserScreen);
		gl_UserScreen.setHorizontalGroup(
			gl_UserScreen.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_UserScreen.createSequentialGroup()
					.addContainerGap(809, Short.MAX_VALUE)
					.addComponent(txtPlayerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(playerCredits, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogout)
					.addContainerGap())
		);
		gl_UserScreen.setVerticalGroup(
			gl_UserScreen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_UserScreen.createSequentialGroup()
					.addGroup(gl_UserScreen.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogout)
						.addComponent(playerCredits, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPlayerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		UserScreen.setLayout(gl_UserScreen);
		
		
		GroupLayout gl_GameModeInfo = new GroupLayout(GameModeInfo);
		gl_GameModeInfo.setHorizontalGroup(
			gl_GameModeInfo.createParallelGroup(Alignment.LEADING)
				.addComponent(table, GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
		);
		gl_GameModeInfo.setVerticalGroup(
			gl_GameModeInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GameModeInfo.createSequentialGroup()
					.addComponent(table, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(155))
		);
		GameModeInfo.setLayout(gl_GameModeInfo);
		
		JLabel label_1 = new JLabel("\r\nHeld\r\n");
		label_1.setVisible(false);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("\r\nHeld\r\n");
		label_2.setVisible(false);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setAlignmentX(0.5f);
		
		JLabel label_3 = new JLabel("\r\nHeld\r\n");
		label_3.setVisible(false);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setAlignmentX(0.5f);
		
		JLabel label_4 = new JLabel("\r\nHeld\r\n");
		label_4.setVisible(false);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setAlignmentX(0.5f);
		
		JLabel label_5 = new JLabel("\r\nHeld\r\n");
		label_5.setVisible(false);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setAlignmentX(0.5f);
		cardHeldPanel.setLayout(new GridLayout(0, 5, 0, 0));
		cardHeldPanel.add(label_1);
		cardHeldPanel.add(label_2);
		cardHeldPanel.add(label_3);
		cardHeldPanel.add(label_4);
		cardHeldPanel.add(label_5);
		CardScreen.setLayout(new GridLayout(1, 0, 0, 0));
		
		JToggleButton Card1 = new JToggleButton("Card 1\r\n");
		Card1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
			        label_1.setVisible(true);
			      } else if(e.getStateChange()==ItemEvent.DESELECTED){
			    	  label_1.setVisible(false);
			      }
			}
		});
		
		CardScreen.add(Card1);
		
		JToggleButton Card2 = new JToggleButton("Card 2\r\n");
		Card2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
			        label_2.setVisible(true);
			      } else if(e.getStateChange()==ItemEvent.DESELECTED){
			    	  label_2.setVisible(false);
			      }
			}
		});
		CardScreen.add(Card2);
		
		JToggleButton Card3 = new JToggleButton("Card 3");
		Card3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
			        label_3.setVisible(true);
			      } else if(e.getStateChange()==ItemEvent.DESELECTED){
			    	  label_3.setVisible(false);
			      }
			}
		});
		CardScreen.add(Card3);
		
		JToggleButton Card4 = new JToggleButton("Card 4\r\n");
		Card4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
			        label_4.setVisible(true);
			      } else if(e.getStateChange()==ItemEvent.DESELECTED){
			    	  label_4.setVisible(false);
			      }
			}
		});
		CardScreen.add(Card4);
		JToggleButton Card5 = new JToggleButton("Card 5\r\n");
		Card5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
			        label_5.setVisible(true);
			      } else if(e.getStateChange()==ItemEvent.DESELECTED){
			    	  label_5.setVisible(false);
			      }
			}
		});
		CardScreen.add(Card5);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setIcon(new ImageIcon(GameScreen.class.getResource("/l.png")));
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		GroupLayout gl_Top = new GroupLayout(Top);
		gl_Top.setHorizontalGroup(
			gl_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Top.createSequentialGroup()
					.addGap(373)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 363, Short.MAX_VALUE)
					.addGap(386))
		);
		gl_Top.setVerticalGroup(
			gl_Top.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_Top.createSequentialGroup()
					.addComponent(btnNewButton_2)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Top.setLayout(gl_Top);
		
		txtStatusBar = new JTextField();
		txtStatusBar.setEditable(false);
		txtStatusBar.setText("Status Bar");
		txtStatusBar.setColumns(10);
		
		JButton btnDeal = new JButton("Deal");
		btnDeal.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDeal.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton = new JButton("Games");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				GameMenu menu = new GameMenu();
				menu.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Help");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCents = new JButton("25 cents");
		btnCents.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCents.setEnabled(false);
		btnCents.setHorizontalTextPosition(SwingConstants.CENTER);
		String[] creditAmounts = {"1 credit","2 credits","3 credits","4 credits","5 credits"};
		JComboBox bet = new JComboBox(creditAmounts);
		
		bet.setSelectedIndex(0);
		GroupLayout gl_Bottom = new GroupLayout(Bottom);
		gl_Bottom.setHorizontalGroup(
			gl_Bottom.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Bottom.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtStatusBar, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addGap(137)
					.addComponent(btnCents, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(btnDeal, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(57)
					.addComponent(bet, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(195)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(41))
		);
		gl_Bottom.setVerticalGroup(
			gl_Bottom.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Bottom.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Bottom.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(txtStatusBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton)
						.addComponent(bet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeal)
						.addComponent(btnCents))
					.addGap(2))
		);
		Bottom.setLayout(gl_Bottom);
		contentPane.setLayout(gl_contentPane);
	}
}
class BoardTableCellRenderer extends DefaultTableCellRenderer {

	   private static final long serialVersionUID = 1L;

	   public Component getTableCellRendererComponent(JTable table, Object value,
	            boolean isSelected, boolean hasFocus, int row, int col) {
			  Component c = super.getTableCellRendererComponent(table, value,
	               isSelected, hasFocus, row, col);
			 // c.setBackground(value == "Royal Flush" ? Color.LIGHT_GRAY : Color.BLACK);
		  

	      return c;
		  }
	 
}