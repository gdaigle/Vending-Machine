import java.util.TimerTask;
public class adminHelper extends TimerTask{
	public void run() {
		if(Administrator.success.getText().contains("Successful")) {
			Administrator.frame.setVisible(false);
			Restock.restockMachine.createRestockFrame();
		}
		else {
			Administrator.frame.setVisible(false);
			VMachineFrame.vmachine.frame.setVisible(true);
		}	
	}
}
