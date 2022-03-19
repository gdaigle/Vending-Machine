import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
public class VMachineFrame extends JFrame{
	Random random = new Random();
	private static final long serialVersionUID = 1L;
	public static VMachineFrame vmachine = new VMachineFrame();
	DecimalFormat df = new DecimalFormat("0.00");
	double cBalance;
	double machineBalance = random.nextDouble(1,500);
	final double cokeCost = 1.00;
	final double dietCokeCost = 1.00;
	final double spriteCost = 1.25;
	final double dpCost = 1.25;
	final double monsterCost = 2.25;
	final double dasaniCost = 0.75;
	JFrame frame;
	JPanel panel;
	JLabel lblTitle,lblBalance,lblChange,lblCokePrice,lblDietPrice,lblSpritePrice,lblDpPrice,lblMonsterPrice,lblDasaniPrice;
	JButton btnAddMoney,btnClose,btnCoke,btnDiet,btnSprite,btnDP,btnMonster,btnDasani,btnChange,btnRestock;
	
	
	
	//This function creates the Vending Machine Frame
	public void createVendingFrame() {
		Vend.vend.cokeCount = random.nextInt(1,20);
		Vend.vend.dietCokeCount = random.nextInt(1,20);
		Vend.vend.dpCount = random.nextInt(1,20);
		Vend.vend.monsterCount = random.nextInt(1,20);
		Vend.vend.spriteCount = random.nextInt(1,20);
		Vend.vend.dasaniCount = random.nextInt(1,20);
		frame = new JFrame("Grant Daigle's Vending Machine");
		frame.setBounds(500, 100, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTitle = new JLabel("Welcome to my Vending Machine");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitle.setBounds(136, 11, 330, 28);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTitle);
		
		lblBalance = new JLabel("Current Balance: $" + df.format(vmachine.cBalance));
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBalance.setBounds(173, 88, 200, 25);
		frame.getContentPane().add(lblBalance);
		
		lblCokePrice = new JLabel("$" + df.format(cokeCost));
		lblCokePrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCokePrice.setBounds(173, 162, 89, 25);
		frame.getContentPane().add(lblCokePrice);
		
		lblDietPrice = new JLabel("$" + df.format(dietCokeCost));
		lblDietPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDietPrice.setBounds(173, 237, 89, 25);
		frame.getContentPane().add(lblDietPrice);
		
		lblSpritePrice = new JLabel("$" + df.format(spriteCost));
		lblSpritePrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpritePrice.setBounds(173, 312, 89, 25);
		frame.getContentPane().add(lblSpritePrice);
		
		lblDpPrice = new JLabel("$" + df.format(dpCost));
		lblDpPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDpPrice.setBounds(173, 387, 89, 25);
		frame.getContentPane().add(lblDpPrice);
		
		lblMonsterPrice = new JLabel("$" + df.format(monsterCost));
		lblMonsterPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMonsterPrice.setBounds(173, 462, 89, 25);
		frame.getContentPane().add(lblMonsterPrice);
		
		lblDasaniPrice = new JLabel("$" + df.format(dasaniCost));
		lblDasaniPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDasaniPrice.setBounds(173, 537, 89, 25);
		frame.getContentPane().add(lblDasaniPrice);
		
		lblChange = new JLabel("");
		lblChange.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChange.setBounds(173, 612, 600, 25);
		frame.getContentPane().add(lblChange);
		
		btnAddMoney = new JButton("Add Money");
		btnAddMoney.setBounds(10, 75, 140, 50);
		btnAddMoney.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnAddMoney);
		
		btnCoke = new JButton("Coke");
		btnCoke.setBounds(10, 150, 140, 50);
		btnCoke.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnCoke);
		
		btnDiet = new JButton("Diet Coke");
		btnDiet.setBounds(10, 225, 140, 50);
		btnDiet.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnDiet);
		
		btnSprite = new JButton("Sprite");
		btnSprite.setBounds(10, 300, 140, 50);
		btnSprite.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnSprite);
		
		btnDP = new JButton("Dr. Pepper");
		btnDP.setBounds(10, 375, 140, 50);
		btnDP.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnDP);
		
		btnMonster = new JButton("Monster");
		btnMonster.setBounds(10, 450, 140, 50);
		btnMonster.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnMonster);
		
		btnDasani = new JButton("Dasani");
		btnDasani.setBounds(10, 525, 140, 50);
		btnDasani.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnDasani);
		
		btnChange = new JButton("Get Change");
		btnChange.setBounds(10, 600, 140, 50);
		btnChange.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnChange);
		//10, 75, 140, 50);
		btnRestock = new JButton("Admin Menu");
		btnRestock.setBounds(425, 75, 140, 50);
		btnRestock.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnRestock);
		//10, 150, 140, 50);
		btnClose = new JButton("Exit");
		btnClose.setBounds(425, 150, 140, 50);
		btnClose.addActionListener(new ButtonListener());
		frame.getContentPane().add(btnClose);
		
		
		frame.setVisible(true);
	}
}
