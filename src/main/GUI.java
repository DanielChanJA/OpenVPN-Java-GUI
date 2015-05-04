package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

	
	
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox_Subregion = new JComboBox();
		comboBox_Subregion.setBounds(252, 219, 223, 32);
		contentPane.add(comboBox_Subregion);

		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(229, 284, 141, 35);
		contentPane.add(btnConnect);
		
		JComboBox comboBox_Region = new JComboBox();
		comboBox_Region.setBounds(252, 153, 223, 32);
		comboBox_Region.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Checks what is selected in the Region combobox and changes the options listed in the subregion combobox.
				if(comboBox_Region.getSelectedItem() == "North Asia") {
					
					//Need to clear the combo box before populating.
					comboBox_Subregion.removeAllItems();
					
					comboBox_Subregion.addItem("Japan - Tokyo");
					comboBox_Subregion.addItem("South Korea - Seoul");
					comboBox_Subregion.addItem("Taiwan - Taipei");
					
					
					
				} else if(comboBox_Region.getSelectedItem() == "South East Asia") {
					
					
					comboBox_Subregion.removeAllItems();
					
					comboBox_Subregion.addItem("Hong Kong - Kowloon");
					comboBox_Subregion.addItem("Singapore - Singapore");
					comboBox_Subregion.addItem("Malaysia - Kuala Lumpur");
					
				} else if(comboBox_Region.getSelectedItem() == "North America") {
					
					
					comboBox_Subregion.removeAllItems();
					
					comboBox_Subregion.addItem("USA - Los Angeles (China Unicom)");
					comboBox_Subregion.addItem("USA - Las Vegas (China Telecom)");
					comboBox_Subregion.addItem("USA - New York");
					comboBox_Subregion.addItem("USA - Atlanta (TBA)");
					comboBox_Subregion.addItem("USA - Dallas (TBA)");
					comboBox_Subregion.addItem("USA - Fremont (TBA)");
					comboBox_Subregion.addItem("USA - Newark (TBA)");
					
					
					
				} else if(comboBox_Region.getSelectedItem() == "South America") {
					
					comboBox_Subregion.removeAllItems();
					
					comboBox_Subregion.addItem("");
					comboBox_Subregion.addItem("");
					

				} else if(comboBox_Region.getSelectedItem() == "West Europe") {
					
					comboBox_Subregion.removeAllItems();
					
					comboBox_Subregion.addItem("Germany - Berlin (TBA)");
					comboBox_Subregion.addItem("France - Paris (TBA)");
					comboBox_Subregion.addItem("Netherlands - Amsterdam (TBA)");
					comboBox_Subregion.addItem("Switzerland - Bern (TBA)");
					
					
				} else if(comboBox_Region.getSelectedItem() == "East Europe") {
					
					comboBox_Subregion.removeAllItems();
					
					comboBox_Subregion.addItem("United Kingdom - London (TBA)");
					comboBox_Subregion.addItem("United Kingdom - Manchester (TBA)");
					
					
				}
				
				
			}
		});
		contentPane.add(comboBox_Region);
		
		//Populate menu items for regions. This will always be p
		comboBox_Region.addItem("North Asia");
		comboBox_Region.addItem("South East Asia");
		comboBox_Region.addItem("North America");
		comboBox_Region.addItem("South America");
		comboBox_Region.addItem("West Europe");
		comboBox_Region.addItem("East Europe");
		
		
		
		
		JLabel WelcomeMessage = new JLabel("Welcome to the OpenVPN Connections Manager");
		WelcomeMessage.setBounds(70, 90, 465, 26);
		WelcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(WelcomeMessage);
		
		JLabel lblVersion = new JLabel("Version 0.01");
		lblVersion.setBounds(508, 317, 115, 26);
		contentPane.add(lblVersion);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setBounds(139, 156, 92, 26);
		lblRegion.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRegion);
		
		JLabel lblServer = new JLabel("Server:");
		lblServer.setBounds(139, 222, 92, 26);
		lblServer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblServer);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
