package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDialog;
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
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

import com.alee.laf.WebLookAndFeel;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;

import java.util.Timer;  
import java.util.TimerTask;



public class GUI extends JFrame {

	
	

	
	String IPAddress;
	
	
	
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
		setBounds(100, 100, 649, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		WebLookAndFeel.install();
		
		IPCheck temp_IP = new IPCheck();
		IPAddress = temp_IP.ipCheck();
		
		
		JComboBox comboBox_Subregion = new JComboBox();
		comboBox_Subregion.setBounds(252, 407, 223, 32);
		contentPane.add(comboBox_Subregion);

		
		//Regions
		ArrayList<String> regions = new ArrayList<>();
		regions.add("North Asia");
		regions.add("South East Asia");
		regions.add("North America");
		regions.add("South America");
		regions.add("West Europe");
		regions.add("East Europe");
		
		
		//North Asia
		ArrayList<String> regionNAsia = new ArrayList<>();
		
		regionNAsia.add("Japan - Tokyo");
		regionNAsia.add("South Korea - Seoul");
		regionNAsia.add("Taiwan - Taipei");
		
		
		//South East Asia
		ArrayList<String> regionSEA = new ArrayList<>();
		
		regionSEA.add("Hong Kong - Kowloon");
		regionSEA.add("Singapore - Singapore");
		regionSEA.add("Malaysia - Kuala Lumpur");
		
		
		//North America
		ArrayList<String> regionNAmerica = new ArrayList<>();
		
		regionNAmerica.add("USA - Los Angeles (China Unicom)");
		regionNAmerica.add("USA - Las Vegas (China Telcom)");
		regionNAmerica.add("USA - New York");
		regionNAmerica.add("USA - Atlanta");
		regionNAmerica.add("USA - Dallas");
		regionNAmerica.add("USA - Fremont");
		regionNAmerica.add("USA - Newark");
		regionNAmerica.add("Canada - Toronto");
		regionNAmerica.add("Canada - Vancouver");
		
		
		//West Europe
		ArrayList<String> regionEUW = new ArrayList<>();
		
		regionEUW.add("Germany - Berlin (TBA)");
		regionEUW.add("France - Paris (TBA)");
		regionEUW.add("Netherlands - Amsterdam (TBA)");
		regionEUW.add("Switzerland - Bern (TBA)");
		
		
		//East Europe
		ArrayList<String> regionEUE = new ArrayList<>();
		
		regionEUE.add("United Kingdom - London (TBA)");
		regionEUE.add("United Kingdom - Manchester (TBA)");
		
		//South America
		ArrayList<String> regionSAmerica = new ArrayList<>();
		
		regionSAmerica.add("This region is not yet implemented.");
		
		//Africa
		ArrayList<String> regionAfrica = new ArrayList<>();
		
		regionAfrica.add("This region is not yet implemented.");
		
		
		
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//IP Update method 1 minute after the connect button is pressed.
				new Timer().schedule(
						new TimerTask() {
							@Override
							public void run() {
								
								IPAddress = temp_IP.ipCheck();
								
							}
						}, 
						60000
						
				);
				
				
				
				//Run certain methods according to which server is selected.
				
			}
		});
		btnConnect.setBounds(139, 473, 141, 35);
		contentPane.add(btnConnect);
		
		JComboBox comboBox_Region = new JComboBox();
		comboBox_Region.setBounds(252, 341, 223, 32);
		comboBox_Region.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Checks what is selected in the Region combobox and changes the options listed in the subregion combobox.
				//TODO: Maybe enable online retrieval?
				if(comboBox_Region.getSelectedItem() == "North Asia") {
					
					//Need to clear the combo box before populating. 
					
		
					comboBox_Subregion.removeAllItems();
					
					for(int i = 0; i < regionNAsia.size(); i++){

						comboBox_Subregion.addItem(regionNAsia.get(i));						
					}
					
				} else if(comboBox_Region.getSelectedItem() == "South East Asia") {
					
					
					comboBox_Subregion.removeAllItems();
					
					for(int i = 0; i < regionSEA.size(); i++){

						comboBox_Subregion.addItem(regionSEA.get(i));						
					}
					
				} else if(comboBox_Region.getSelectedItem() == "North America") {
					
					
					comboBox_Subregion.removeAllItems();
					
					for(int i = 0; i < regionNAmerica.size(); i++){
						
						comboBox_Subregion.addItem(regionNAmerica.get(i));						
					}
					
					
					
				} else if(comboBox_Region.getSelectedItem() == "South America") {
					
					comboBox_Subregion.removeAllItems();
					
					for(int i = 0; i < regionSAmerica.size(); i++){
						
						comboBox_Subregion.addItem(regionSAmerica.get(i));						
					}
					

				} else if(comboBox_Region.getSelectedItem() == "West Europe") {
					
					comboBox_Subregion.removeAllItems();
					
					for(int i = 0; i < regionEUW.size(); i++){
						
						comboBox_Subregion.addItem(regionEUW.get(i));
						
					}
					
					
				} else if(comboBox_Region.getSelectedItem() == "East Europe") {
					
					comboBox_Subregion.removeAllItems();
					
					for(int i = 0; i < regionEUE.size(); i++){

						comboBox_Subregion.addItem(regionEUE.get(i));
						
					}
					
					
				}
				
				
			}
		});
		contentPane.add(comboBox_Region);
		
		//Populate menu items for regions.
		for(int i = 0; i < regions.size(); i++) {
			
			comboBox_Region.addItem(regions.get(i));
			
		}
		
		
		
		
		JLabel WelcomeMessage = new JLabel("Welcome to the OpenVPN Connections Manager");
		WelcomeMessage.setBounds(71, 47, 465, 26);
		WelcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(WelcomeMessage);
		
		JLabel lblVersion = new JLabel("Version 0.01");
		lblVersion.setBounds(508, 567, 115, 26);
		contentPane.add(lblVersion);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setBounds(139, 344, 92, 26);
		lblRegion.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRegion);
		
		JLabel lblServer = new JLabel("Server:");
		lblServer.setBounds(139, 410, 92, 26);
		lblServer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblServer);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 623, 40);
		contentPane.add(menuBar);
		
		JMenuItem mntmPref = new JMenuItem("Preferences");
		mntmPref.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			}
		});
		menuBar.add(mntmPref);
		
		//Check for current IP address.

		JLabel lblIpAddressIs = new JLabel("Current IP Address: " + IPAddress);
		lblIpAddressIs.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblIpAddressIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblIpAddressIs.setBounds(21, 242, 581, 78);
		contentPane.add(lblIpAddressIs);
		
		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBounds(334, 473, 141, 35);
		contentPane.add(btnDisconnect);
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
