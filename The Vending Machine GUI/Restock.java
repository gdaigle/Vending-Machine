import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Restock implements ActionListener{
	public static Restock restockMachine = new Restock();
	DecimalFormat df = new DecimalFormat("0.00");
	JFrame frame;
	JPanel panel;
	JLabel lblBalance,lblCollect,lblCokeNumber,lblDietNumber,lblSpriteNumber,lblDpNumber,lblMonsterNumber,lblDasaniNumber;
	JButton btnRestock;
	JButton btnCollect;
	JButton btnExit;
	public void createRestockFrame() {
		frame = new JFrame("Vending Machine Administrator Menu");
		frame.setBounds(500, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblBalance = new JLabel("Current Amount: $" + df.format(VMachineFrame.vmachine.machineBalance));
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBalance.setBounds(125, 20, 500, 25);
		frame.getContentPane().add(lblBalance);
		
		lblCollect = new JLabel("");
		lblCollect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCollect.setBounds(173, 50, 300, 25);
		frame.getContentPane().add(lblCollect);
		
		lblCokeNumber = new JLabel("");
		lblCokeNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCokeNumber.setBounds(145, 250, 300, 25);
		frame.getContentPane().add(lblCokeNumber);
		
		lblDietNumber = new JLabel("");
		lblDietNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDietNumber.setBounds(145, 275, 300, 25);
		frame.getContentPane().add(lblDietNumber);
		
		lblSpriteNumber = new JLabel("");
		lblSpriteNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpriteNumber.setBounds(145, 300, 300, 25);
		frame.getContentPane().add(lblSpriteNumber);
		
		lblDpNumber = new JLabel("");
		lblDpNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDpNumber.setBounds(145, 325, 300, 25);
		frame.getContentPane().add(lblDpNumber);
		
		lblMonsterNumber = new JLabel("");
		lblMonsterNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonsterNumber.setBounds(145, 350, 300, 25);
		frame.getContentPane().add(lblMonsterNumber);

		lblDasaniNumber = new JLabel("");
		lblDasaniNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDasaniNumber.setBounds(145, 375, 300, 25);
		frame.getContentPane().add(lblDasaniNumber);
		
		if(Vend.vend.cokeCount > 1) {
			lblCokeNumber.setText("There are " + Vend.vend.cokeCount + " Cokes left");
		} 
		else if(Vend.vend.cokeCount == 1) {
			lblCokeNumber.setText("There is " + Vend.vend.cokeCount + " Coke left");
		}
		else {
			lblCokeNumber.setText("Coke is out of stock");
		}
		if(Vend.vend.dietCokeCount > 1) {
			lblDietNumber.setText("There are " + Vend.vend.dietCokeCount + " Diet Cokes left");
		} 
		else if(Vend.vend.dietCokeCount == 1) {
			lblDietNumber.setText("There is " + Vend.vend.dietCokeCount + " Diet Coke left");
		}
		else {
			lblDietNumber.setText("Diet Coke is out of stock");
		}
		if(Vend.vend.spriteCount > 1) {
			lblSpriteNumber.setText("There are " + Vend.vend.spriteCount + " Sprites left");
		}
		else if(Vend.vend.spriteCount == 1) {
			lblSpriteNumber.setText("There is " + Vend.vend.spriteCount + " Sprite left");
		}
		else {
			lblSpriteNumber.setText("Sprite is out of stock");
		}
		if(Vend.vend.dpCount > 1) {
			lblDpNumber.setText("There are " + Vend.vend.dpCount + " Dr. Peppers left");
		}
		else if(Vend.vend.dpCount == 1) {
			lblDpNumber.setText("There is " + Vend.vend.dpCount + " Dr. Pepper left");
		}
		else {
			lblDpNumber.setText("Dr. Pepper is out of stock");
		}
		if(Vend.vend.monsterCount > 1) {
			lblMonsterNumber.setText("There are " + Vend.vend.monsterCount + " Monsters left");
		}
		else if(Vend.vend.monsterCount == 1) {
			lblMonsterNumber.setText("There is " + Vend.vend.monsterCount + " Monster left");
		}
		else {
			lblMonsterNumber.setText("Monster is out of stock");
		}
		
		if(Vend.vend.dasaniCount > 1) {
			lblDasaniNumber.setText("There are " + Vend.vend.dasaniCount + " Dasanis left");
		}
		else if(Vend.vend.dasaniCount == 1) {
			lblDasaniNumber.setText("There is " + Vend.vend.dasaniCount + " Dasani left");
		}
		else {
			lblDasaniNumber.setText("Dasani is out of stock");
		}
		
		
		
		btnRestock = new JButton("Restock Machine");
		btnRestock.setBounds(45, 90, 200, 50);
		btnRestock.addActionListener(new Restock());
		frame.getContentPane().add(btnRestock);
		
		btnCollect = new JButton("Collect Money From Machine");
		btnCollect.setBounds(285, 90, 200, 50);
		btnCollect.addActionListener(new Restock());
		frame.getContentPane().add(btnCollect);
		
		btnExit = new JButton("Logout");
		btnExit.addActionListener(new Restock());
		btnExit.setBounds(45, 165, 450, 75);
		frame.getContentPane().add(btnExit);
		
		frame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Restock.restockMachine.btnCollect) {
			VMachineFrame.vmachine.cBalance += VMachineFrame.vmachine.machineBalance;
			Restock.restockMachine.lblCollect.setText("Collected $" + df.format(VMachineFrame.vmachine.machineBalance));
			VMachineFrame.vmachine.machineBalance = 0;
			Restock.restockMachine.lblBalance.setText("Current Amount: $" + df.format(VMachineFrame.vmachine.machineBalance));
			VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
			
		}
		else if(e.getSource() == Restock.restockMachine.btnRestock) {
			Vend.vend.cokeCount = Vend.vend.maxCoke;
			Vend.vend.dietCokeCount = Vend.vend.maxDietCoke;
			Vend.vend.spriteCount = Vend.vend.maxSprite;
			Vend.vend.dpCount = Vend.vend.maxDP;
			Vend.vend.monsterCount = Vend.vend.maxMonster;
			Vend.vend.dasaniCount = Vend.vend.maxDasani;
			Restock.restockMachine.lblCokeNumber.setText("There are " + Vend.vend.cokeCount + " Cokes left");
			Restock.restockMachine.lblDietNumber.setText("There are " + Vend.vend.dietCokeCount + " Diet Cokes left");
			Restock.restockMachine.lblSpriteNumber.setText("There are " + Vend.vend.spriteCount + " Sprites left");
			Restock.restockMachine.lblDpNumber.setText("There are " + Vend.vend.dpCount + " Dr. Peppers left");
			Restock.restockMachine.lblMonsterNumber.setText("There are " + Vend.vend.monsterCount + " Monsters left");
			Restock.restockMachine.lblDasaniNumber.setText("There are " + Vend.vend.dasaniCount + " Monsters left");
		}
		else if(e.getSource() == Restock.restockMachine.btnExit){
			Restock.restockMachine.frame.setVisible(false);
			Timer timer = new Timer();
			TimerTask task = new restockHelper();
			timer.schedule(task, 50);
		}
	}

}
