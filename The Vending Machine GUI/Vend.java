import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vend implements ActionListener {
	DecimalFormat df = new DecimalFormat("0.00");
	public static Vend vend = new Vend();
	static JFrame frame;
	static JLabel lblVendDrink;
	static JPanel panel;
	static JButton btnClose;
	
	final int maxCoke = 20;
	final int maxDietCoke = 20;
	final int maxSprite = 20;
	final int maxDP = 20;
	final int maxMonster = 20;
	final int maxDasani = 20;
	int cokeCount;
	int dietCokeCount;
	int spriteCount;
	int dpCount;
	int monsterCount;
	int dasaniCount;
	
	public void vendStuffFrame(String drink) {
		
		frame = new JFrame(drink);
		frame.setBounds(650, 150, 400, 175);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        panel = new JPanel();
        frame.add(panel);
        lblVendDrink = new JLabel("");
        lblVendDrink.setBounds(10,20,350,25);
        panel.add(lblVendDrink);
        
        panel.setLayout(null);
        if(drink.equals("Coke")) {
        	if(cokeCount > 0) {
        		if(VMachineFrame.vmachine.cBalance >= VMachineFrame.vmachine.cokeCost) {
        			lblVendDrink.setText(drink + " dispensed. Enjoy!");
                	cokeCount--;
                	VMachineFrame.vmachine.cBalance -= VMachineFrame.vmachine.cokeCost;
                	VMachineFrame.vmachine.machineBalance += VMachineFrame.vmachine.cokeCost;
                	VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
        		}else {
        			lblVendDrink.setText("You do not have enough money. " + drink + " costs $" + df.format(VMachineFrame.vmachine.cokeCost) );
        		}
        			
                	
        	}else {
        		lblVendDrink.setText(drink + " is currently out of stock");
        	}
        }
       
        else if(drink.equals("Diet Coke")) {
        	if(dietCokeCount > 0) {
        		if(VMachineFrame.vmachine.cBalance >= VMachineFrame.vmachine.dietCokeCost) {
        			lblVendDrink.setText(drink + " dispensed. Enjoy!");
        			dietCokeCount--;
                	VMachineFrame.vmachine.cBalance -= VMachineFrame.vmachine.dietCokeCost;
                	VMachineFrame.vmachine.machineBalance += VMachineFrame.vmachine.dietCokeCost;
                	VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
        		}else {
        			lblVendDrink.setText("You do not have enough money. " + drink + " costs $" + df.format(VMachineFrame.vmachine.dietCokeCost) );
        		}
        			
                	
        	}else {
        		lblVendDrink.setText(drink + " is currently out of stock");
        	}
        }
        
        else if(drink.equals("Sprite")) {
        	if(spriteCount > 0) {
        		if(VMachineFrame.vmachine.cBalance >= VMachineFrame.vmachine.spriteCost) {
        			lblVendDrink.setText(drink + " dispensed. Enjoy!");
        			spriteCount--;
                	VMachineFrame.vmachine.cBalance -= VMachineFrame.vmachine.spriteCost;
                	VMachineFrame.vmachine.machineBalance += VMachineFrame.vmachine.spriteCost;
                	VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
        		}else {
        			lblVendDrink.setText("You do not have enough money. " + drink + " costs $" + df.format(VMachineFrame.vmachine.spriteCost) );
        		}
        			
                	
        	}else {
        		lblVendDrink.setText(drink + " is currently out of stock");
        	}
        }
        
        
        else if(drink.equals("Dr. Pepper")) {
        	if(dpCount > 0) {
        		if(VMachineFrame.vmachine.cBalance >= VMachineFrame.vmachine.dpCost) {
        			lblVendDrink.setText(drink + " dispensed. Enjoy!");
        			dpCount--;
                	VMachineFrame.vmachine.cBalance -= VMachineFrame.vmachine.dpCost;
                	VMachineFrame.vmachine.machineBalance += VMachineFrame.vmachine.dpCost;
                	VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
        		}else {
        			lblVendDrink.setText("You do not have enough money. " + drink + " costs $" + df.format(VMachineFrame.vmachine.dpCost));
        		}
        			
                	
        	}else {
        		lblVendDrink.setText(drink + " is currently out of stock");
        	}
        }
        
        else if(drink.equals("Monster")) {
        	if(monsterCount > 0) {
        		if(VMachineFrame.vmachine.cBalance >= VMachineFrame.vmachine.monsterCost) {
        			lblVendDrink.setText(drink + " dispensed. Enjoy!");
        			monsterCount--;
                	VMachineFrame.vmachine.cBalance -= VMachineFrame.vmachine.monsterCost;
                	VMachineFrame.vmachine.machineBalance += VMachineFrame.vmachine.monsterCost;
                	VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
        		}else {
        			lblVendDrink.setText("You do not have enough money. " + drink + " costs $" + df.format(VMachineFrame.vmachine.monsterCost));
        		}
        	}else {
        		lblVendDrink.setText(drink + " is currently out of stock");
        	}
        }
        else if(drink.equals("Dasani")) {
        	if(dasaniCount > 0) {
        		if(VMachineFrame.vmachine.cBalance >= VMachineFrame.vmachine.dasaniCost) {
        			lblVendDrink.setText(drink + " dispensed. Enjoy!");
        			dasaniCount--;
                	VMachineFrame.vmachine.cBalance -= VMachineFrame.vmachine.dasaniCost;
                	VMachineFrame.vmachine.machineBalance += VMachineFrame.vmachine.dasaniCost;
                	VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
        		}else {
        			lblVendDrink.setText("You do not have enough money. " + drink + " costs $" + df.format(VMachineFrame.vmachine.dasaniCost));
        		}
        			
                	
        	}else {
        		lblVendDrink.setText(drink + " is currently out of stock");
        	}
        }
        btnClose = new JButton("Close");
        btnClose.setBounds(10, 80, 80, 25);
        btnClose.addActionListener(new Vend());
        panel.add(btnClose);
        frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setVisible(false);
		VMachineFrame.vmachine.frame.setVisible(true);
	}
}