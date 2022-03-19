import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

//The class and function below handles all the button actions for the vending machine class
public class ButtonListener implements ActionListener{
	DecimalFormat df = new DecimalFormat("0.00");
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == VMachineFrame.vmachine.btnAddMoney) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Money.money.createAddMoneyFrame();
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnCoke) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Vend.vend.vendStuffFrame("Coke");
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnDiet) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Vend.vend.vendStuffFrame("Diet Coke");
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnSprite) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Vend.vend.vendStuffFrame("Sprite");
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnDP) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Vend.vend.vendStuffFrame("Dr. Pepper");
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnMonster) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Vend.vend.vendStuffFrame("Monster");
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnDasani) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Vend.vend.vendStuffFrame("Dasani");
		}
	
		
		else if(e.getSource() == VMachineFrame.vmachine.btnChange) {
			VMachineFrame.vmachine.lblChange.setText("$" + df.format(VMachineFrame.vmachine.cBalance) + " has been returned. Have a great day :)");
			VMachineFrame.vmachine.cBalance = 0;
			VMachineFrame.vmachine.lblBalance.setText("Current Balance: $" + df.format(VMachineFrame.vmachine.cBalance));
			Timer timer = new Timer();
			TimerTask task = new changeHelper();
			timer.schedule(task, 2000);
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnRestock) {
			VMachineFrame.vmachine.frame.setVisible(false);
			Administrator.createLoginFrame();
		}
		else if(e.getSource() == VMachineFrame.vmachine.btnClose) {
			System.exit(0);
		}
	}
}