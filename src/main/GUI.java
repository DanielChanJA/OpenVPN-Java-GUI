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
		setBounds(100, 100, 649, 836);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox_Subregion = new JComboBox();
		comboBox_Subregion.setBounds(264, 494, 223, 32);
		contentPane.add(comboBox_Subregion);

		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(241, 559, 141, 35);
		contentPane.add(btnConnect);
		
		JComboBox comboBox_Region = new JComboBox();
		comboBox_Region.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Checks what is selected in the Region combobox and changes the options listed in the subregion combobox.
				if(comboBox_Region.getSelectedItem() == "North Asia") {
					
					comboBox_Subregion.addItem("Japan - Tokyo");
					comboBox_Subregion.addItem("South Korea - Seoul");
					
					
				}
				
				
			}
		});
		comboBox_Region.setBounds(264, 428, 223, 32);
		contentPane.add(comboBox_Region);
		
		//Populate menu items for regions.
		comboBox_Region.addItem("North Asia");
		comboBox_Region.addItem("South East Asia");
		comboBox_Region.addItem("North America");
		comboBox_Region.addItem("South America");
		comboBox_Region.addItem("West Europe");
		comboBox_Region.addItem("East Europe");
		
		
		
		
		JLabel WelcomeMessage = new JLabel("Welcome to the OpenVPN Connections Manager");
		WelcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeMessage.setBounds(70, 90, 465, 26);
		contentPane.add(WelcomeMessage);
		
		JLabel lblVersion = new JLabel("Version 0.01");
		lblVersion.setBounds(508, 739, 115, 26);
		contentPane.add(lblVersion);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegion.setBounds(151, 431, 92, 26);
		contentPane.add(lblRegion);
		
		JLabel lblServer = new JLabel("Server:");
		lblServer.setHorizontalAlignment(SwingConstants.CENTER);
		lblServer.setBounds(151, 497, 92, 26);
		contentPane.add(lblServer);
	}
}
