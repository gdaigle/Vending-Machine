import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Money implements ActionListener{
	public static Money money = new Money();
	DecimalFormat df = new DecimalFormat("0.00");
	JFrame frame;
	JPanel panel;
	JLabel lblBalance;
	JButton btnAddDollar;
	JButton btnAddQuater;
	JButton btnAddDime;
	JButton btnAddNickel;
	JButton btnExit;
	//Creates Add Money frame
	public void createAddMoneyFrame() {
		frame = new JFrame("Add Money to the machine");
		frame.setBounds(500, 100, 500, 399);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblBalance = new JLabel("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblBalance.setBounds(125, 25, 500, 50);
		frame.getContentPane().add(lblBalance);
		
		btnAddDollar = new JButton("Add Dollar");
		btnAddDollar.setBounds(25, 99, 200, 50);
		btnAddDollar.addActionListener(new Money());
		frame.getContentPane().add(btnAddDollar);
		
		btnAddQuater = new JButton("Add Quater");
		btnAddQuater.setBounds(265, 99, 200, 50);
		btnAddQuater.addActionListener(new Money());
		frame.getContentPane().add(btnAddQuater);
		
		btnAddDime = new JButton("Add Dime");
		btnAddDime.setBounds(25, 166, 200, 50);
		btnAddDime.addActionListener(new Money());
		frame.getContentPane().add(btnAddDime);
		
		btnAddNickel = new JButton("Add Nickel");
		btnAddNickel.addActionListener(new Money());
		btnAddNickel.setBounds(265, 166, 200, 50);
		
		frame.getContentPane().add(btnAddNickel);
		
		btnExit = new JButton("Go back to previous page");
		btnExit.setBounds(25, 241, 440, 75);
		btnExit.addActionListener(new Money());
		frame.getContentPane().add(btnExit);
		frame.setVisible(true);
	}
	//Function below handles all button interactions within the add money frame
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Money.money.btnAddDollar) {
			VMachineFrame.vmachine.cBalance += 1.00;
			VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
			Money.money.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
		}
		else if(e.getSource() == Money.money.btnAddQuater) {
			VMachineFrame.vmachine.cBalance += 0.25;
			VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
			Money.money.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
		}
		else if(e.getSource() == Money.money.btnAddDime) {
			VMachineFrame.vmachine.cBalance += 0.10;
			VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
			Money.money.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
		}
		else if(e.getSource() == Money.money.btnAddNickel) {
			VMachineFrame.vmachine.cBalance += 0.05;
			VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
			Money.money.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
		}
		else if(e.getSource() == Money.money.btnExit) {
			Money.money.frame.setVisible(false);
			VMachineFrame.vmachine.frame.setVisible(true);
		}
	}
}
