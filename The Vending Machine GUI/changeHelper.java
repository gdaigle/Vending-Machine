import java.util.TimerTask;
public class changeHelper extends TimerTask {
	@Override
	public void run() {
		VMachineFrame.vmachine.lblChange.setText("");
	}
}