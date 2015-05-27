package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtEnterUsername;
	private JPasswordField pwdEnterPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CreateDialog dialog = new CreateDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CreateDialog() {
		setBounds(100, 100, 737, 573);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsername = new JLabel("Username");
			lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsername.setBounds(136, 176, 172, 26);
			contentPanel.add(lblUsername);
		}
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterUsername.setText("Enter Username");
		txtEnterUsername.setBounds(347, 173, 186, 32);
		contentPanel.add(txtEnterUsername);
		txtEnterUsername.setColumns(10);
		
		pwdEnterPassword = new JPasswordField();
		pwdEnterPassword.setBounds(347, 253, 186, 32);
		contentPanel.add(pwdEnterPassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(136, 256, 172, 26);
		contentPanel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(347, 335, 186, 32);
		contentPanel.add(passwordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setBounds(136, 338, 190, 26);
		contentPanel.add(lblConfirmPassword);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						//TODO:If they do match, create a username and password file for OpenVPN. This must be in a text file.
						
						if(pwdEnterPassword.equals(passwordField)) {
							
							//Create file for username and password storage.
							
							
						} else {
							
							//Throw error.
							
							
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
