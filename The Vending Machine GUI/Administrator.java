import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;
public class Administrator implements ActionListener{
	static JFrame frame;
	static JLabel userLabel, passwordLabel, success;
	static JPanel panel;
	static JTextField userText;
	static JPasswordField passwordText;
	static JButton loginButton;
	
	public static void createLoginFrame() {
		
		frame = new JFrame("Vending Machine Administrator Login");
        frame.setBounds(650, 150, 400, 175);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        panel = new JPanel();
        frame.add(panel);
        
        panel.setLayout(null);
        
        userLabel = new JLabel("Username");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        loginButton = new JButton("login");
        loginButton.setBounds(0, 85, 80, 25);
        loginButton.addActionListener(new Administrator());
        panel.add(loginButton);
        
        success = new JLabel("Login Successful");
        success.setBounds(10, 110, 500, 25);
        panel.add(success);
        success.setVisible(false);
        
        frame.setVisible(true);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String username = userText.getText();
		String password = new String(passwordText.getPassword());
		if(username.equals("admin") && password.equals("password123")) {
			success.setVisible(true);
			Timer timer = new Timer();
			TimerTask task = new adminHelper();
			timer.schedule(task, 750);
		}
		else {
			success.setText("Incorrect login attempt. Returning to main menu");
			success.setVisible(true);
			Timer timer = new Timer();
			TimerTask task = new adminHelper();
			timer.schedule(task, 1200);
		}
	}


}
